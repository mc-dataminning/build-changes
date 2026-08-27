import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjp extends cee implements bsl, bte {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final btu bZ = new btu(bY, "Strider suffocating modifier", -0.34F, btu.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final ajr<Integer> cd = ajv.a(cjp.class, ajt.b);
   private static final ajr<Boolean> ce = ajv.a(cjp.class, ajt.k);
   private static final ajr<Boolean> cf = ajv.a(cjp.class, ajt.k);
   private final bsk cg = new bsk(this.ao, cd, cf);
   @Nullable
   private cau ch;

   public cjp(bsa<? extends cjp> $$0, dax $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(enl.j, -1.0F);
      this.a(enl.i, 0.0F);
      this.a(enl.n, 0.0F);
      this.a(enl.o, 0.0F);
   }

   public static boolean c(bsa<cjp> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      io.a $$5 = $$3.j();

      do {
         $$5.c(it.b);
      } while ($$1.b_($$5).a(awb.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajr<?> $$0) {
      if (cd.equals($$0) && this.dP().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean i() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bD() && !this.p_();
   }

   @Override
   public void a(@Nullable avi $$0) {
      this.cg.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avh.yb, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bS.a(1, new caf(this, 1.65));
      this.bS.a(2, new byy(this, 1.0));
      this.ch = new cau(this, 1.4, $$0 -> $$0.a(awe.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cjp.a(this, 1.0));
      this.bS.a(5, new bzl(this, 1.0));
      this.bS.a(7, new caj(this, 1.0, 60));
      this.bS.a(8, new bzu(this, clw.class, 8.0F));
      this.bS.a(8, new cah(this));
      this.bS.a(9, new bzu(this, cjp.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      bts $$1 = this.f(btw.r);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bZ);
         } else {
            $$1.e(bZ);
         }
      }
   }

   public boolean s() {
      return this.ao.a(ce);
   }

   @Override
   public boolean a(emu $$0) {
      return $$0.a(awb.b);
   }

   @Override
   protected euk a(bru $$0, brx $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aV.a());
      float $$4 = this.aV.b();
      float $$5 = 0.12F * ayd.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dba $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bso cQ() {
      return (bso)(this.i() && this.cT() instanceof clw $$0 && $$0.b(ctr.nS) ? $$0 : super.cQ());
   }

   @Override
   public euk b(bso $$0) {
      euk[] $$1 = new euk[]{
         a((double)this.dj(), (double)$$0.dj(), $$0.dF()),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 45.0F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 45.0F)
      };
      Set<io> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cK().e;
      double $$4 = this.cK().b - 0.5;
      io.a $$5 = new io.a();

      for (euk $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(it.a);
         }
      }

      for (io $$8 : $$2) {
         if (!this.dP().b_($$8).a(awb.b)) {
            double $$9 = this.dP().j($$8);
            if (cnw.a($$9)) {
               euk $$10 = euk.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  bta $$11 = (bta)var14.next();
                  euf $$12 = $$0.f($$11);
                  if (cnw.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new euk(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(clw $$0, euk $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aZ = this.bb = this.dF();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected euk b(clw $$0, euk $$1) {
      return new euk(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(clw $$0) {
      return (float)(this.g(btw.r) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(this.bs() ? avh.xZ : avh.xY, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.el());
   }

   @Override
   protected void a(double $$0, boolean $$1, drb $$2, io $$3) {
      this.aS();
      if (this.bs()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ah.a(140) == 0) {
         this.b(avh.xU);
      } else if (this.gm() && this.ah.a(60) == 0) {
         this.b(avh.xV);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            drb $$0 = this.dP().a_(this.dp());
            drb $$1 = this.bo();
            $$2 = $$0.a(avw.aU) || $$1.a(avw.aU) || this.b(awb.b) > 0.0;
            if (this.dc() instanceof cjp $$3 && $$3.s()) {
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
      this.aS();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gp() {
      if (this.bs()) {
         eup $$0 = eup.a(this);
         if ($$0.a(dio.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awb.b)) {
            this.d(true);
         } else {
            this.g(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static btv.a u() {
      return bsq.A().a(btw.r, 0.175F).a(btw.k, 16.0);
   }

   @Override
   protected avg v() {
      return !this.gm() && !this.y() ? avh.xT : null;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.xX;
   }

   @Override
   protected avg o_() {
      return avh.xW;
   }

   @Override
   protected boolean r(bru $$0) {
      return !this.bS() && !this.a(awb.b);
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   protected cca b(dax $$0) {
      return new cjp.b(this, $$0);
   }

   @Override
   public float a(io $$0, dba $$1) {
      if ($$1.a_($$0).u().a(awb.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cjp b(aqm $$0, bro $$1) {
      return bsa.aZ.a((dax)$$0);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(ctr.nL);
      }
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bpu.a(this.dP().B);
      } else {
         bpu $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cto $$4 = $$0.b($$1);
            return $$4.a(ctr.nL) ? $$4.a($$0, this, $$1) : bpu.d;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), avh.ya, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayk $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bsq $$5 = bsa.bx.a((dax)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cjv.b(cjv.a($$4), false));
               $$5.a(bsb.a, new cto(ctr.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bro $$6 = bsa.aZ.a((dax)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bro.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bth a(dbm $$0, bps $$1, bsq $$2, @Nullable bth $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, bss.g, $$3);
      $$2.a(this, true);
      return new bro.a(0.0F);
   }

   static class a extends bzz {
      private final cjp g;

      a(cjp $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public io k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bs() && this.a(this.g.dP(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bs() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dba $$0, io $$1) {
         return $$0.a_($$1).a(dea.H) && $$0.a_($$1.c()).a(enj.a);
      }
   }

   static class b extends cbz {
      b(cjp $$0, dax $$1) {
         super($$0, $$1);
      }

      @Override
      protected enk a(int $$0) {
         this.o = new enq();
         this.o.a(true);
         return new enk(this.o, $$0);
      }

      @Override
      protected boolean a(enl $$0) {
         return $$0 != enl.i && $$0 != enl.o && $$0 != enl.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(io $$0) {
         return this.b.a_($$0).a(dea.H) || super.a($$0);
      }
   }
}
