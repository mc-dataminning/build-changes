import java.util.Optional;
import javax.annotation.Nullable;

public class cau extends blw {
   private static final agn<Optional<hx>> c = agq.a(cau.class, agp.o);
   private static final agn<Boolean> d = agq.a(cau.class, agp.k);
   public int b;

   public cau(bmc<? extends cau> $$0, ctx $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public cau(ctx $$0, double $$1, double $$2, double $$3) {
      this(bmc.D, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected blw.b aW() {
      return blw.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, Optional.empty());
      this.an().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dL() instanceof ane) {
         hx $$0 = this.dl();
         if (((ane)this.dL()).D() != null && this.dL().a_($$0).i()) {
            this.dL().b($$0, cwl.a(this.dL(), $$0));
         }
      }
   }

   @Override
   protected void b(so $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", td.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(so $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(td.b($$0.p("BeamTarget")));
      }

      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cav) {
         return false;
      } else {
         if (!this.dG() && !this.dL().B) {
            this.a(blw.c.a);
            if (!$$0.a(ask.m)) {
               bkv $$2 = $$0.d() != null ? this.dM().d(this, $$0.d()) : null;
               this.dL().a(this, $$2, null, this.dq(), this.ds(), this.dw(), 6.0F, false, ctx.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void al() {
      this.a(this.dM().n());
      super.al();
   }

   private void a(bkv $$0) {
      if (this.dL() instanceof ane) {
         dnb $$1 = ((ane)this.dL()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable hx $$0) {
      this.an().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public hx q() {
      return this.an().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.an().b(d, $$0);
   }

   public boolean s() {
      return this.an().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.q() != null;
   }

   @Override
   public cng dy() {
      return new cng(cnj.vb);
   }
}
