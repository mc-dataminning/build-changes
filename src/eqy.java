import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqy extends ghw {
   private static final Logger a = LogUtils.getLogger();
   private static final ghx b = new ghx(Duration.ofSeconds(5L));
   private final List<esi> c;
   private final faz v;
   private final eys w = eys.d();
   private volatile uv x;
   @Nullable
   private evt y;

   public eqy(faz $$0, esi... $$1) {
      super(eta.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (esi $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new eqc(a));
         $$3.start();
      }
   }

   @Override
   public void d() {
      super.d();
      if (this.y != null) {
         b.a(this.f.aU(), this.y.l());
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
   public void aQ_() {
      this.w.c().b();
      this.y = new evt(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(eve.a(uu.e, $$0 -> this.e()).a());
      this.w.a($$1 -> {
         evc var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      eym.a(this.w, this.s());
   }

   protected void e() {
      for (esi $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(uv $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
