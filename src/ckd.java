import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckd extends cer implements bsy, btr {
   private static final UUID ca = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final buh cb = new buh(ca, "Strider suffocating modifier", -0.34F, buh.a.b);
   private static final float cd = 0.35F;
   private static final float ce = 0.55F;
   private static final ajp<Integer> cf = ajt.a(ckd.class, ajr.b);
   private static final ajp<Boolean> cg = ajt.a(ckd.class, ajr.k);
   private static final ajp<Boolean> ch = ajt.a(ckd.class, ajr.k);
   private final bsx ci = new bsx(this.ao, cf, ch);
   @Nullable
   private cbh cj;

   public ckd(bsm<? extends ckd> $$0, dcf $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eoy.j, -1.0F);
      this.a(eoy.i, 0.0F);
      this.a(eoy.n, 0.0F);
      this.a(eoy.o, 0.0F);
   }

   public static boolean c(bsm<ckd> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      ja.a $$5 = $$3.j();

      do {
         $$5.c(jf.b);
      } while ($$1.b_($$5).a(awc.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cf.equals($$0) && this.dQ().B) {
         this.ci.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.ci.a($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.ci.b($$0);
   }

   @Override
   public boolean i() {
      return this.ci.d();
   }

   @Override
   public boolean f() {
      return this.bE() && !this.p_();
   }

   @Override
   public void a(@Nullable avi $$0) {
      this.ci.a(true);
      if ($$0 != null) {
         this.dQ().a(null, this, avh.ye, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bU.a(1, new cas(this, 1.65));
      this.bU.a(2, new bzl(this, 1.0));
      this.cj = new cbh(this, 1.4, $$0 -> $$0.a(awf.au), false);
      this.bU.a(3, this.cj);
      this.bU.a(4, new ckd.a(this, 1.0));
      this.bU.a(5, new bzy(this, 1.0));
      this.bU.a(7, new caw(this, 1.0, 60));
      this.bU.a(8, new cah(this, cmk.class, 8.0F));
      this.bU.a(8, new cau(this));
      this.bU.a(9, new cah(this, ckd.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(cg, $$0);
      buf $$1 = this.f(buj.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(cb);
         } else {
            $$1.e(cb);
         }
      }
   }

   public boolean s() {
      return this.ao.a(cg);
   }

   @Override
   public boolean a(eoh $$0) {
      return $$0.a(awc.b);
   }

   @Override
   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayg.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dci $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btb cR() {
      return (btb)(this.i() && this.cU() instanceof cmk $$0 && $$0.b(cuf.nS) ? $$0 : super.cR());
   }

   @Override
   public ewf b(btb $$0) {
      ewf[] $$1 = new ewf[]{
         a((double)this.dk(), (double)$$0.dk(), $$0.dG()),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() - 22.5F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() + 22.5F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() - 45.0F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dG() + 45.0F)
      };
      Set<ja> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cL().e;
      double $$4 = this.cL().b - 0.5;
      ja.a $$5 = new ja.a();

      for (ewf $$6 : $$1) {
         $$5.b(this.dv() + $$6.c, $$3, this.dB() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(jf.a);
         }
      }

      for (ja $$8 : $$2) {
         if (!this.dQ().b_($$8).a(awc.b)) {
            double $$9 = this.dQ().j($$8);
            if (cok.a($$9)) {
               ewf $$10 = ewf.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fF().iterator();

               while (var14.hasNext()) {
                  btn $$11 = (btn)var14.next();
                  ewa $$12 = $$0.f($$11);
                  if (cok.a(this.dQ(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ewf(this.dv(), this.cL().e, this.dB());
   }

   @Override
   protected void a(cmk $$0, ewf $$1) {
      this.a($$0.dG(), $$0.dI() * 0.5F);
      this.O = this.aY = this.ba = this.dG();
      this.ci.b();
      super.a($$0, $$1);
   }

   @Override
   protected ewf b(cmk $$0, ewf $$1) {
      return new ewf(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmk $$0) {
      return (float)(this.g(buj.v) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.ci.c());
   }

   @Override
   protected float aP() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(this.bt() ? avh.yc : avh.yb, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ci.a(this.dT());
   }

   @Override
   protected void a(double $$0, boolean $$1, dsk $$2, ja $$3) {
      this.aT();
      if (this.bt()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ah.a(140) == 0) {
         this.b(avh.xX);
      } else if (this.gl() && this.ah.a(60) == 0) {
         this.b(avh.xY);
      }

      if (!this.gd()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dsk $$0 = this.dQ().a_(this.dq());
            dsk $$1 = this.bp();
            $$2 = $$0.a(avw.aU) || $$1.a(avw.aU) || this.b(awc.b) > 0.0;
            if (this.dd() instanceof ckd $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.go();
      this.aT();
   }

   private boolean y() {
      return this.cj != null && this.cj.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void go() {
      if (this.bt()) {
         ewk $$0 = ewk.a(this);
         if ($$0.a(djx.d, this.dq(), true) && !this.dQ().b_(this.dq().c()).a(awc.b)) {
            this.d(true);
         } else {
            this.i(this.dt().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bui.a u() {
      return btd.A().a(buj.v, 0.175F).a(buj.m, 16.0);
   }

   @Override
   protected avg v() {
      return !this.gl() && !this.y() ? avh.xW : null;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.ya;
   }

   @Override
   protected avg o_() {
      return avh.xZ;
   }

   @Override
   protected boolean r(bsg $$0) {
      return !this.bT() && !this.a(awc.b);
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   protected ccn b(dcf $$0) {
      return new ckd.b(this, $$0);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      if ($$1.a_($$0).u().a(awc.b)) {
         return 10.0F;
      } else {
         return this.bt() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public ckd b(aqm $$0, bsa $$1) {
      return bsm.aZ.a((dcf)$$0);
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.at);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cuf.nL);
      }
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bT() && !$$0.fO()) {
         if (!this.dQ().B) {
            $$0.n(this);
         }

         return bqg.a(this.dQ().B);
      } else {
         bqg $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuc $$4 = $$0.b($$1);
            return $$4.a(cuf.nL) ? $$4.a($$0, this, $$1) : bqg.e;
         } else {
            if ($$2 && !this.aX()) {
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.yd, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayo $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            btd $$5 = bsm.bx.a((dcf)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new ckj.b(ckj.a($$4), false));
               $$5.a(bsn.a, new cuc(cuf.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bsa $$6 = bsm.aZ.a((dcf)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsa.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private btu a(dcu $$0, bqe $$1, btd $$2, @Nullable btu $$3) {
      $$2.b(this.dv(), this.dx(), this.dB(), this.dG(), 0.0F);
      $$2.a($$0, $$1, btf.g, $$3);
      $$2.a(this, true);
      return new bsa.a(0.0F);
   }

   static class a extends cam {
      private final ckd g;

      a(ckd $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ja k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bt() && this.a(this.g.dQ(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bt() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dci $$0, ja $$1) {
         return $$0.a_($$1).a(dfj.H) && $$0.a_($$1.c()).a(eow.a);
      }
   }

   static class b extends ccm {
      b(ckd $$0, dcf $$1) {
         super($$0, $$1);
      }

      @Override
      protected eox a(int $$0) {
         this.o = new epd();
         this.o.a(true);
         return new eox(this.o, $$0);
      }

      @Override
      protected boolean a(eoy $$0) {
         return $$0 != eoy.i && $$0 != eoy.o && $$0 != eoy.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ja $$0) {
         return this.b.a_($$0).a(dfj.H) || super.a($$0);
      }
   }
}
