import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class ceu extends ccw implements doi {
   private static final Logger bW = LogUtils.getLogger();
   private static final int bX = 40;
   private static final int bY = 200;
   private static final int bZ = 500;
   private static final float ca = 0.3F;
   private static final float cb = 1.0F;
   private static final float cc = 1.5F;
   private static final int cd = 30;
   private static final agn<Integer> ce = agq.a(ceu.class, agp.b);
   private static final int cf = 200;
   private static final int cg = 260;
   private static final int ch = 20;
   private static final int ci = 120;
   private static final int cj = 20;
   private static final int ck = 35;
   private static final int cl = 10;
   private static final int cm = 20;
   private static final int cn = 100;
   private static final int co = 20;
   private static final int cp = 30;
   private static final float cq = 4.5F;
   private static final float cr = 0.7F;
   private static final int cs = 30;
   private int ct;
   private int cu;
   private int cv;
   private int cx;
   public bls b = new bls();
   public bls c = new bls();
   public bls d = new bls();
   public bls e = new bls();
   public bls bU = new bls();
   public bls bV = new bls();
   private final dnw<doi.b> cy;
   private final doi.d cz;
   private doi.a cA;
   cet cB = new cet(this::a, Collections.emptyList());

   public ceu(bmc<? extends ccw> $$0, ctx $$1) {
      super($$0, $$1);
      this.cz = new ceu.a();
      this.cA = new doi.a();
      this.cy = new dnw<>(new doi.b(this));
      this.bK = 5;
      this.N().a(true);
      this.a(efk.m, 0.0F);
      this.a(efk.q, 8.0F);
      this.a(efk.f, 8.0F);
      this.a(efk.i, 8.0F);
      this.a(efk.o, 0.0F);
      this.a(efk.n, 0.0F);
   }

   @Override
   public xg<zb> di() {
      return new zc(this, this.c(bna.n) ? 1 : 0);
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bna.n);
      }
   }

   @Override
   public boolean a(cua $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dj()));
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bkv $$0) {
      return this.gj() && !$$0.a(ask.e) ? true : super.b($$0);
   }

   boolean gj() {
      return this.c(bna.o) || this.c(bna.n);
   }

   @Override
   protected boolean n(blw $$0) {
      return false;
   }

   @Override
   public boolean fG() {
      return true;
   }

   @Override
   protected float aM() {
      return this.Z + 0.55F;
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 500.0).a(bnu.o, 0.3F).a(bnu.k, 1.0).a(bnu.d, 1.5).a(bnu.c, 30.0);
   }

   @Override
   public boolean aX() {
      return true;
   }

   @Override
   protected float eW() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected ars y() {
      return !this.c(bna.l) && !this.gj() ? this.A().b() : null;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.AS;
   }

   @Override
   protected ars n_() {
      return art.AO;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.Bc, 10.0F, 1.0F);
   }

   @Override
   public boolean B(blw $$0) {
      this.dL().a(this, (byte)4);
      this.a(art.AN, 10.0F, this.eX());
      bsf.a(this, 40);
      return super.B($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ce, 0);
   }

   public int w() {
      return this.an.b(ce);
   }

   private void gm() {
      this.an.b(ce, this.gp());
   }

   @Override
   public void l() {
      if (this.dL() instanceof ane $$0) {
         doi.c.a($$0, this.cA, this.cz);
         if (this.fM() || this.X()) {
            cev.a((bmo)this);
         }
      }

      super.l();
      if (this.dL().y_()) {
         if (this.ah % this.gn() == 0) {
            this.cv = 10;
            if (!this.aU()) {
               this.dL().a(this.dq(), this.ds(), this.dw(), art.AR, this.db(), 5.0F, this.eX(), false);
            }
         }

         this.cu = this.ct;
         if (this.ct > 0) {
            this.ct--;
         }

         this.cx = this.cv;
         if (this.cv > 0) {
            this.cv--;
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
   protected void aa() {
      ane $$0 = (ane)this.dL();
      $$0.af().a("wardenBrain");
      this.dN().a($$0, this);
      this.dL().af().c();
      super.aa();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dj(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cB.a($$0, this::a);
         this.gm();
      }

      cev.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bU.a(this.ah);
      } else if ($$0 == 61) {
         this.ct = 10;
      } else if ($$0 == 62) {
         this.bV.a(this.ah);
      } else {
         super.b($$0);
      }
   }

   private int gn() {
      float $$0 = (float)this.w() / (float)ces.c.a();
      return 40 - aup.d(aup.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float D(float $$0) {
      return aup.i($$0, (float)this.cu, (float)this.ct) / 10.0F;
   }

   public float E(float $$0) {
      return aup.i($$0, (float)this.cx, (float)this.cv) / 10.0F;
   }

   private void a(bls $$0) {
      if ((float)$$0.b() < 4500.0F) {
         auw $$1 = this.eg();
         djp $$2 = this.bk();
         if ($$2.l() != ddd.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dq() + (double)aup.b($$1, -0.7F, 0.7F);
               double $$5 = this.ds();
               double $$6 = this.dw() + (double)aup.b($$1, -0.7F, 0.7F);
               this.dL().a(new jp(jx.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(agn<?> $$0) {
      if (as.equals($$0)) {
         switch (this.ap()) {
            case n:
               this.d.a(this.ah);
               break;
            case o:
               this.e.a(this.ah);
               break;
            case l:
               this.b.a(this.ah);
               break;
            case m:
               this.c.a(this.ah);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(ctp $$0) {
      return this.gj();
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return cev.a(this, $$0);
   }

   @Override
   public bno<ceu> dN() {
      return (bno<ceu>)super.dN();
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   public void a(BiConsumer<dnw<?>, ane> $$0) {
      if (this.dL() instanceof ane $$1) {
         $$0.accept(this.cy, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable blw $$0) {
      if ($$0 instanceof bmo $$1
         && this.dL() == $$0.dL()
         && bmb.e.test($$0)
         && !this.r($$0)
         && $$1.ai() != bmc.e
         && $$1.ai() != bmc.bk
         && !$$1.cr()
         && !$$1.ew()
         && this.dL().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(ane $$0, emc $$1, @Nullable blw $$2, int $$3) {
      blj $$4 = new blj(bll.G, 260, 0, false, false);
      blk.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      cet.a(this::a).encodeStart(tc.a, this.cB).resultOrPartial(bW::error).ifPresent($$1 -> $$0.a("anger", $$1));
      doi.a.a.encodeStart(tc.a, this.cA).resultOrPartial(bW::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cet.a(this::a).parse(new Dynamic(tc.a, $$0.c("anger"))).resultOrPartial(bW::error).ifPresent($$0x -> this.cB = $$0x);
         this.gm();
      }

      if ($$0.b("listener", 10)) {
         doi.a.a.parse(new Dynamic(tc.a, $$0.p("listener"))).resultOrPartial(bW::error).ifPresent($$0x -> this.cA = $$0x);
      }
   }

   private void go() {
      if (!this.c(bna.l)) {
         this.a(this.A().c(), 10.0F, this.eX());
      }
   }

   public ces A() {
      return ces.a(this.gp());
   }

   private int gp() {
      return this.cB.b(this.q());
   }

   public void b(blw $$0) {
      this.cB.a($$0);
   }

   public void c(@Nullable blw $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable blw $$0, int $$1, boolean $$2) {
      if (!this.fV() && this.a($$0)) {
         cev.a((bmo)this);
         boolean $$3 = !(this.dN().c(bvq.o).orElse(null) instanceof cfq);
         int $$4 = this.cB.a($$0, $$1);
         if ($$0 instanceof cfq && $$3 && ces.a($$4).d()) {
            this.dN().b(bvq.o);
         }

         if ($$2) {
            this.go();
         }
      }
   }

   public Optional<bmo> gf() {
      return this.A().d() ? this.cB.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bmo q() {
      return this.dN().c(bvq.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.dN().a(bvq.aE, avt.a, 1200L);
      if ($$2 == bms.k) {
         this.b(bna.n);
         this.dN().a(bvq.aC, avt.a, (long)cev.a);
         this.a(art.AK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dL().B && !this.fV() && !this.gj()) {
         blw $$3 = $$0.d();
         this.a($$3, ces.c.a() + 20, false);
         if (this.bz.c(bvq.o).isEmpty() && $$3 instanceof bmo $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bmo $$0) {
      this.dN().b(bvq.ay);
      this.dN().a(bvq.o, $$0);
      this.dN().b(bvq.E);
      bsf.a(this, 200);
   }

   @Override
   public blz e(bna $$0) {
      blz $$1 = super.e($$0);
      return this.gj() ? blz.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gj() && super.bu();
   }

   @Override
   protected void C(blw $$0) {
      if (!this.fV() && !this.dN().a(bvq.aH)) {
         this.dN().a(bvq.aH, avt.a, 20L);
         this.c($$0);
         cev.a(this, $$0.dl());
      }

      super.C($$0);
   }

   @VisibleForTesting
   public cet gg() {
      return this.cB;
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bvx(this, $$0) {
         @Override
         protected efq a(int $$0) {
            this.o = new eft();
            this.o.a(true);
            return new efq(this.o, $$0) {
               @Override
               protected float a(efm $$0, efm $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public doi.a gh() {
      return this.cA;
   }

   @Override
   public doi.d gi() {
      return this.cz;
   }

   class a implements doi.d {
      private static final int b = 16;
      private final dod c = new dnx(ceu.this, ceu.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dod b() {
         return this.c;
      }

      @Override
      public asx<dnz> c() {
         return aso.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ane $$0, hx $$1, ih<dnz> $$2, dnz.a $$3) {
         if (!ceu.this.fV() && !ceu.this.ew() && !ceu.this.dN().a(bvq.aI) && !ceu.this.gj() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof bmo $$4 && !ceu.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ane $$0, hx $$1, ih<dnz> $$2, @Nullable blw $$3, @Nullable blw $$4, float $$5) {
         if (!ceu.this.ew()) {
            ceu.this.bz.a(bvq.aI, avt.a, 40L);
            $$0.a(ceu.this, (byte)61);
            ceu.this.a(art.Bd, 5.0F, ceu.this.eX());
            hx $$6 = $$1;
            if ($$4 != null) {
               if (ceu.this.a($$4, 30.0)) {
                  if (ceu.this.dN().a(bvq.aA)) {
                     if (ceu.this.a($$4)) {
                        $$6 = $$4.dl();
                     }

                     ceu.this.c($$4);
                  } else {
                     ceu.this.a($$4, 10, true);
                  }
               }

               ceu.this.dN().a(bvq.aA, avt.a, 100L);
            } else {
               ceu.this.c($$3);
            }

            if (!ceu.this.A().d()) {
               Optional<bmo> $$7 = ceu.this.cB.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cev.a(ceu.this, $$6);
               }
            }
         }
      }
   }
}
