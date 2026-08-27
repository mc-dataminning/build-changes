import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esq extends gkc {
   private static final Logger a = LogUtils.getLogger();
   private static final gkd b = new gkd(Duration.ofSeconds(5L));
   private final List<eua> c;
   private final fct v;
   private final fam w = fam.d();
   private volatile vd x;
   @Nullable
   private exn y;

   public esq(fct $$0, eua... $$1) {
      super(eus.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (eua $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new eru(a));
         $$3.start();
      }
   }

   @Override
   public void d() {
      super.d();
      if (this.y != null) {
         b.a(this.f.aU(), this.y.x());
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
      this.y = new exn(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(ewy.a(vc.e, $$0 -> this.e()).a());
      this.w.a($$1 -> {
         eww var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      fag.a(this.w, this.F());
   }

   protected void e() {
      for (eua $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(vd $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
