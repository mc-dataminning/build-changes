import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhp extends hff {
   private static final Logger a = LogUtils.getLogger();
   private static final hfg b = new hfg(Duration.ofSeconds(5L));
   private final List<fiw> c;
   private final frp B;
   private final fpp C = fpp.d();
   private volatile xl D;
   @Nullable
   private fml E;

   public fhp(frp $$0, fiw... $$1) {
      super(fjo.a);
      this.B = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.D = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (fiw $$1x : $$1) {
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
         $$3.setUncaughtExceptionHandler(new fgt(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.E != null) {
         b.a(this.m.aZ(), this.E.z());
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
   public void aS_() {
      this.C.c().b();
      this.E = new fml(this.p, this.D);
      this.C.a(this.E, $$0 -> $$0.e(30));
      this.C.a(flw.a(xk.e, $$0 -> this.f()).a());
      this.C.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      fpj.a(this.C, this.H());
   }

   protected void f() {
      for (fiw $$0 : this.c) {
         $$0.b();
      }

      this.m.a(this.B);
   }

   public void a(xl $$0) {
      if (this.E != null) {
         this.E.b($$0);
      }

      this.D = $$0;
   }
}
