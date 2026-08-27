import java.util.Optional;
import javax.annotation.Nullable;

public class bxg extends biq {
   private static final aef<Optional<gw>> c = aei.a(bxg.class, aeh.o);
   private static final aef<Boolean> d = aei.a(bxg.class, aeh.k);
   public int b;

   public bxg(biu<? extends bxg> $$0, cpv $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public bxg(cpv $$0, double $$1, double $$2, double $$3) {
      this(biu.B, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected biq.b aV() {
      return biq.b.a;
   }

   @Override
   protected void a_() {
      this.am().a(c, Optional.empty());
      this.am().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dL() instanceof akr) {
         gw $$0 = this.dl();
         if (((akr)this.dL()).B() != null && this.dL().a_($$0).i()) {
            this.dL().b($$0, csj.a(this.dL(), $$0));
         }
      }
   }

   @Override
   protected void b(qx $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", rj.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(qx $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(rj.b($$0.p("BeamTarget")));
      }

      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bxh) {
         return false;
      } else {
         if (!this.dG() && !this.dL().B) {
            this.a(biq.c.a);
            if (!$$0.a(apv.l)) {
               bho $$2 = $$0.d() != null ? this.dM().d(this, $$0.d()) : null;
               this.dL().a(this, $$2, null, this.dq(), this.ds(), this.dw(), 6.0F, false, cpv.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ak() {
      this.a(this.dM().n());
      super.ak();
   }

   private void a(bho $$0) {
      if (this.dL() instanceof akr) {
         div $$1 = ((akr)this.dL()).B();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable gw $$0) {
      this.am().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public gw q() {
      return this.am().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.am().b(d, $$0);
   }

   public boolean s() {
      return this.am().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.q() != null;
   }

   @Override
   public cjf dy() {
      return new cjf(cji.ul);
   }
}
