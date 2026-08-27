import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epe extends gfx {
   private static final Logger a = LogUtils.getLogger();
   private static final gfy b = new gfy(Duration.ofSeconds(5L));
   private final List<eqo> c;
   private final ezd y;
   private final ewx z = ewx.d();
   private volatile ui A;
   @Nullable
   private ety B;

   public epe(ezd $$0, eqo... $$1) {
      super(erg.a);
      this.y = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.A = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (eqo $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new eoi(a));
         $$3.start();
      }
   }

   @Override
   public void d() {
      super.d();
      if (this.B != null) {
         b.a(this.f.aV(), this.B.l());
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
   public void aM_() {
      this.z.c().b();
      this.B = new ety(this.i, this.A);
      this.z.a(this.B, $$0 -> $$0.e(30));
      this.z.a(etj.a(uh.e, $$0 -> this.e()).a());
      this.z.a($$1 -> {
         eth var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      ewr.a(this.z, this.s());
   }

   protected void e() {
      for (eqo $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.y);
   }

   public void a(ui $$0) {
      if (this.B != null) {
         this.B.b($$0);
      }

      this.A = $$0;
   }
}
