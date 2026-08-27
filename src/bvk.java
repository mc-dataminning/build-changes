import java.util.List;
import java.util.function.Predicate;

public class bvk extends buo {
   private static final aef<Integer> e = aei.a(bvk.class, aeh.b);
   int bT;
   int bU;
   private static final Predicate<bjg> bV = $$0 -> $$0 instanceof cbu && ((cbu)$$0).f() ? false : $$0.ag() == biu.f || $$0.eR() != bjl.e;
   static final bts bW = bts.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bvk(biu<? extends bvk> $$0, cpv $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, 0);
   }

   public int gf() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(aef<?> $$0) {
      if (e.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gf());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cjf b() {
      return new cjf(cji.pR);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new bvk.a(this));
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bv() && this.cX()) {
         if (this.bT > 0) {
            if (this.gf() == 0) {
               this.a(ape.te, this.eV(), this.eW());
               this.c(1);
            } else if (this.bT > 40 && this.gf() == 1) {
               this.a(ape.te, this.eV(), this.eW());
               this.c(2);
            }

            this.bT++;
         } else if (this.gf() != 0) {
            if (this.bU > 60 && this.gf() == 2) {
               this.a(ape.td, this.eV(), this.eW());
               this.c(1);
            } else if (this.bU > 100 && this.gf() == 1) {
               this.a(ape.td, this.eV(), this.eW());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bv() && this.gf() > 0) {
         for (bji $$1 : this.dL().a(bji.class, this.cG().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bv()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bji $$0) {
      int $$1 = this.gf();
      if ($$0.a(this.dM().b((bjg)this), (float)(1 + $$1))) {
         $$0.b(new bid(bif.s, 60 * $$1, 0), this);
         this.a(ape.ti, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cbu $$0) {
      int $$1 = this.gf();
      if ($$0 instanceof aks && $$1 > 0 && $$0.a(this.dM().b((bjg)this), (float)(1 + $$1))) {
         if (!this.aS()) {
            ((aks)$$0).c.b(new yc(yc.j, 0.0F));
         }

         $$0.b(new bid(bif.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected apd w() {
      return ape.tc;
   }

   @Override
   protected apd l_() {
      return ape.tf;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.th;
   }

   @Override
   protected apd ge() {
      return ape.tg;
   }

   @Override
   public bir a(bjs $$0) {
      return super.a($$0).a(s(this.gf()));
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

   static class a extends bqb {
      private final bvk a;

      public a(bvk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bjg> $$0 = this.a.dL().a(bjg.class, this.a.cG().g(2.0), $$0x -> bvk.bW.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bT = 1;
         this.a.bU = 0;
      }

      @Override
      public void d() {
         this.a.bT = 0;
      }
   }
}
