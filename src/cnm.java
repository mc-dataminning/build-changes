import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnm extends cme {
   private static final String a = "Johnny";
   static final Predicate<btg> b = $$0 -> $$0 == btg.c || $$0 == btg.d;
   boolean bZ;

   public cnm(bvr<? extends cnm> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new ccl<>(this, cob.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new cnm.a(this));
      this.bT.a(3, new cme.b(this));
      this.bT.a(4, new crl.a(this, 10.0F));
      this.bT.a(5, new cdo(this, 1.0, false));
      this.bU.a(1, new cew(this, crl.class).a());
      this.bU.a(2, new cex<>(this, cpx.class, true));
      this.bU.a(3, new cex<>(this, cpe.class, true));
      this.bU.a(3, new cex<>(this, cij.class, true));
      this.bU.a(4, new cnm.b(this));
      this.bT.a(8, new ceb(this, 0.6));
      this.bT.a(9, new cdm(this, cpx.class, 3.0F, 1.0F));
      this.bT.a(10, new cdm(this, bwi.class, 8.0F));
   }

   @Override
   protected void a(ash $$0) {
      if (!this.gb() && chc.a(this)) {
         boolean $$1 = $$0.e(this.dw());
         ((cfr)this.L()).b($$1);
      }

      super.a($$0);
   }

   public static bxn.a p() {
      return cmx.gt().a(bxo.v, 0.35F).a(bxo.m, 12.0).a(bxo.s, 24.0).a(bxo.c, 5.0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.bZ) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cme.a m() {
      if (this.gd()) {
         return cme.a.b;
      } else {
         return this.gG() ? cme.a.g : cme.a.a;
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bZ = $$0.q("Johnny");
      }
   }

   @Override
   public axe ak_() {
      return axf.BM;
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bwz $$4 = super.a($$0, $$1, $$2, $$3);
      ((cfr)this.L()).b(true);
      bam $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      if (this.gB() == null) {
         this.a(bvs.a, new cxp(cxt.pA));
      }
   }

   @Override
   public void b(@Nullable xv $$0) {
      super.b($$0);
      if (!this.bZ && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bZ = true;
      }
   }

   @Override
   protected axe u() {
      return axf.BL;
   }

   @Override
   protected axe o_() {
      return axf.BN;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.BO;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
      cxp $$3 = new cxp(cxt.pA);
      crk $$4 = this.gB();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         aly<dfh> $$6 = $$1 > $$4.a(btg.c) ? dfn.f : dfn.e;
         deb.a($$3, $$0.K_(), $$6, $$0.d_(this.dw()), this.ae);
      }

      this.a(bvs.a, $$3);
   }

   static class a extends cco {
      public a(bwi $$0) {
         super($$0, 6, cnm.b);
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean c() {
         cnm $$0 = (cnm)this.d;
         return $$0.gE() && super.c();
      }

      @Override
      public boolean b() {
         cnm $$0 = (cnm)this.d;
         return $$0.gE() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cex<bwg> {
      public b(cnm $$0) {
         super($$0, bwg.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cnm)this.e).bZ && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
