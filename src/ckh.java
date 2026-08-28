import javax.annotation.Nullable;

public class ckh extends cjl implements cjr, cmj {
   private static final akk<Boolean> b = ako.a(ckh.class, akm.k);
   private static final int e = 5;
   private static final int bY = 300;
   private final bre bZ = new bre(5);

   public ckh(btb<? extends ckh> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cai(this));
      this.bS.a(2, new cok.a(this, 10.0F));
      this.bS.a(3, new cbp<>(this, 1.0, 8.0F));
      this.bS.a(8, new cbl(this, 0.6));
      this.bS.a(9, new caw(this, cmy.class, 15.0F, 1.0F));
      this.bS.a(10, new caw(this, bts.class, 15.0F));
      this.bT.a(1, new ccg(this, cok.class).a());
      this.bT.a(2, new cch<>(this, cmy.class, true));
      this.bT.a(3, new cch<>(this, cmg.class, false));
      this.bT.a(3, new cch<>(this, cfs.class, true));
   }

   public static bux.a u() {
      return cke.gw().a(buy.r, 0.35F).a(buy.q, 24.0).a(buy.c, 5.0).a(buy.k, 32.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvj $$0) {
      return $$0 == cut.vT;
   }

   public boolean gq() {
      return this.ao.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      this.b($$0, this.dR());
   }

   @Override
   public cjl.a s() {
      if (this.gq()) {
         return cjl.a.f;
      } else if (this.b(cut.vT)) {
         return cjl.a.e;
      } else {
         return this.gi() ? cjl.a.b : cjl.a.h;
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0, this.dR());
      this.a_(true);
   }

   @Override
   public float a(iz $$0, dcc $$1) {
      return 0.0F;
   }

   @Override
   public int fQ() {
      return 1;
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      this.a(btc.a, new cuq(cut.vT));
   }

   @Override
   protected void a(azh $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cuq $$2 = this.eX();
         if ($$2.a(cut.vT)) {
            $$2.a(dae.K, 1);
            this.a(btc.a, $$2);
         }
      }
   }

   @Override
   protected avz v() {
      return awa.tS;
   }

   @Override
   protected avz o_() {
      return awa.tU;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.tV;
   }

   @Override
   public void a(btq $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bre y() {
      return this.bZ;
   }

   @Override
   protected void b(cji $$0) {
      cuq $$1 = $$0.p();
      if ($$1.g() instanceof csl) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cuq $$2 = this.bZ.b($$1);
         if ($$2.e()) {
            $$0.ao();
         } else {
            $$1.e($$2.I());
         }
      }
   }

   private boolean n(cuq $$0) {
      return this.gH() && $$0.a(cut.uP);
   }

   @Override
   public bui a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bui.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      coj $$2 = this.gE();
      boolean $$3 = this.ah.i() <= $$2.v();
      if ($$3) {
         cuq $$4 = new cuq(cut.vT);
         if ($$0 > $$2.a(bqs.c)) {
            $$4.a(dae.J, 2);
         } else if ($$0 > $$2.a(bqs.b)) {
            $$4.a(dae.J, 1);
         }

         $$4.a(dae.I, 1);
         this.a(btc.a, $$4);
      }
   }

   @Override
   public avz ae_() {
      return awa.tT;
   }
}
