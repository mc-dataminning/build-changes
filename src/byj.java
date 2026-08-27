import java.util.Optional;
import javax.annotation.Nullable;

public class byj extends bjt {
   private static final afc<Optional<ht>> c = aff.a(byj.class, afe.o);
   private static final afc<Boolean> d = aff.a(byj.class, afe.k);
   public int b;

   public byj(bjx<? extends byj> $$0, cqz $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public byj(cqz $$0, double $$1, double $$2, double $$3) {
      this(bjx.B, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected bjt.b aU() {
      return bjt.b.a;
   }

   @Override
   protected void b_() {
      this.al().a(c, Optional.empty());
      this.al().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dL() instanceof alq) {
         ht $$0 = this.dl();
         if (((alq)this.dL()).B() != null && this.dL().a_($$0).i()) {
            this.dL().b($$0, ctn.a(this.dL(), $$0));
         }
      }
   }

   @Override
   protected void b(rt $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", sg.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(rt $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(sg.b($$0.p("BeamTarget")));
      }

      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof byk) {
         return false;
      } else {
         if (!this.dG() && !this.dL().B) {
            this.a(bjt.c.a);
            if (!$$0.a(aqu.l)) {
               bir $$2 = $$0.d() != null ? this.dM().d(this, $$0.d()) : null;
               this.dL().a(this, $$2, null, this.dq(), this.ds(), this.dw(), 6.0F, false, cqz.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void aj() {
      this.a(this.dM().n());
      super.aj();
   }

   private void a(bir $$0) {
      if (this.dL() instanceof alq) {
         djn $$1 = ((alq)this.dL()).B();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ht $$0) {
      this.al().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ht q() {
      return this.al().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.al().b(d, $$0);
   }

   public boolean s() {
      return this.al().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.q() != null;
   }

   @Override
   public ckj dy() {
      return new ckj(ckm.ul);
   }
}
