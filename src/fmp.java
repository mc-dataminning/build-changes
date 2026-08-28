import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmp extends hpj {
   private static final Logger a = LogUtils.getLogger();
   private static final hpk b = new hpk(Duration.ofSeconds(5L));
   private final List<fnw> c;
   private final fyb C;
   private final fwb D = fwb.d();
   private volatile wy E;
   @Nullable
   private fsy F;

   public fmp(fyb $$0, fnw... $$1) {
      super(fop.a);
      this.C = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.E = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (fnw $$1x : $$1) {
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
         $$3.setUncaughtExceptionHandler(new flt(a));
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
   public void aO_() {
      this.D.c().b();
      this.F = new fsy(this.p, this.E);
      this.D.a(this.F, $$0 -> $$0.e(30));
      this.D.a(fsj.a(wx.e, $$0 -> this.f()).a());
      this.D.a($$1 -> {
         fsh var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      fvv.a(this.D, this.J());
   }

   protected void f() {
      for (fnw $$0 : this.c) {
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
