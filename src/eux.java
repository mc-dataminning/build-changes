import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eux extends gmv {
   private static final Logger a = LogUtils.getLogger();
   private static final gmw b = new gmw(Duration.ofSeconds(5L));
   private final List<ewh> c;
   private final ffe v;
   private final fcx w = fcx.d();
   private volatile vq x;
   @Nullable
   private ezw y;

   public eux(ffe $$0, ewh... $$1) {
      super(ewz.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (ewh $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new eub(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.y != null) {
         b.a(this.f.aW(), this.y.x());
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
   public void aQ_() {
      this.w.c().b();
      this.y = new ezw(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(ezh.a(vp.e, $$0 -> this.f()).a());
      this.w.a($$1 -> {
         ezf var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      fcr.a(this.w, this.F());
   }

   protected void f() {
      for (ewh $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(vq $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
