import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzy extends dye {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "";
   private static final boolean c = false;
   private ecr d;
   private String e = "";
   private boolean f = false;
   private boolean g;

   public dzy(iw $$0, ebg $$1) {
      super(dyg.T, $$0, $$1);
      this.d = $$1.c(dvy.b);
   }

   @Override
   public void b(ua $$0, ji.a $$1) {
      $$0.a("mode", ecr.e, this.d);
      $$0.a("message", this.e);
      $$0.a("powered", this.f);
   }

   @Override
   public void a(ua $$0, ji.a $$1) {
      this.d = $$0.<ecr>a("mode", ecr.e).orElse(ecr.c);
      this.e = $$0.b("message", "");
      this.f = $$0.b("powered", false);
   }

   private void u() {
      if (this.n != null) {
         iw $$0 = this.aB_();
         ebg $$1 = this.n.a_($$0);
         if ($$1.a(dng.pI)) {
            this.n.a($$0, $$1.b(dvy.b, this.d), 2);
         }
      }
   }

   @Nullable
   public ace a() {
      return ace.a(this);
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

   public ecr d() {
      return this.d;
   }

   public void a(ecr $$0) {
      this.d = $$0;
      this.u();
   }

   private dne v() {
      return this.m().b();
   }

   public void f() {
      this.g = false;
      if (this.d == ecr.a && this.n != null) {
         this.a(false);
         this.n.a(this.aB_(), this.v());
      }
   }

   public void j() {
      if (this.d == ecr.a && this.n != null) {
         this.a(true);
         iw $$0 = this.aB_();
         this.n.a($$0, this.v());
         this.n.U().b($$0, this.v());
         this.k();
      } else {
         if (this.d == ecr.b) {
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
