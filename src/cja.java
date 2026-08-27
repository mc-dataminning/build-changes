import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cja extends cdp implements brx, bsp {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final btf bZ = new btf(bY, "Strider suffocating modifier", -0.34F, btf.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final ajm<Integer> cd = ajq.a(cja.class, ajo.b);
   private static final ajm<Boolean> ce = ajq.a(cja.class, ajo.k);
   private static final ajm<Boolean> cf = ajq.a(cja.class, ajo.k);
   private final brw cg = new brw(this.ao, cd, cf);
   @Nullable
   private caf ch;

   public cja(brn<? extends cja> $$0, dad $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(emr.j, -1.0F);
      this.a(emr.i, 0.0F);
      this.a(emr.n, 0.0F);
      this.a(emr.o, 0.0F);
   }

   public static boolean c(brn<cja> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      in.a $$5 = $$3.j();

      do {
         $$5.c(is.b);
      } while ($$1.b_($$5).a(avw.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajm<?> $$0) {
      if (cd.equals($$0) && this.dN().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean i() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bB() && !this.p_();
   }

   @Override
   public void a(@Nullable avd $$0) {
      this.cg.a(true);
      if ($$0 != null) {
         this.dN().a(null, this, avc.xQ, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzq(this, 1.65));
      this.bS.a(2, new byj(this, 1.0));
      this.ch = new caf(this, 1.4, $$0 -> $$0.a(avz.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cja.a(this, 1.0));
      this.bS.a(5, new byw(this, 1.0));
      this.bS.a(7, new bzu(this, 1.0, 60));
      this.bS.a(8, new bzf(this, clh.class, 8.0F));
      this.bS.a(8, new bzs(this));
      this.bS.a(9, new bzf(this, cja.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      btd $$1 = this.f(bth.r);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bZ);
         } else {
            $$1.e(bZ);
         }
      }
   }

   public boolean r() {
      return this.ao.a(ce);
   }

   @Override
   public boolean a(ema $$0) {
      return $$0.a(avw.b);
   }

   @Override
   protected etp a(brh $$0, brk $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aV.a());
      float $$4 = this.aV.b();
      float $$5 = 0.12F * axz.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dag $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bsa cO() {
      return (bsa)(this.i() && this.cR() instanceof clh $$0 && $$0.b(ctc.nS) ? $$0 : super.cO());
   }

   @Override
   public etp b(bsa $$0) {
      etp[] $$1 = new etp[]{
         a((double)this.dh(), (double)$$0.dh(), $$0.dD()),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 22.5F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() - 45.0F),
         a((double)this.dh(), (double)$$0.dh(), $$0.dD() + 45.0F)
      };
      Set<in> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cI().e;
      double $$4 = this.cI().b - 0.5;
      in.a $$5 = new in.a();

      for (etp $$6 : $$1) {
         $$5.b(this.ds() + $$6.c, $$3, this.dy() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(is.a);
         }
      }

      for (in $$8 : $$2) {
         if (!this.dN().b_($$8).a(avw.b)) {
            double $$9 = this.dN().j($$8);
            if (cnh.a($$9)) {
               etp $$10 = etp.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fG().iterator();

               while (var14.hasNext()) {
                  bsl $$11 = (bsl)var14.next();
                  etk $$12 = $$0.f($$11);
                  if (cnh.a(this.dN(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new etp(this.ds(), this.cI().e, this.dy());
   }

   @Override
   protected void a(clh $$0, etp $$1) {
      this.a($$0.dD(), $$0.dF() * 0.5F);
      this.O = this.aZ = this.bb = this.dD();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected etp b(clh $$0, etp $$1) {
      return new etp(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(clh $$0) {
      return (float)(this.g(bth.r) * (double)(this.r() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aM() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(this.bq() ? avc.xO : avc.xN, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.ej());
   }

   @Override
   protected void a(double $$0, boolean $$1, dqh $$2, in $$3) {
      this.aQ();
      if (this.bq()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ah.a(140) == 0) {
         this.b(avc.xJ);
      } else if (this.gm() && this.ah.a(60) == 0) {
         this.b(avc.xK);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dqh $$0 = this.dN().a_(this.dn());
            dqh $$1 = this.bm();
            $$2 = $$0.a(avr.aU) || $$1.a(avr.aU) || this.b(avw.b) > 0.0;
            if (this.da() instanceof cja $$3 && $$3.r()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gp();
      this.aQ();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gp() {
      if (this.bq()) {
         etu $$0 = etu.a(this);
         if ($$0.a(dhu.d, this.dn(), true) && !this.dN().b_(this.dn().c()).a(avw.b)) {
            this.d(true);
         } else {
            this.g(this.dq().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static btg.a u() {
      return bsc.A().a(bth.r, 0.175F).a(bth.k, 16.0);
   }

   @Override
   protected avb v() {
      return !this.gm() && !this.y() ? avc.xI : null;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.xM;
   }

   @Override
   protected avb o_() {
      return avc.xL;
   }

   @Override
   protected boolean r(brh $$0) {
      return !this.bQ() && !this.a(avw.b);
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   public boolean bO() {
      return false;
   }

   @Override
   protected cbl b(dad $$0) {
      return new cja.b(this, $$0);
   }

   @Override
   public float a(in $$0, dag $$1) {
      if ($$1.a_($$0).u().a(avw.b)) {
         return 10.0F;
      } else {
         return this.bq() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cja b(aqh $$0, brb $$1) {
      return brn.aY.a((dad)$$0);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.at);
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.i()) {
         this.a(ctc.nL);
      }
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bQ() && !$$0.fP()) {
         if (!this.dN().B) {
            $$0.n(this);
         }

         return bpm.a(this.dN().B);
      } else {
         bpm $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            csz $$4 = $$0.b($$1);
            return $$4.a(ctc.nL) ? $$4.a($$0, this, $$1) : bpm.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dN().a(null, this.ds(), this.du(), this.dy(), avc.xP, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayg $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bsc $$5 = brn.bw.a((dad)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cjg.b(cjg.a($$4), false));
               $$5.a(bro.a, new csz(ctc.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            brb $$6 = brn.aY.a((dad)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new brb.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bss a(das $$0, bpk $$1, bsc $$2, @Nullable bss $$3) {
      $$2.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
      $$2.a($$0, $$1, bse.g, $$3);
      $$2.a(this, true);
      return new brb.a(0.0F);
   }

   static class a extends bzk {
      private final cja g;

      a(cja $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public in k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bq() && this.a(this.g.dN(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bq() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dag $$0, in $$1) {
         return $$0.a_($$1).a(ddg.H) && $$0.a_($$1.c()).a(emp.a);
      }
   }

   static class b extends cbk {
      b(cja $$0, dad $$1) {
         super($$0, $$1);
      }

      @Override
      protected emq a(int $$0) {
         this.o = new emw();
         this.o.a(true);
         return new emq(this.o, $$0);
      }

      @Override
      protected boolean a(emr $$0) {
         return $$0 != emr.i && $$0 != emr.o && $$0 != emr.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(in $$0) {
         return this.b.a_($$0).a(ddg.H) || super.a($$0);
      }
   }
}
