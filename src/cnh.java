import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnh extends clz {
   private static final String a = "Johnny";
   static final Predicate<btb> b = $$0 -> $$0 == btb.c || $$0 == btb.d;
   boolean bZ;

   public cnh(bvm<? extends cnh> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new cct(this));
      this.bT.a(1, new ccg<>(this, cnw.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new cnh.a(this));
      this.bT.a(3, new clz.b(this));
      this.bT.a(4, new crg.a(this, 10.0F));
      this.bT.a(5, new cdj(this, 1.0, false));
      this.bU.a(1, new cer(this, crg.class).a());
      this.bU.a(2, new ces<>(this, cps.class, true));
      this.bU.a(3, new ces<>(this, coz.class, true));
      this.bU.a(3, new ces<>(this, cie.class, true));
      this.bU.a(4, new cnh.b(this));
      this.bT.a(8, new cdw(this, 0.6));
      this.bT.a(9, new cdh(this, cps.class, 3.0F, 1.0F));
      this.bT.a(10, new cdh(this, bwd.class, 8.0F));
   }

   @Override
   protected void a(ash $$0) {
      if (!this.fZ() && cgx.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cfm)this.L()).b($$1);
      }

      super.a($$0);
   }

   public static bxi.a p() {
      return cms.gr().a(bxj.v, 0.35F).a(bxj.m, 12.0).a(bxj.s, 24.0).a(bxj.c, 5.0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.bZ) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public clz.a m() {
      if (this.gb()) {
         return clz.a.b;
      } else {
         return this.gE() ? clz.a.g : clz.a.a;
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
      return axf.BL;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bwu $$4 = super.a($$0, $$1, $$2, $$3);
      ((cfm)this.L()).b(true);
      bam $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      if (this.gz() == null) {
         this.a(bvn.a, new cxk(cxo.pA));
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
      return axf.BK;
   }

   @Override
   protected axe o_() {
      return axf.BM;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.BN;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
      cxk $$3 = new cxk(cxo.pA);
      crf $$4 = this.gz();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         aly<dez> $$6 = $$1 > $$4.a(btb.c) ? dff.f : dff.e;
         ddt.a($$3, $$0.K_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bvn.a, $$3);
   }

   static class a extends ccj {
      public a(bwd $$0) {
         super($$0, 6, cnh.b);
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean c() {
         cnh $$0 = (cnh)this.d;
         return $$0.gC() && super.c();
      }

      @Override
      public boolean b() {
         cnh $$0 = (cnh)this.d;
         return $$0.gC() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends ces<bwb> {
      public b(cnh $$0) {
         super($$0, bwb.class, 0, true, true, ($$0x, $$1) -> $$0x.fK());
      }

      @Override
      public boolean b() {
         return ((cnh)this.e).bZ && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
