import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezf extends grl {
   private static final Logger a = LogUtils.getLogger();
   private static final grm b = new grm(Duration.ofSeconds(5L));
   private final List<fap> c;
   private final fjo y;
   private final fhg z = fhg.d();
   private volatile wg A;
   @Nullable
   private fee B;

   public ezf(fjo $$0, fap... $$1) {
      super(fbh.a);
      this.y = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.A = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (fap $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
               if ($$1x.d()) {
                  return;
               }
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new eyj(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.B != null) {
         b.a(this.j.aY(), this.B.y());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void aN_() {
      this.z.c().b();
      this.B = new fee(this.m, this.A);
      this.z.a(this.B, $$0 -> $$0.e(30));
      this.z.a(fdp.a(wf.e, $$0 -> this.f()).a());
      this.z.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      fha.a(this.z, this.G());
   }

   protected void f() {
      for (fap $$0 : this.c) {
         $$0.b();
      }

      this.j.a(this.y);
   }

   public void a(wg $$0) {
      if (this.B != null) {
         this.B.b($$0);
      }

      this.A = $$0;
   }
}
