import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cay extends bvu implements bkg, bkz {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bln bU = new bln(bT, "Strider suffocating modifier", -0.34F, bln.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cnk bY = cnk.a(ckm.dh);
   private static final cnk bZ = cnk.a(ckm.dh, ckm.ng);
   private static final afc<Integer> ca = aff.a(cay.class, afe.b);
   private static final afc<Boolean> cb = aff.a(cay.class, afe.k);
   private static final afc<Boolean> cc = aff.a(cay.class, afe.k);
   private final bkf cd = new bkf(this.an, ca, cc);
   @Nullable
   private bsm ce;

   public cay(bjx<? extends cay> $$0, cqz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(ebp.j, -1.0F);
      this.a(ebp.i, 0.0F);
      this.a(ebp.n, 0.0F);
      this.a(ebp.o, 0.0F);
   }

   public static boolean c(bjx<cay> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      ht.a $$5 = $$3.j();

      do {
         $$5.c(hx.b);
      } while ($$1.b_($$5).a(aqx.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(afc<?> $$0) {
      if (ca.equals($$0) && this.dL().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bv() && !this.n_();
   }

   @Override
   public void a(@Nullable aqe $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, aqd.wt, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bO.a(1, new brx(this, 1.65));
      this.bO.a(2, new bqq(this, 1.0));
      this.ce = new bsm(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cay.a(this, 1.0));
      this.bO.a(5, new brd(this, 1.0));
      this.bO.a(7, new bsb(this, 1.0, 60));
      this.bO.a(8, new brm(this, ccx.class, 8.0F));
      this.bO.a(8, new brz(this));
      this.bO.a(9, new brm(this, cay.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bll $$1 = this.a(blp.m);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   public boolean s() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(ebe $$0) {
      return $$0.a(aqx.b);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * asy.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(crc $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bkj cN() {
      return (bkj)(this.i() && this.cQ() instanceof ccx $$0 && $$0.b(ckm.ng) ? $$0 : super.cN());
   }

   @Override
   public eif b(bkj $$0) {
      eif[] $$1 = new eif[]{
         a((double)this.df(), (double)$$0.df(), $$0.dB()),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 45.0F)
      };
      Set<ht> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      ht.a $$5 = new ht.a();

      for (eif $$6 : $$1) {
         $$5.b(this.dq() + $$6.c, $$3, this.dw() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(hx.a);
         }
      }

      for (ht $$8 : $$2) {
         if (!this.dL().b_($$8).a(aqx.b)) {
            double $$9 = this.dL().i($$8);
            if (cet.a($$9)) {
               eif $$10 = eif.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bkv $$11 = (bkv)var14.next();
                  eia $$12 = $$0.e($$11);
                  if (cet.a(this.dL(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eif(this.dq(), this.cG().e, this.dw());
   }

   @Override
   protected void a(ccx $$0, eif $$1) {
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected eif b(ccx $$0, eif $$1) {
      return new eif(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(ccx $$0) {
      return (float)(this.b(blp.m) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(this.bl() ? aqd.wr : aqd.wq, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ef());
   }

   @Override
   protected void a(double $$0, boolean $$1, dgb $$2, ht $$3) {
      this.aO();
      if (this.bl()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ag.a(140) == 0) {
         this.a(aqd.wm, 1.0F, this.eW());
      } else if (this.gb() && this.ag.a(60) == 0) {
         this.a(aqd.wn, 1.0F, this.eW());
      }

      if (!this.fU()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dgb $$0 = this.dL().a_(this.dl());
            dgb $$1 = this.bh();
            $$2 = $$0.a(aqs.aT) || $$1.a(aqs.aT) || this.b(aqx.b) > 0.0;
            if (this.cY() instanceof cay $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.ge();
      this.aO();
   }

   private boolean y() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void ge() {
      if (this.bl()) {
         eik $$0 = eik.a(this);
         if ($$0.a(cyo.d, this.dl(), true) && !this.dL().b_(this.dl().c()).a(aqx.b)) {
            this.c(true);
         } else {
            this.f(this.do().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static blo.a t() {
      return bkl.A().a(blp.m, 0.175F).a(blp.g, 16.0);
   }

   @Override
   protected aqc w() {
      return !this.gb() && !this.y() ? aqd.wl : null;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.wp;
   }

   @Override
   protected aqc m_() {
      return aqd.wo;
   }

   @Override
   protected boolean r(bjt $$0) {
      return !this.bO() && !this.a(aqx.b);
   }

   @Override
   public boolean fg() {
      return true;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected bts b(cqz $$0) {
      return new cay.b(this, $$0);
   }

   @Override
   public float a(ht $$0, crc $$1) {
      if ($$1.a_($$0).u().a(aqx.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cay b(alq $$0, bjo $$1) {
      return bjx.aV.a((cqz)$$0);
   }

   @Override
   public boolean m(ckj $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(ckm.mZ);
      }
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bib.a(this.dL().B);
      } else {
         bib $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            ckj $$4 = $$0.b($$1);
            return $$4.a(ckm.mZ) ? $$4.a($$0, this, $$1) : bib.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.ws, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         ate $$5 = $$0.E_();
         if ($$5.a(30) == 0) {
            bkl $$6 = bjx.bs.a((cqz)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cbe.b(cbe.a($$5), false));
               $$6.a(bjy.a, new ckj(ckm.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bjo $$7 = bjx.aV.a((cqz)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bjo.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private blc a(cro $$0, bhz $$1, bkl $$2, @Nullable blc $$3) {
      $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
      $$2.a($$0, $$1, bkn.g, $$3, null);
      $$2.a(this, true);
      return new bjo.a(0.0F);
   }

   static class a extends brr {
      private final cay g;

      a(cay $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ht k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bl() && this.a(this.g.dL(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bl() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(crc $$0, ht $$1) {
         return $$0.a_($$1).a(cuc.H) && $$0.a_($$1.c()).a($$0, $$1, ebu.a);
      }
   }

   static class b extends btr {
      b(cay $$0, cqz $$1) {
         super($$0, $$1);
      }

      @Override
      protected ebv a(int $$0) {
         this.o = new eby();
         this.o.a(true);
         return new ebv(this.o, $$0);
      }

      @Override
      protected boolean a(ebp $$0) {
         return $$0 != ebp.i && $$0 != ebp.o && $$0 != ebp.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ht $$0) {
         return this.b.a_($$0).a(cuc.H) || super.a($$0);
      }
   }
}
