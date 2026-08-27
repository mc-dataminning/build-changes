import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class clc extends cje implements dwf {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final ajs<Integer> ci = ajw.a(clc.class, aju.b);
   private static final int cj = 200;
   private static final int ck = 260;
   private static final int cl = 20;
   private static final int cm = 120;
   private static final int cn = 20;
   private static final int co = 35;
   private static final int cp = 10;
   private static final int cq = 20;
   private static final int cr = 100;
   private static final int cs = 20;
   private static final int ct = 30;
   private static final float cu = 4.5F;
   private static final float cv = 0.7F;
   private static final int cw = 30;
   private int cx;
   private int cz;
   private int cA;
   private int cB;
   public brr b = new brr();
   public brr c = new brr();
   public brr d = new brr();
   public brr e = new brr();
   public brr bY = new brr();
   public brr bZ = new brr();
   private final dvt<dwf.b> cC;
   private final dwf.d cD;
   private dwf.a cE;
   clb cF = new clb(this::b, Collections.emptyList());

   public clc(bsc<? extends cje> $$0, daz $$1) {
      super($$0, $$1);
      this.cD = new clc.a();
      this.cE = new dwf.a();
      this.cC = new dvt<>(new dwf.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(enn.m, 0.0F);
      this.a(enn.q, 8.0F);
      this.a(enn.f, 8.0F);
      this.a(enn.i, 8.0F);
      this.a(enn.o, 0.0F);
      this.a(enn.n, 0.0F);
   }

   @Override
   public ze<abq> dl() {
      return new abr(this, this.c(btc.n) ? 1 : 0);
   }

   @Override
   public void a(abr $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(btc.n);
      }
   }

   @Override
   public boolean a(dbc $$0) {
      return super.a($$0) && $$0.a(this, this.ak().n().a(this.dn()));
   }

   @Override
   public float a(io $$0, dbc $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bqp $$0) {
      return this.gt() && !$$0.a(avz.e) ? true : super.b($$0);
   }

   boolean gt() {
      return this.c(btc.o) || this.c(btc.n);
   }

   @Override
   protected boolean o(brw $$0) {
      return false;
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   protected float aO() {
      return this.aa + 0.55F;
   }

   public static btx.a s() {
      return cje.gv().a(bty.q, 500.0).a(bty.r, 0.3F).a(bty.n, 1.0).a(bty.d, 1.5).a(bty.c, 30.0);
   }

   @Override
   public boolean bc() {
      return true;
   }

   @Override
   protected float fe() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avh v() {
      return !this.c(btc.l) && !this.gt() ? this.y().b() : null;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.BK;
   }

   @Override
   protected avh o_() {
      return avi.BG;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.BU, 10.0F, 1.0F);
   }

   @Override
   public boolean C(brw $$0) {
      this.dP().a(this, (byte)4);
      this.a(avi.BF, 10.0F, this.ff());
      byj.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(ci, 0);
   }

   public int u() {
      return this.ao.a(ci);
   }

   private void gw() {
      this.ao.a(ci, this.gz());
   }

   @Override
   public void l() {
      if (this.dP() instanceof aqn $$0) {
         dwf.c.a($$0, this.cE, this.cD);
         if (this.fV() || this.V()) {
            cld.a((bsq)this);
         }
      }

      super.l();
      if (this.dP().x_()) {
         if (this.ai % this.gx() == 0) {
            this.cA = 10;
            if (!this.aW()) {
               this.dP().a(this.du(), this.dw(), this.dA(), avi.BJ, this.de(), 5.0F, this.ff(), false);
            }
         }

         this.cz = this.cx;
         if (this.cx > 0) {
            this.cx--;
         }

         this.cB = this.cA;
         if (this.cA > 0) {
            this.cA--;
         }

         switch (this.ar()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void Y() {
      aqn $$0 = (aqn)this.dP();
      $$0.af().a("wardenBrain");
      this.dS().a($$0, this);
      this.dP().af().c();
      super.Y();
      if ((this.ai + this.al()) % 120 == 0) {
         a($$0, this.dn(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cF.a($$0, this::b);
         this.gw();
      }

      cld.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bY.a(this.ai);
      } else if ($$0 == 61) {
         this.cx = 10;
      } else if ($$0 == 62) {
         this.bZ.a(this.ai);
      } else {
         super.b($$0);
      }
   }

   private int gx() {
      float $$0 = (float)this.u() / (float)cla.c.a();
      return 40 - ayf.d(ayf.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return ayf.i($$0, (float)this.cz, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return ayf.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(brr $$0) {
      if ((float)$$0.b() < 4500.0F) {
         aym $$1 = this.el();
         drd $$2 = this.bp();
         if ($$2.l() != dkg.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.du() + (double)ayf.b($$1, -0.7F, 0.7F);
               double $$5 = this.dw();
               double $$6 = this.dA() + (double)ayf.b($$1, -0.7F, 0.7F);
               this.dP().a(new kp(ky.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajs<?> $$0) {
      if (at.equals($$0)) {
         switch (this.ar()) {
            case n:
               this.d.a(this.ai);
               break;
            case o:
               this.e.a(this.ai);
               break;
            case l:
               this.b.a(this.ai);
               break;
            case m:
               this.c.a(this.ai);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dar $$0) {
      return this.gt();
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cld.a(this, $$0);
   }

   @Override
   public bts<clc> dS() {
      return (bts<clc>)super.dS();
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   public void a(BiConsumer<dvt<?>, aqn> $$0) {
      if (this.dP() instanceof aqn $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable brw $$0) {
      if ($$0 instanceof bsq $$1
         && this.dP() == $$0.dP()
         && bsb.e.test($$0)
         && !this.s($$0)
         && $$1.ak() != bsc.d
         && $$1.ak() != bsc.bm
         && !$$1.cu()
         && !$$1.eB()
         && this.dP().C_().a($$1.cK())) {
         return true;
      }

      return false;
   }

   public static void a(aqn $$0, eum $$1, @Nullable brw $$2, int $$3) {
      bre $$4 = new bre(brg.G, 260, 0, false, false);
      brf.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      clb.a(this::b).encodeStart(ur.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dwf.a.a.encodeStart(ur.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         clb.a(this::b).parse(new Dynamic(ur.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gw();
      }

      if ($$0.b("listener", 10)) {
         dwf.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gy() {
      if (!this.c(btc.l)) {
         this.a(this.y().c(), 10.0F, this.ff());
      }
   }

   public cla y() {
      return cla.a(this.gz());
   }

   private int gz() {
      return this.cF.b(this.p());
   }

   public void c(brw $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable brw $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable brw $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         cld.a((bsq)this);
         boolean $$3 = !(this.dS().c(cbu.o).orElse(null) instanceof cly);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof cly && $$3 && cla.a($$4).d()) {
            this.dS().b(cbu.o);
         }

         if ($$2) {
            this.gy();
         }
      }
   }

   public Optional<bsq> gp() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bsq p() {
      return this.dS().c(cbu.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.dS().a(cbu.aE, azh.a, 1200L);
      if ($$2 == bsu.k) {
         this.b(btc.n);
         this.dS().a(cbu.aC, azh.a, (long)cld.a);
         this.a(avi.BC, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dP().B && !this.gf() && !this.gt()) {
         brw $$3 = $$0.d();
         this.a($$3, cla.c.a() + 20, false);
         if (this.bD.c(cbu.o).isEmpty() && $$3 instanceof bsq $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bsq $$0) {
      this.dS().b(cbu.ay);
      this.dS().a(cbu.o, $$0);
      this.dS().b(cbu.E);
      byj.a(this, 200);
   }

   @Override
   public brz e(btc $$0) {
      brz $$1 = super.e($$0);
      return this.gt() ? brz.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bA() {
      return !this.gt() && super.bA();
   }

   @Override
   protected void D(brw $$0) {
      if (!this.gf() && !this.dS().a(cbu.aH)) {
         this.dS().a(cbu.aH, azh.a, 20L);
         this.d($$0);
         cld.a(this, $$0.dp());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public clb gq() {
      return this.cF;
   }

   @Override
   protected ccc b(daz $$0) {
      return new ccb(this, $$0) {
         @Override
         protected enm a(int $$0) {
            this.o = new ens();
            this.o.a(true);
            return new enm(this.o, $$0) {
               @Override
               protected float a(eni $$0, eni $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dwf.a gr() {
      return this.cE;
   }

   @Override
   public dwf.d gs() {
      return this.cD;
   }

   class a implements dwf.d {
      private static final int b = 16;
      private final dwa c = new dvu(clc.this, clc.this.cL());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dwa b() {
         return this.c;
      }

      @Override
      public awm<dvw> c() {
         return awd.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqn $$0, io $$1, ix<dvw> $$2, dvw.a $$3) {
         if (!clc.this.gf() && !clc.this.eB() && !clc.this.dS().a(cbu.aI) && !clc.this.gt() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bsq $$4 && !clc.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqn $$0, io $$1, ix<dvw> $$2, @Nullable brw $$3, @Nullable brw $$4, float $$5) {
         if (!clc.this.eB()) {
            clc.this.bD.a(cbu.aI, azh.a, 40L);
            $$0.a(clc.this, (byte)61);
            clc.this.a(avi.BV, 5.0F, clc.this.ff());
            io $$6 = $$1;
            if ($$4 != null) {
               if (clc.this.a($$4, 30.0)) {
                  if (clc.this.dS().a(cbu.aA)) {
                     if (clc.this.b($$4)) {
                        $$6 = $$4.dp();
                     }

                     clc.this.d($$4);
                  } else {
                     clc.this.a($$4, 10, true);
                  }
               }

               clc.this.dS().a(cbu.aA, azh.a, 100L);
            } else {
               clc.this.d($$3);
            }

            if (!clc.this.y().d()) {
               Optional<bsq> $$7 = clc.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cld.a(clc.this, $$6);
               }
            }
         }
      }
   }
}
