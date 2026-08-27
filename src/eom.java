import com.mojang.logging.LogUtils;
import java.time.Duration;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eom extends gfb {
   private static final Logger a = LogUtils.getLogger();
   private static final gfc b = new gfc(Duration.ofSeconds(5L));
   private epv c;
   private final eyk y;
   private volatile tl z = tk.a;
   private final ewd A = ewd.d();
   @Nullable
   private etf B;

   public eom(eyk $$0, epv $$1) {
      super(eqn.a);
      this.y = $$0;
      this.c = $$1;
      this.a($$1.a());
      Thread $$2 = new Thread($$1, "Realms-long-running-task");
      $$2.setUncaughtExceptionHandler(new enq(a));
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
   public void aI_() {
      this.A.c().b();
      this.B = new etf(this.i, this.z);
      this.A.a(this.B, $$0 -> $$0.e(30));
      this.A.a(esq.a(tk.e, $$0 -> this.e()).a());
      this.A.a($$1 -> {
         eso var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.A.a();
      evx.a(this.A, this.s());
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
