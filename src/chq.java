import javax.annotation.Nullable;

public class chq extends cgh {
   public chq(bqb<? extends chq> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bS.a(3, new bze<>(this, cii.class, true));
      super.z();
   }

   @Override
   protected aul v() {
      return aum.Cg;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Ci;
   }

   @Override
   protected aul o_() {
      return aum.Ch;
   }

   @Override
   aul u() {
      return aum.Cj;
   }

   @Override
   protected void a(bot $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cgl $$4 && $$4.go()) {
         $$4.gp();
         this.a((cyw)crm.uk);
      }
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      this.a(bqc.a, new crj(crm.oP));
   }

   @Override
   protected void b(axr $$0, bny $$1) {
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      brg $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(brv.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean C(bpv $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bqo) {
            ((bqo)$$0).b(new bph(bpj.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cjz b(crj $$0, float $$1) {
      cjz $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bph $$0) {
      return $$0.a(bpj.t) ? false : super.c($$0);
   }
}
