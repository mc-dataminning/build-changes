import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqt extends ghr {
   private static final Logger a = LogUtils.getLogger();
   private static final ghs b = new ghs(Duration.ofSeconds(5L));
   private final List<esd> c;
   private final fau v;
   private final eyn w = eyn.d();
   private volatile ur x;
   @Nullable
   private evo y;

   public eqt(fau $$0, esd... $$1) {
      super(esv.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (esd $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new epx(a));
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
   public void aP_() {
      this.w.c().b();
      this.y = new evo(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(euz.a(uq.e, $$0 -> this.e()).a());
      this.w.a($$1 -> {
         eux var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      eyh.a(this.w, this.s());
   }

   protected void e() {
      for (esd $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(ur $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
