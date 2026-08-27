import com.mojang.logging.LogUtils;
import java.time.Duration;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoe extends gei implements enm {
   private static final gej b = new gej(Duration.ofSeconds(5L));
   private static final Logger c = LogUtils.getLogger();
   private final exz y;
   private volatile tf z = te.a;
   @Nullable
   private volatile tf A;
   private volatile boolean B;
   private int C;
   private final epm D;
   private final int E = 212;
   private esh F;
   public static final String[] a = new String[]{
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ _ _ ▃ ▄ ▅ ▆ ▇ █",
      "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇",
      "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆",
      "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅",
      "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄",
      "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "█ ▇ ▆ ▅ ▄ ▃ _ _ _ _ _",
      "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _",
      "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _",
      "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _",
      "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _"
   };

   public eoe(exz $$0, epm $$1) {
      super(eqe.a);
      this.y = $$0;
      this.D = $$1;
      $$1.a(this);
      Thread $$2 = new Thread($$1, "Realms-long-running-task");
      $$2.setUncaughtExceptionHandler(new enh(c));
      $$2.start();
   }

   @Override
   public void c() {
      super.c();
      b.a(this.f.aV(), this.z);
      this.C++;
      this.D.b();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.B();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void aE_() {
      this.D.d();
      this.F = this.d(esh.a(te.e, $$0 -> this.B()).a(this.g / 2 - 106, h(12), 212, 20).a());
   }

   private void B() {
      this.B = true;
      this.D.a();
      this.f.a(this.y);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.z, this.g / 2, h(3), 16777215);
      tf $$4 = this.A;
      if ($$4 == null) {
         $$0.a(this.i, a[this.C % a.length], this.g / 2, h(8), -8355712);
      } else {
         $$0.a(this.i, $$4, this.g / 2, h(8), 16711680);
      }
   }

   @Override
   public void a(tf $$0) {
      this.A = $$0;
      this.f.aV().c($$0);
      this.f.execute(() -> {
         this.f(this.F);
         this.F = this.d(esh.a(te.k, $$0x -> this.B()).a(this.g / 2 - 106, this.h / 4 + 120 + 12, 200, 20).a());
      });
   }

   public void b(tf $$0) {
      this.z = $$0;
   }

   public boolean f() {
      return this.B;
   }
}
