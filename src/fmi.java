import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmi extends hpb {
   private static final Logger a = LogUtils.getLogger();
   private static final hpc b = new hpc(Duration.ofSeconds(5L));
   private final List<fnp> c;
   private final fxu C;
   private final fvu D = fvu.d();
   private volatile wy E;
   @Nullable
   private fsr F;

   public fmi(fxu $$0, fnp... $$1) {
      super(foi.a);
      this.C = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.E = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (fnp $$1x : $$1) {
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
         $$3.setUncaughtExceptionHandler(new flm(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.F != null) {
         b.a(this.m.aY(), this.F.B());
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
      this.D.c().b();
      this.F = new fsr(this.p, this.E);
      this.D.a(this.F, $$0 -> $$0.e(30));
      this.D.a(fsc.a(wx.e, $$0 -> this.f()).a());
      this.D.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fvo.a(this.D, this.J());
   }

   protected void f() {
      for (fnp $$0 : this.c) {
         $$0.b();
      }

      this.m.a(this.C);
   }

   public void a(wy $$0) {
      if (this.F != null) {
         this.F.b($$0);
      }

      this.E = $$0;
   }
}
