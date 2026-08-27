import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eww extends gpb {
   private static final Logger a = LogUtils.getLogger();
   private static final gpc b = new gpc(Duration.ofSeconds(5L));
   private final List<eyg> c;
   private final fhf v;
   private final fex w = fex.d();
   private volatile vu x;
   @Nullable
   private fbv y;

   public eww(fhf $$0, eyg... $$1) {
      super(eyy.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (eyg $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new ewa(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.y != null) {
         b.a(this.f.aY(), this.y.x());
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
      this.w.c().b();
      this.y = new fbv(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(fbg.a(vt.e, $$0 -> this.f()).a());
      this.w.a($$1 -> {
         fbe var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      fer.a(this.w, this.F());
   }

   protected void f() {
      for (eyg $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(vu $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
