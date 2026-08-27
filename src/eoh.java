import com.mojang.logging.LogUtils;
import java.time.Duration;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoh extends gew {
   private static final Logger a = LogUtils.getLogger();
   private static final gex b = new gex(Duration.ofSeconds(5L));
   private epq c;
   private final eyf y;
   private volatile ti z = th.a;
   private final evy A = evy.d();
   @Nullable
   private eta B;

   public eoh(eyf $$0, epq $$1) {
      super(eqi.a);
      this.y = $$0;
      this.c = $$1;
      this.a($$1.a());
      Thread $$2 = new Thread($$1, "Realms-long-running-task");
      $$2.setUncaughtExceptionHandler(new enl(a));
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
   public void aD_() {
      this.A.c().b();
      this.B = new eta(this.i, this.z);
      this.A.a(this.B, $$0 -> $$0.e(30));
      this.A.a(esl.a(th.e, $$0 -> this.e()).a());
      this.A.a($$1 -> {
         esj var10000 = this.d($$1);
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

   public void a(ti $$0) {
      if (this.B != null) {
         this.B.b($$0);
      }

      this.z = $$0;
   }
}
