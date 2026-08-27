import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esx extends gko {
   private static final Logger a = LogUtils.getLogger();
   private static final gkp b = new gkp(Duration.ofSeconds(5L));
   private final List<euh> c;
   private final fda v;
   private final fat w = fat.d();
   private volatile vf x;
   @Nullable
   private exu y;

   public esx(fda $$0, euh... $$1) {
      super(euz.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (euh $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new esb(a));
         $$3.start();
      }
   }

   @Override
   public void d() {
      super.d();
      if (this.y != null) {
         b.a(this.f.aV(), this.y.x());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.e();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void aN_() {
      this.w.c().b();
      this.y = new exu(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(exf.a(ve.e, $$0 -> this.e()).a());
      this.w.a($$1 -> {
         exd var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      fan.a(this.w, this.F());
   }

   protected void e() {
      for (euh $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(vf $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
