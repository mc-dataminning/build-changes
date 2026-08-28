import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxf extends dvl {
   private static final Logger a = LogUtils.getLogger();
   private dzx b;
   private String c = "";
   private boolean d;
   private boolean e;

   public dxf(jj $$0, dym $$1) {
      super(dvn.T, $$0, $$1);
      this.b = $$1.c(dti.b);
   }

   @Override
   public void b(tw $$0, ju.a $$1) {
      $$0.a("mode", this.b.c());
      $$0.a("message", this.c);
      $$0.a("powered", this.d);
   }

   @Override
   public void a(tw $$0, ju.a $$1) {
      String $$2 = $$0.l("mode");
      dzx $$3 = dzx.e.a($$2);
      this.b = $$3 != null ? $$3 : dzx.c;
      this.c = $$0.l("message");
      this.d = $$0.q("powered");
   }

   private void u() {
      if (this.n != null) {
         jj $$0 = this.aw_();
         dym $$1 = this.n.a_($$0);
         if ($$1.a(dkw.pE)) {
            this.n.a($$0, $$1.b(dti.b, this.b), 2);
         }
      }
   }

   @Nullable
   public abx a() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.e($$0);
   }

   public boolean c() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public dzx d() {
      return this.b;
   }

   public void a(dzx $$0) {
      this.b = $$0;
      this.u();
   }

   private dku v() {
      return this.m().b();
   }

   public void f() {
      this.e = false;
      if (this.b == dzx.a && this.n != null) {
         this.a(false);
         this.n.a(this.aw_(), this.v());
      }
   }

   public void j() {
      if (this.b == dzx.a && this.n != null) {
         this.a(true);
         jj $$0 = this.aw_();
         this.n.a($$0, this.v());
         this.n.U().b($$0, this.v());
         this.k();
      } else {
         if (this.b == dzx.b) {
            this.k();
         }

         this.e = true;
      }
   }

   public void k() {
      if (!this.c.isBlank()) {
         a.info("Test {} (at {}): {}", new Object[]{this.b.c(), this.aw_(), this.c});
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
