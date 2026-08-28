import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzg extends dxm {
   private static final Logger a = LogUtils.getLogger();
   private ebz b;
   private String c = "";
   private boolean d;
   private boolean e;

   public dzg(iv $$0, eao $$1) {
      super(dxo.T, $$0, $$1);
      this.b = $$1.c(dvg.b);
   }

   @Override
   public void b(tz $$0, jh.a $$1) {
      $$0.a("mode", ebz.e, this.b);
      $$0.a("message", this.c);
      $$0.a("powered", this.d);
   }

   @Override
   public void a(tz $$0, jh.a $$1) {
      this.b = $$0.<ebz>a("mode", ebz.e).orElse(ebz.c);
      this.c = $$0.j("message");
      this.d = $$0.o("powered");
   }

   private void u() {
      if (this.n != null) {
         iv $$0 = this.ax_();
         eao $$1 = this.n.a_($$0);
         if ($$1.a(dmo.pI)) {
            this.n.a($$0, $$1.b(dvg.b, this.b), 2);
         }
      }
   }

   @Nullable
   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public boolean c() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public ebz d() {
      return this.b;
   }

   public void a(ebz $$0) {
      this.b = $$0;
      this.u();
   }

   private dmm v() {
      return this.m().b();
   }

   public void f() {
      this.e = false;
      if (this.b == ebz.a && this.n != null) {
         this.a(false);
         this.n.a(this.ax_(), this.v());
      }
   }

   public void j() {
      if (this.b == ebz.a && this.n != null) {
         this.a(true);
         iv $$0 = this.ax_();
         this.n.a($$0, this.v());
         this.n.U().b($$0, this.v());
         this.k();
      } else {
         if (this.b == ebz.b) {
            this.k();
         }

         this.e = true;
      }
   }

   public void k() {
      if (!this.c.isBlank()) {
         a.info("Test {} (at {}): {}", new Object[]{this.b.c(), this.ax_(), this.c});
      }
   }

   public boolean s() {
      return this.e;
   }

   public String t() {
      return this.c;
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
