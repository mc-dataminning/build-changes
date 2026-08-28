import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eai extends dyo {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "";
   private static final boolean c = false;
   private edb d;
   private String e = "";
   private boolean f = false;
   private boolean g;

   public eai(iw $$0, ebq $$1) {
      super(dyq.T, $$0, $$1);
      this.d = $$1.c(dwi.b);
   }

   @Override
   public void b(ua $$0, ji.a $$1) {
      $$0.a("mode", edb.e, this.d);
      $$0.a("message", this.e);
      $$0.a("powered", this.f);
   }

   @Override
   public void a(ua $$0, ji.a $$1) {
      this.d = $$0.<edb>a("mode", edb.e).orElse(edb.c);
      this.e = $$0.b("message", "");
      this.f = $$0.b("powered", false);
   }

   private void u() {
      if (this.n != null) {
         iw $$0 = this.ax_();
         ebq $$1 = this.n.a_($$0);
         if ($$1.a(dnq.pI)) {
            this.n.a($$0, $$1.b(dwi.b, this.d), 2);
         }
      }
   }

   @Nullable
   public acl a() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public boolean c() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.f = $$0;
   }

   public edb d() {
      return this.d;
   }

   public void a(edb $$0) {
      this.d = $$0;
      this.u();
   }

   private dno v() {
      return this.m().b();
   }

   public void f() {
      this.g = false;
      if (this.d == edb.a && this.n != null) {
         this.a(false);
         this.n.a(this.ax_(), this.v());
      }
   }

   public void j() {
      if (this.d == edb.a && this.n != null) {
         this.a(true);
         iw $$0 = this.ax_();
         this.n.a($$0, this.v());
         this.n.U().b($$0, this.v());
         this.k();
      } else {
         if (this.d == edb.b) {
            this.k();
         }

         this.g = true;
      }
   }

   public void k() {
      if (!this.e.isBlank()) {
         a.info("Test {} (at {}): {}", new Object[]{this.d.c(), this.ax_(), this.e});
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
