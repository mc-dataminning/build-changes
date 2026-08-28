import javax.annotation.Nullable;

public class cmb extends clf implements cll, cod {
   private static final akm<Boolean> a = akq.a(cmb.class, ako.k);
   private static final int b = 5;
   private static final int bY = 300;
   private final bsr bZ = new bsr(5);

   public cmb(bus<? extends cmb> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbz(this));
      this.bS.a(2, new cqi.a(this, 10.0F));
      this.bS.a(3, new cdg<>(this, 1.0, 8.0F));
      this.bS.a(8, new cdc(this, 0.6));
      this.bS.a(9, new ccn(this, cou.class, 15.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 15.0F));
      this.bT.a(1, new cdx(this, cqi.class).a());
      this.bT.a(2, new cdy<>(this, cou.class, true));
      this.bT.a(3, new cdy<>(this, coa.class, false));
      this.bT.a(3, new cdy<>(this, chk.class, true));
   }

   public static bwo.a q() {
      return cly.gs().a(bwp.v, 0.35F).a(bwp.s, 24.0).a(bwp.c, 5.0).a(bwp.m, 32.0);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean a(cxi $$0) {
      return $$0 == cwq.wn;
   }

   public boolean gm() {
      return this.al.a(a);
   }

   @Override
   public void b(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a() {
      this.be = 0;
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      this.b($$0, this.dX());
   }

   @Override
   public clf.a n() {
      if (this.gm()) {
         return clf.a.f;
      } else if (this.b(cwq.wn)) {
         return clf.a.e;
      } else {
         return this.gb() ? clf.a.b : clf.a.h;
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      this.a_(true);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return 0.0F;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      this.a(but.a, new cwm(cwq.wn));
   }

   @Override
   protected void b(dgd $$0, azu $$1, bsi $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cwm $$3 = this.eX();
         if ($$3.a(cwq.wn)) {
            dcf.a($$3, $$0.J_(), ddr.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awm t() {
      return awn.tU;
   }

   @Override
   protected awm n_() {
      return awn.tW;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.tX;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bsr v() {
      return this.bZ;
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      cwm $$2 = $$1.j();
      if ($$2.h() instanceof cup) {
         super.a($$0, $$1);
      } else if (this.i($$2)) {
         this.a($$1);
         cwm $$3 = this.bZ.b($$2);
         if ($$3.f()) {
            $$1.at();
         } else {
            $$2.e($$3.L());
         }
      }
   }

   private boolean i(cwm $$0) {
      return this.gD() && $$0.a(cwq.vh);
   }

   @Override
   public bvz a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvz.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arp $$0, int $$1, boolean $$2) {
      cqh $$3 = this.gA();
      boolean $$4 = this.ae.i() <= $$3.v();
      if ($$4) {
         cwm $$5 = new cwm(cwq.wn);
         ali<ddl> $$6;
         if ($$1 > $$3.a(bsh.c)) {
            $$6 = ddr.d;
         } else if ($$1 > $$3.a(bsh.b)) {
            $$6 = ddr.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dcf.a($$5, $$0.J_(), $$6, $$0.d_(this.dv()), this.dY());
            this.a(but.a, $$5);
         }
      }
   }

   @Override
   public awm aj_() {
      return awn.tV;
   }
}
