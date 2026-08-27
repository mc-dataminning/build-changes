import javax.annotation.Nullable;

public class chu extends cgy implements che, cjw {
   private static final ajk<Boolean> b = ajo.a(chu.class, ajm.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final boz bZ = new boz(5);

   public chu(bqr<? extends chu> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bxv(this));
      this.bS.a(2, new clx.a(this, 10.0F));
      this.bS.a(3, new bzc<>(this, 1.0, 8.0F));
      this.bS.a(8, new byy(this, 0.6));
      this.bS.a(9, new byj(this, ckl.class, 15.0F, 1.0F));
      this.bS.a(10, new byj(this, brg.class, 15.0F));
      this.bT.a(1, new bzt(this, clx.class).a());
      this.bT.a(2, new bzu<>(this, ckl.class, true));
      this.bT.a(3, new bzu<>(this, cjt.class, false));
      this.bT.a(3, new bzu<>(this, cdf.class, true));
   }

   public static bsk.a u() {
      return chr.gv().a(bsl.r, 0.35F).a(bsl.q, 24.0).a(bsl.c, 5.0).a(bsl.k, 32.0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(csu $$0) {
      return $$0 == csg.vT;
   }

   public boolean gp() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bg = 0;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      this.b($$0, this.dP());
   }

   @Override
   public cgy.a r() {
      if (this.gp()) {
         return cgy.a.f;
      } else if (this.b(csg.vT)) {
         return cgy.a.e;
      } else {
         return this.gh() ? cgy.a.b : cgy.a.h;
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a($$0, this.dP());
      this.a_(true);
   }

   @Override
   public float a(im $$0, czx $$1) {
      return 0.0F;
   }

   @Override
   public int fP() {
      return 1;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      this.a(bqs.a, new csd(csg.vT));
   }

   @Override
   protected void a(ayd $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         csd $$2 = this.eV();
         if ($$2.a(csg.vT)) {
            $$2.a(cxq.K, 1);
            this.a(bqs.a, $$2);
         }
      }
   }

   @Override
   protected auy v() {
      return auz.tG;
   }

   @Override
   protected auy o_() {
      return auz.tI;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.tJ;
   }

   @Override
   public void a(bre $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boz y() {
      return this.bZ;
   }

   @Override
   protected void b(cgv $$0) {
      csd $$1 = $$0.p();
      if ($$1.f() instanceof cpy) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         csd $$2 = this.bZ.a($$1);
         if ($$2.d()) {
            $$0.am();
         } else {
            $$1.e($$2.G());
         }
      }
   }

   private boolean n(csd $$0) {
      return this.gE() && $$0.a(csg.uP);
   }

   @Override
   public brv a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? brv.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      clw $$2 = this.gD();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         csd $$4 = new csd(csg.vT);
         if ($$0 > $$2.a(bon.c)) {
            $$4.a(cxq.J, 2);
         } else if ($$0 > $$2.a(bon.b)) {
            $$4.a(cxq.J, 1);
         }

         $$4.a(cxq.I, 1);
         this.a(bqs.a, $$4);
      }
   }

   @Override
   public auy ae_() {
      return auz.tH;
   }
}
