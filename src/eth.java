import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eth extends gld {
   private static final Logger a = LogUtils.getLogger();
   private static final gle b = new gle(Duration.ofSeconds(5L));
   private final List<eur> c;
   private final fdm v;
   private final fbf w = fbf.d();
   private volatile vg x;
   @Nullable
   private eyg y;

   public eth(fdm $$0, eur... $$1) {
      super(evj.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (eur $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new esl(a));
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
         this.b();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void aP_() {
      this.w.c().b();
      this.y = new eyg(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(exr.a(vf.e, $$0 -> this.b()).a());
      this.w.a($$1 -> {
         exp var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      faz.a(this.w, this.F());
   }

   protected void b() {
      for (eur $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(vg $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
