import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzw extends dyc {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "";
   private static final boolean c = false;
   private ecp d;
   private String e = "";
   private boolean f = false;
   private boolean g;

   public dzw(iv $$0, ebe $$1) {
      super(dye.T, $$0, $$1);
      this.d = $$1.c(dvw.b);
   }

   @Override
   public void b(tz $$0, jh.a $$1) {
      $$0.a("mode", ecp.e, this.d);
      $$0.a("message", this.e);
      $$0.a("powered", this.f);
   }

   @Override
   public void a(tz $$0, jh.a $$1) {
      this.d = $$0.<ecp>a("mode", ecp.e).orElse(ecp.c);
      this.e = $$0.b("message", "");
      this.f = $$0.b("powered", false);
   }

   private void u() {
      if (this.n != null) {
         iv $$0 = this.aB_();
         ebe $$1 = this.n.a_($$0);
         if ($$1.a(dne.pI)) {
            this.n.a($$0, $$1.b(dvw.b, this.d), 2);
         }
      }
   }

   @Nullable
   public acc a() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return this.e($$0);
   }

   public boolean c() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.f = $$0;
   }

   public ecp d() {
      return this.d;
   }

   public void a(ecp $$0) {
      this.d = $$0;
      this.u();
   }

   private dnc v() {
      return this.m().b();
   }

   public void f() {
      this.g = false;
      if (this.d == ecp.a && this.n != null) {
         this.a(false);
         this.n.a(this.aB_(), this.v());
      }
   }

   public void j() {
      if (this.d == ecp.a && this.n != null) {
         this.a(true);
         iv $$0 = this.aB_();
         this.n.a($$0, this.v());
         this.n.U().b($$0, this.v());
         this.k();
      } else {
         if (this.d == ecp.b) {
            this.k();
         }

         this.g = true;
      }
   }

   public void k() {
      if (!this.e.isBlank()) {
         a.info("Test {} (at {}): {}", new Object[]{this.d.c(), this.aB_(), this.e});
      }
   }

   public boolean s() {
      return this.g;
   }

   public String t() {
      return this.e;
   }

   public void a(String $$0) {
      this.e = $$0;
   }
}
