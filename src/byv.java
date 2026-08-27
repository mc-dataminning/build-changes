import java.util.List;
import java.util.function.Predicate;

public class byv extends bxz {
   private static final agn<Integer> e = agq.a(byv.class, agp.b);
   int bU;
   int bV;
   private static final Predicate<bmo> bW = $$0 -> $$0 instanceof cfq && ((cfq)$$0).f() ? false : $$0.ai() == bmc.g || $$0.eS() != bmt.e;
   static final bxd bX = bxd.b().e().d().a(bW);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public byv(bmc<? extends byv> $$0, ctx $$1) {
      super($$0, $$1);
      this.k_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, 0);
   }

   public int gh() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(agn<?> $$0) {
      if (e.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gh());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cng b() {
      return new cng(cnj.qE);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(1, new byv.a(this));
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bx() && this.cY()) {
         if (this.bU > 0) {
            if (this.gh() == 0) {
               this.a(art.uj, this.eW(), this.eX());
               this.c(1);
            } else if (this.bU > 40 && this.gh() == 1) {
               this.a(art.uj, this.eW(), this.eX());
               this.c(2);
            }

            this.bU++;
         } else if (this.gh() != 0) {
            if (this.bV > 60 && this.gh() == 2) {
               this.a(art.ui, this.eW(), this.eX());
               this.c(1);
            } else if (this.bV > 100 && this.gh() == 1) {
               this.a(art.ui, this.eW(), this.eX());
               this.c(0);
            }

            this.bV++;
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.gh() > 0) {
         for (bmq $$1 : this.dL().a(bmq.class, this.cH().g(0.3), $$0 -> bX.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bmq $$0) {
      int $$1 = this.gh();
      if ($$0.a(this.dM().b((bmo)this), (float)(1 + $$1))) {
         $$0.b(new blj(bll.s, 60 * $$1, 0), this);
         this.a(art.un, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cfq $$0) {
      int $$1 = this.gh();
      if ($$0 instanceof anf && $$1 > 0 && $$0.a(this.dM().b((bmo)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((anf)$$0).c.b(new aag(aag.j, 0.0F));
         }

         $$0.b(new blj(bll.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected ars y() {
      return art.uh;
   }

   @Override
   protected ars n_() {
      return art.uk;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.um;
   }

   @Override
   protected ars gg() {
      return art.ul;
   }

   @Override
   public blz e(bna $$0) {
      return super.e($$0).a(s(this.gh()));
   }

   private static float s(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends btk {
      private final byv a;

      public a(byv $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bmo> $$0 = this.a.dL().a(bmo.class, this.a.cH().g(2.0), $$0x -> byv.bX.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bU = 1;
         this.a.bV = 0;
      }

      @Override
      public void d() {
         this.a.bU = 0;
      }
   }
}
