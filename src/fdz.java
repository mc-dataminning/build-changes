import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdz extends gxb {
   private static final Logger a = LogUtils.getLogger();
   private static final gxc b = new gxc(Duration.ofSeconds(5L));
   private final List<ffj> c;
   private final fon B;
   private final fme C = fme.d();
   private volatile xe D;
   @Nullable
   private fjc E;

   public fdz(fon $$0, ffj... $$1) {
      super(fgb.a);
      this.B = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.D = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (ffj $$1x : $$1) {
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
         $$3.setUncaughtExceptionHandler(new fdd(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.E != null) {
         b.a(this.m.aZ(), this.E.y());
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
      this.C.c().b();
      this.E = new fjc(this.p, this.D);
      this.C.a(this.E, $$0 -> $$0.e(30));
      this.C.a(fin.a(xd.e, $$0 -> this.f()).a());
      this.C.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      fly.a(this.C, this.G());
   }

   protected void f() {
      for (ffj $$0 : this.c) {
         $$0.b();
      }

      this.m.a(this.B);
   }

   public void a(xe $$0) {
      if (this.E != null) {
         this.E.b($$0);
      }

      this.D = $$0;
   }
}
