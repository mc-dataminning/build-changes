import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class ckl extends cin implements dvj {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final ajm<Integer> ci = ajq.a(ckl.class, ajo.b);
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
   private int cy;
   private int cA;
   private int cB;
   public brc b = new brc();
   public brc c = new brc();
   public brc d = new brc();
   public brc e = new brc();
   public brc bY = new brc();
   public brc bZ = new brc();
   private final dux<dvj.b> cC;
   private final dvj.d cD;
   private dvj.a cE;
   ckk cF = new ckk(this::b, Collections.emptyList());

   public ckl(brn<? extends cin> $$0, dad $$1) {
      super($$0, $$1);
      this.cD = new ckl.a();
      this.cE = new dvj.a();
      this.cC = new dux<>(new dvj.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(emr.m, 0.0F);
      this.a(emr.q, 8.0F);
      this.a(emr.f, 8.0F);
      this.a(emr.i, 8.0F);
      this.a(emr.o, 0.0F);
      this.a(emr.n, 0.0F);
   }

   @Override
   public zb<abm> dj() {
      return new abn(this, this.c(bsl.n) ? 1 : 0);
   }

   @Override
   public void a(abn $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bsl.n);
      }
   }

   @Override
   public boolean a(dag $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dl()));
   }

   @Override
   public float a(in $$0, dag $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bqf $$0) {
      return this.gt() && !$$0.a(avt.e) ? true : super.b($$0);
   }

   boolean gt() {
      return this.c(bsl.o) || this.c(bsl.n);
   }

   @Override
   protected boolean o(brh $$0) {
      return false;
   }

   @Override
   public boolean fM() {
      return true;
   }

   @Override
   protected float aM() {
      return this.aa + 0.55F;
   }

   public static btg.a r() {
      return cin.gv().a(bth.q, 500.0).a(bth.r, 0.3F).a(bth.n, 1.0).a(bth.d, 1.5).a(bth.c, 30.0);
   }

   @Override
   public boolean ba() {
      return true;
   }

   @Override
   protected float fc() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avb v() {
      return !this.c(bsl.l) && !this.gt() ? this.y().b() : null;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Bz;
   }

   @Override
   protected avb o_() {
      return avc.Bv;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.BJ, 10.0F, 1.0F);
   }

   @Override
   public boolean C(brh $$0) {
      this.dN().a(this, (byte)4);
      this.a(avc.Bu, 10.0F, this.fd());
      bxs.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(ajq.a $$0) {
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
      if (this.dN() instanceof aqh $$0) {
         dvj.c.a($$0, this.cE, this.cD);
         if (this.fV() || this.V()) {
            ckm.a((bsa)this);
         }
      }

      super.l();
      if (this.dN().x_()) {
         if (this.ai % this.gx() == 0) {
            this.cA = 10;
            if (!this.aU()) {
               this.dN().a(this.ds(), this.du(), this.dy(), avc.By, this.dc(), 5.0F, this.fd(), false);
            }
         }

         this.cy = this.cx;
         if (this.cx > 0) {
            this.cx--;
         }

         this.cB = this.cA;
         if (this.cA > 0) {
            this.cA--;
         }

         switch (this.ap()) {
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
      aqh $$0 = (aqh)this.dN();
      $$0.af().a("wardenBrain");
      this.dQ().a($$0, this);
      this.dN().af().c();
      super.Y();
      if ((this.ai + this.aj()) % 120 == 0) {
         a($$0, this.dl(), this, 20);
      }

      if (this.ai % 20 == 0) {
         this.cF.a($$0, this::b);
         this.gw();
      }

      ckm.a(this);
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
      float $$0 = (float)this.u() / (float)ckj.c.a();
      return 40 - axz.d(axz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return axz.i($$0, (float)this.cy, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return axz.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(brc $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayg $$1 = this.ej();
         dqh $$2 = this.bn();
         if ($$2.l() != djk.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.ds() + (double)axz.b($$1, -0.7F, 0.7F);
               double $$5 = this.du();
               double $$6 = this.dy() + (double)axz.b($$1, -0.7F, 0.7F);
               this.dN().a(new ko(kx.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajm<?> $$0) {
      if (at.equals($$0)) {
         switch (this.ap()) {
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
   public boolean a(czv $$0) {
      return this.gt();
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      return ckm.a(this, $$0);
   }

   @Override
   public btb<ckl> dQ() {
      return (btb<ckl>)super.dQ();
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   public void a(BiConsumer<dux<?>, aqh> $$0) {
      if (this.dN() instanceof aqh $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable brh $$0) {
      if ($$0 instanceof bsa $$1
         && this.dN() == $$0.dN()
         && brm.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != brn.d
         && $$1.ai() != brn.bl
         && !$$1.cs()
         && !$$1.ez()
         && this.dN().C_().a($$1.cI())) {
         return true;
      }

      return false;
   }

   public static void a(aqh $$0, etp $$1, @Nullable brh $$2, int $$3) {
      bqt $$4 = new bqt(bqv.G, 260, 0, false, false);
      bqu.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ckk.a(this::b).encodeStart(uo.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dvj.a.a.encodeStart(uo.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         ckk.a(this::b).parse(new Dynamic(uo.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gw();
      }

      if ($$0.b("listener", 10)) {
         dvj.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gy() {
      if (!this.c(bsl.l)) {
         this.a(this.y().c(), 10.0F, this.fd());
      }
   }

   public ckj y() {
      return ckj.a(this.gz());
   }

   private int gz() {
      return this.cF.b(this.p());
   }

   public void c(brh $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable brh $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable brh $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         ckm.a((bsa)this);
         boolean $$3 = !(this.dQ().c(cbd.o).orElse(null) instanceof clh);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof clh && $$3 && ckj.a($$4).d()) {
            this.dQ().b(cbd.o);
         }

         if ($$2) {
            this.gy();
         }
      }
   }

   public Optional<bsa> gp() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bsa p() {
      return this.dQ().c(cbd.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.dQ().a(cbd.aE, azb.a, 1200L);
      if ($$2 == bse.k) {
         this.b(bsl.n);
         this.dQ().a(cbd.aC, azb.a, (long)ckm.a);
         this.a(avc.Br, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dN().B && !this.gf() && !this.gt()) {
         brh $$3 = $$0.d();
         this.a($$3, ckj.c.a() + 20, false);
         if (this.bE.c(cbd.o).isEmpty() && $$3 instanceof bsa $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bsa $$0) {
      this.dQ().b(cbd.ay);
      this.dQ().a(cbd.o, $$0);
      this.dQ().b(cbd.E);
      bxs.a(this, 200);
   }

   @Override
   public brk e(bsl $$0) {
      brk $$1 = super.e($$0);
      return this.gt() ? brk.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean by() {
      return !this.gt() && super.by();
   }

   @Override
   protected void D(brh $$0) {
      if (!this.gf() && !this.dQ().a(cbd.aH)) {
         this.dQ().a(cbd.aH, azb.a, 20L);
         this.d($$0);
         ckm.a(this, $$0.dn());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public ckk gq() {
      return this.cF;
   }

   @Override
   protected cbl b(dad $$0) {
      return new cbk(this, $$0) {
         @Override
         protected emq a(int $$0) {
            this.o = new emw();
            this.o.a(true);
            return new emq(this.o, $$0) {
               @Override
               protected float a(emm $$0, emm $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dvj.a gr() {
      return this.cE;
   }

   @Override
   public dvj.d gs() {
      return this.cD;
   }

   class a implements dvj.d {
      private static final int b = 16;
      private final dve c = new duy(ckl.this, ckl.this.cJ());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dve b() {
         return this.c;
      }

      @Override
      public awg<dva> c() {
         return avx.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqh $$0, in $$1, iw<dva> $$2, dva.a $$3) {
         if (!ckl.this.gf() && !ckl.this.ez() && !ckl.this.dQ().a(cbd.aI) && !ckl.this.gt() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bsa $$4 && !ckl.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqh $$0, in $$1, iw<dva> $$2, @Nullable brh $$3, @Nullable brh $$4, float $$5) {
         if (!ckl.this.ez()) {
            ckl.this.bE.a(cbd.aI, azb.a, 40L);
            $$0.a(ckl.this, (byte)61);
            ckl.this.a(avc.BK, 5.0F, ckl.this.fd());
            in $$6 = $$1;
            if ($$4 != null) {
               if (ckl.this.a($$4, 30.0)) {
                  if (ckl.this.dQ().a(cbd.aA)) {
                     if (ckl.this.b($$4)) {
                        $$6 = $$4.dn();
                     }

                     ckl.this.d($$4);
                  } else {
                     ckl.this.a($$4, 10, true);
                  }
               }

               ckl.this.dQ().a(cbd.aA, azb.a, 100L);
            } else {
               ckl.this.d($$3);
            }

            if (!ckl.this.y().d()) {
               Optional<bsa> $$7 = ckl.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  ckm.a(ckl.this, $$6);
               }
            }
         }
      }
   }
}
