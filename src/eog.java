import com.mojang.logging.LogUtils;
import java.time.Duration;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eog extends gex {
   private static final Logger a = LogUtils.getLogger();
   private static final gey b = new gey(Duration.ofSeconds(5L));
   private epp c;
   private final eye y;
   private volatile tl z = tk.a;
   private final evy A = evy.d();
   @Nullable
   private esz B;

   public eog(eye $$0, epp $$1) {
      super(eqh.a);
      this.y = $$0;
      this.c = $$1;
      this.a($$1.a());
      Thread $$2 = new Thread($$1, "Realms-long-running-task");
      $$2.setUncaughtExceptionHandler(new enk(a));
      $$2.start();
   }

   @Override
   public void c() {
      super.c();
      b.a(this.f.aV(), this.B.m());
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
   public void aH_() {
      this.A.c().b();
      this.B = new esz(this.i, this.z);
      this.A.a(this.B, $$0 -> $$0.e(30));
      this.A.a(esk.a(tk.e, $$0 -> this.e()).a());
      this.A.a($$1 -> {
         esi var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.A.a();
      evs.a(this.A, this.s());
   }

   protected void e() {
      this.c.b();
      this.f.a(this.y);
   }

   public void a(tl $$0) {
      if (this.B != null) {
         this.B.b($$0);
      }

      this.z = $$0;
   }
}
