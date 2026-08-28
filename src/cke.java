import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cke extends ces implements bsz, bts {
   private static final UUID ca = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bui cb = new bui(ca, "Strider suffocating modifier", -0.34F, bui.a.b);
   private static final float cd = 0.35F;
   private static final float ce = 0.55F;
   private static final ajp<Integer> cf = ajt.a(cke.class, ajr.b);
   private static final ajp<Boolean> cg = ajt.a(cke.class, ajr.k);
   private static final ajp<Boolean> ch = ajt.a(cke.class, ajr.k);
   private final bsy ci = new bsy(this.ao, cf, ch);
   @Nullable
   private cbi cj;

   public cke(bsn<? extends cke> $$0, dcg $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(epa.j, -1.0F);
      this.a(epa.i, 0.0F);
      this.a(epa.n, 0.0F);
      this.a(epa.o, 0.0F);
   }

   public static boolean c(bsn<cke> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      ja.a $$5 = $$3.j();

      do {
         $$5.c(jf.b);
      } while ($$1.b_($$5).a(awc.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cf.equals($$0) && this.dR().B) {
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
      return this.bF() && !this.o_();
   }

   @Override
   public void a(@Nullable avi $$0) {
      this.ci.a(true);
      if ($$0 != null) {
         this.dR().a(null, this, avh.ye, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bU.a(1, new cat(this, 1.65));
      this.bU.a(2, new bzm(this, 1.0));
      this.cj = new cbi(this, 1.4, $$0 -> $$0.a(awf.au), false);
      this.bU.a(3, this.cj);
      this.bU.a(4, new cke.a(this, 1.0));
      this.bU.a(5, new bzz(this, 1.0));
      this.bU.a(7, new cax(this, 1.0, 60));
      this.bU.a(8, new cai(this, cml.class, 8.0F));
      this.bU.a(8, new cav(this));
      this.bU.a(9, new cai(this, cke.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(cg, $$0);
      bug $$1 = this.f(buk.v);
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
   public boolean a(eoj $$0) {
      return $$0.a(awc.b);
   }

   @Override
   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aV.a());
      float $$4 = this.aV.b();
      float $$5 = 0.12F * ayg.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcj $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btc cS() {
      return (btc)(this.i() && this.cV() instanceof cml $$0 && $$0.b(cug.nS) ? $$0 : super.cS());
   }

   @Override
   public ewh b(btc $$0) {
      ewh[] $$1 = new ewh[]{
         a((double)this.dl(), (double)$$0.dl(), $$0.dH()),
         a((double)this.dl(), (double)$$0.dl(), $$0.dH() - 22.5F),
         a((double)this.dl(), (double)$$0.dl(), $$0.dH() + 22.5F),
         a((double)this.dl(), (double)$$0.dl(), $$0.dH() - 45.0F),
         a((double)this.dl(), (double)$$0.dl(), $$0.dH() + 45.0F)
      };
      Set<ja> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cM().e;
      double $$4 = this.cM().b - 0.5;
      ja.a $$5 = new ja.a();

      for (ewh $$6 : $$1) {
         $$5.b(this.dw() + $$6.c, $$3, this.dC() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(jf.a);
         }
      }

      for (ja $$8 : $$2) {
         if (!this.dR().b_($$8).a(awc.b)) {
            double $$9 = this.dR().j($$8);
            if (col.a($$9)) {
               ewh $$10 = ewh.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fG().iterator();

               while (var14.hasNext()) {
                  bto $$11 = (bto)var14.next();
                  ewc $$12 = $$0.f($$11);
                  if (col.a(this.dR(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ewh(this.dw(), this.cM().e, this.dC());
   }

   @Override
   protected void a(cml $$0, ewh $$1) {
      this.a($$0.dH(), $$0.dJ() * 0.5F);
      this.O = this.aZ = this.bb = this.dH();
      this.ci.b();
      super.a($$0, $$1);
   }

   @Override
   protected ewh b(cml $$0, ewh $$1) {
      return new ewh(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cml $$0) {
      return (float)(this.g(buk.v) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.ci.c());
   }

   @Override
   protected float aQ() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(this.bu() ? avh.yc : avh.yb, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ci.a(this.dU());
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
      this.aU();
      if (this.bu()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.x() && this.ah.a(140) == 0) {
         this.b(avh.xX);
      } else if (this.gk() && this.ah.a(60) == 0) {
         this.b(avh.xY);
      }

      if (!this.gc()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dsl $$0 = this.dR().a_(this.dr());
            dsl $$1 = this.bq();
            $$2 = $$0.a(avw.aU) || $$1.a(avw.aU) || this.b(awc.b) > 0.0;
            if (this.de() instanceof cke $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gn();
      this.aU();
   }

   private boolean x() {
      return this.cj != null && this.cj.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gn() {
      if (this.bu()) {
         ewm $$0 = ewm.a(this);
         if ($$0.a(djy.d, this.dr(), true) && !this.dR().b_(this.dr().c()).a(awc.b)) {
            this.e(true);
         } else {
            this.j(this.du().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static buj.a t() {
      return bte.A().a(buk.v, 0.175F).a(buk.m, 16.0);
   }

   @Override
   protected avg v() {
      return !this.gk() && !this.x() ? avh.xW : null;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.ya;
   }

   @Override
   protected avg n_() {
      return avh.xZ;
   }

   @Override
   protected boolean r(bsh $$0) {
      return !this.bU() && !this.a(awc.b);
   }

   @Override
   public boolean fn() {
      return true;
   }

   @Override
   public boolean bS() {
      return false;
   }

   @Override
   protected cco b(dcg $$0) {
      return new cke.b(this, $$0);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      if ($$1.a_($$0).u().a(awc.b)) {
         return 10.0F;
      } else {
         return this.bu() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cke b(aqm $$0, bsb $$1) {
      return bsn.aZ.a((dcg)$$0);
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.at);
   }

   @Override
   protected void eB() {
      super.eB();
      if (this.i()) {
         this.a(cug.nL);
      }
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bU() && !$$0.fP()) {
         if (!this.dR().B) {
            $$0.n(this);
         }

         return bqh.a(this.dR().B);
      } else {
         bqh $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cud $$4 = $$0.b($$1);
            return $$4.a(cug.nL) ? $$4.a($$0, this, $$1) : bqh.e;
         } else {
            if ($$2 && !this.aY()) {
               this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.yd, this.dg(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, (double)(0.6F * this.cN()), (double)(this.dl() * 0.4F));
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayo $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bte $$5 = bsn.bx.a((dcg)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new ckk.b(ckk.a($$4), false));
               $$5.a(bso.a, new cud(cug.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bsb $$6 = bsn.aZ.a((dcg)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsb.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private btv a(dcv $$0, bqf $$1, bte $$2, @Nullable btv $$3) {
      $$2.b(this.dw(), this.dy(), this.dC(), this.dH(), 0.0F);
      $$2.a($$0, $$1, btg.g, $$3);
      $$2.a(this, true);
      return new bsb.a(0.0F);
   }

   static class a extends can {
      private final cke g;

      a(cke $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ja k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bu() && this.a(this.g.dR(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bu() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dcj $$0, ja $$1) {
         return $$0.a_($$1).a(dfk.H) && $$0.a_($$1.c()).a(eoy.a);
      }
   }

   static class b extends ccn {
      b(cke $$0, dcg $$1) {
         super($$0, $$1);
      }

      @Override
      protected eoz a(int $$0) {
         this.o = new epf();
         this.o.a(true);
         return new eoz(this.o, $$0);
      }

      @Override
      protected boolean a(epa $$0) {
         return $$0 != epa.i && $$0 != epa.o && $$0 != epa.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ja $$0) {
         return this.b.a_($$0).a(dfk.H) || super.a($$0);
      }
   }
}
