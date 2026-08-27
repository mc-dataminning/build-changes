import java.util.List;
import java.util.function.Predicate;

public class byb extends bxf {
   private static final afz<Integer> e = agc.a(byb.class, agb.b);
   int bT;
   int bU;
   private static final Predicate<blv> bV = $$0 -> $$0 instanceof cer && ((cer)$$0).f() ? false : $$0.ai() == blj.f || $$0.eS() != bma.e;
   static final bwj bW = bwj.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public byb(blj<? extends byb> $$0, csy $$1) {
      super($$0, $$1);
      this.k_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, 0);
   }

   public int gg() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public void a(afz<?> $$0) {
      if (e.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gg());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cmh b() {
      return new cmh(cmk.qC);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new byb.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && this.cY()) {
         if (this.bT > 0) {
            if (this.gg() == 0) {
               this.a(arc.tU, this.eW(), this.eX());
               this.c(1);
            } else if (this.bT > 40 && this.gg() == 1) {
               this.a(arc.tU, this.eW(), this.eX());
               this.c(2);
            }

            this.bT++;
         } else if (this.gg() != 0) {
            if (this.bU > 60 && this.gg() == 2) {
               this.a(arc.tT, this.eW(), this.eX());
               this.c(1);
            } else if (this.bU > 100 && this.gg() == 1) {
               this.a(arc.tT, this.eW(), this.eX());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.gg() > 0) {
         for (blx $$1 : this.dM().a(blx.class, this.cH().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(blx $$0) {
      int $$1 = this.gg();
      if ($$0.a(this.dN().b((blv)this), (float)(1 + $$1))) {
         $$0.b(new bks(bku.s, 60 * $$1, 0), this);
         this.a(arc.tY, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cer $$0) {
      int $$1 = this.gg();
      if ($$0 instanceof amq && $$1 > 0 && $$0.a(this.dN().b((blv)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((amq)$$0).c.b(new zt(zt.j, 0.0F));
         }

         $$0.b(new bks(bku.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected arb y() {
      return arc.tS;
   }

   @Override
   protected arb n_() {
      return arc.tV;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.tX;
   }

   @Override
   protected arb gf() {
      return arc.tW;
   }

   @Override
   public blg a(bmh $$0) {
      return super.a($$0).a(s(this.gg()));
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

   static class a extends bsr {
      private final byb a;

      public a(byb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<blv> $$0 = this.a.dM().a(blv.class, this.a.cH().g(2.0), $$0x -> byb.bW.a(this.a, $$0x));
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
