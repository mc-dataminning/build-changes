import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdj extends gvs {
   private static final Logger a = LogUtils.getLogger();
   private static final gvt b = new gvt(Duration.ofSeconds(5L));
   private final List<fet> c;
   private final fnj A;
   private final flj B = flj.d();
   private volatile wu C;
   @Nullable
   private fih D;

   public fdj(fnj $$0, fet... $$1) {
      super(ffl.a);
      this.A = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.C = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (fet $$1x : $$1) {
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
         $$3.setUncaughtExceptionHandler(new fcn(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.D != null) {
         b.a(this.l.aX(), this.D.z());
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
   public void aP_() {
      this.B.c().b();
      this.D = new fih(this.o, this.C);
      this.B.a(this.D, $$0 -> $$0.e(30));
      this.B.a(fhs.a(wt.e, $$0 -> this.f()).a());
      this.B.a($$1 -> {
         fhq var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fld.a(this.B, this.H());
   }

   protected void f() {
      for (fet $$0 : this.c) {
         $$0.b();
      }

      this.l.a(this.A);
   }

   public void a(wu $$0) {
      if (this.D != null) {
         this.D.b($$0);
      }

      this.C = $$0;
   }
}
