import java.util.List;
import java.util.function.Predicate;

public class bxk extends bwo {
   private static final afo<Integer> e = afr.a(bxk.class, afq.b);
   int bT;
   int bU;
   private static final Predicate<blg> bV = $$0 -> $$0 instanceof cdu && ((cdu)$$0).f() ? false : $$0.ai() == bku.f || $$0.eT() != bll.e;
   static final bvs bW = bvs.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bxk(bku<? extends bxk> $$0, csa $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, 0);
   }

   public int gh() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(afo<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gh());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public clj b() {
      return new clj(clm.qC);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new bxk.a(this));
   }

   @Override
   public void l() {
      if (!this.dN().B && this.bx() && this.cZ()) {
         if (this.bT > 0) {
            if (this.gh() == 0) {
               this.a(aqr.tz, this.eX(), this.eY());
               this.c(1);
            } else if (this.bT > 40 && this.gh() == 1) {
               this.a(aqr.tz, this.eX(), this.eY());
               this.c(2);
            }

            this.bT++;
         } else if (this.gh() != 0) {
            if (this.bU > 60 && this.gh() == 2) {
               this.a(aqr.ty, this.eX(), this.eY());
               this.c(1);
            } else if (this.bU > 100 && this.gh() == 1) {
               this.a(aqr.ty, this.eX(), this.eY());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void c_() {
      super.c_();
      if (this.bx() && this.gh() > 0) {
         for (bli $$1 : this.dN().a(bli.class, this.cH().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bli $$0) {
      int $$1 = this.gh();
      if ($$0.a(this.dO().b((blg)this), (float)(1 + $$1))) {
         $$0.b(new bkd(bkf.s, 60 * $$1, 0), this);
         this.a(aqr.tD, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cdu $$0) {
      int $$1 = this.gh();
      if ($$0 instanceof amf && $$1 > 0 && $$0.a(this.dO().b((blg)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((amf)$$0).c.b(new zi(zi.j, 0.0F));
         }

         $$0.b(new bkd(bkf.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aqq y() {
      return aqr.tx;
   }

   @Override
   protected aqq m_() {
      return aqr.tA;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.tC;
   }

   @Override
   protected aqq gg() {
      return aqr.tB;
   }

   @Override
   public bkr a(bls $$0) {
      return super.a($$0).a(s(this.gh()));
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

   static class a extends bsb {
      private final bxk a;

      public a(bxk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<blg> $$0 = this.a.dN().a(blg.class, this.a.cH().g(2.0), $$0x -> bxk.bW.a(this.a, $$0x));
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
