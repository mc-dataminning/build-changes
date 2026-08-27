import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class chy extends cga implements dry {
   private static final Logger bZ = LogUtils.getLogger();
   private static final int ca = 40;
   private static final int cb = 200;
   private static final int cc = 500;
   private static final float cd = 0.3F;
   private static final float ce = 1.0F;
   private static final float cf = 1.5F;
   private static final int cg = 30;
   private static final aim<Integer> ch = aiq.a(chy.class, aio.b);
   private static final int ci = 200;
   private static final int cj = 260;
   private static final int ck = 20;
   private static final int cl = 120;
   private static final int cm = 20;
   private static final int cn = 35;
   private static final int co = 10;
   private static final int cp = 20;
   private static final int cq = 100;
   private static final int cr = 20;
   private static final int cs = 30;
   private static final float ct = 4.5F;
   private static final float cu = 0.7F;
   private static final int cv = 30;
   private int cw;
   private int cx;
   private int cz;
   private int cA;
   public bot b = new bot();
   public bot c = new bot();
   public bot d = new bot();
   public bot e = new bot();
   public bot bX = new bot();
   public bot bY = new bot();
   private final drm<dry.b> cB;
   private final dry.d cC;
   private dry.a cD;
   chx cE = new chx(this::b, Collections.emptyList());

   public chy(bpd<? extends cga> $$0, cxb $$1) {
      super($$0, $$1);
      this.cC = new chy.a();
      this.cD = new dry.a();
      this.cB = new drm<>(new dry.b(this));
      this.bM = 5;
      this.K().a(true);
      this.a(ejg.m, 0.0F);
      this.a(ejg.q, 8.0F);
      this.a(ejg.f, 8.0F);
      this.a(ejg.i, 8.0F);
      this.a(ejg.o, 0.0F);
      this.a(ejg.n, 0.0F);
   }

   @Override
   public yb<aam> di() {
      return new aan(this, this.c(bqa.n) ? 1 : 0);
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bqa.n);
      }
   }

   @Override
   public boolean a(cxe $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bnw $$0) {
      return this.gr() && !$$0.a(aup.e) ? true : super.b($$0);
   }

   boolean gr() {
      return this.c(bqa.o) || this.c(bqa.n);
   }

   @Override
   protected boolean o(box $$0) {
      return false;
   }

   @Override
   public boolean fL() {
      return true;
   }

   @Override
   protected float aM() {
      return this.Z + 0.55F;
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.q, 500.0).a(bqw.r, 0.3F).a(bqw.n, 1.0).a(bqw.d, 1.5).a(bqw.c, 30.0);
   }

   @Override
   public boolean ba() {
      return true;
   }

   @Override
   protected float fb() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected atx v() {
      return !this.c(bqa.l) && !this.gr() ? this.y().b() : null;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.Bo;
   }

   @Override
   protected atx n_() {
      return aty.Bk;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.By, 10.0F, 1.0F);
   }

   @Override
   public boolean C(box $$0) {
      this.dM().a(this, (byte)4);
      this.a(aty.Bj, 10.0F, this.fc());
      bvh.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   public int s() {
      return this.an.a(ch);
   }

   private void gu() {
      this.an.a(ch, this.gx());
   }

   @Override
   public void l() {
      if (this.dM() instanceof apf $$0) {
         dry.c.a($$0, this.cD, this.cC);
         if (this.fU() || this.V()) {
            chz.a((bpp)this);
         }
      }

      super.l();
      if (this.dM().x_()) {
         if (this.ah % this.gv() == 0) {
            this.cz = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), aty.Bn, this.db(), 5.0F, this.fc(), false);
            }
         }

         this.cx = this.cw;
         if (this.cw > 0) {
            this.cw--;
         }

         this.cA = this.cz;
         if (this.cz > 0) {
            this.cz--;
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
      apf $$0 = (apf)this.dM();
      $$0.ae().a("wardenBrain");
      this.dP().a($$0, this);
      this.dM().ae().c();
      super.Y();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cE.a($$0, this::b);
         this.gu();
      }

      chz.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bX.a(this.ah);
      } else if ($$0 == 61) {
         this.cw = 10;
      } else if ($$0 == 62) {
         this.bY.a(this.ah);
      } else {
         super.b($$0);
      }
   }

   private int gv() {
      float $$0 = (float)this.s() / (float)chw.c.a();
      return 40 - aww.d(aww.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return aww.i($$0, (float)this.cx, (float)this.cw) / 10.0F;
   }

   public float H(float $$0) {
      return aww.i($$0, (float)this.cA, (float)this.cz) / 10.0F;
   }

   private void a(bot $$0) {
      if ((float)$$0.b() < 4500.0F) {
         axd $$1 = this.ei();
         dnb $$2 = this.bn();
         if ($$2.l() != dgh.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)aww.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)aww.b($$1, -0.7F, 0.7F);
               this.dM().a(new ju(kc.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aim<?> $$0) {
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
   public boolean a(cwt $$0) {
      return this.gr();
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return chz.a(this, $$0);
   }

   @Override
   public bqq<chy> dP() {
      return (bqq<chy>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public void a(BiConsumer<drm<?>, apf> $$0) {
      if (this.dM() instanceof apf $$1) {
         $$0.accept(this.cB, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable box $$0) {
      if ($$0 instanceof bpp $$1
         && this.dM() == $$0.dM()
         && bpc.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bpd.e
         && $$1.ai() != bpd.bm
         && !$$1.cr()
         && !$$1.ey()
         && this.dM().C_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(apf $$0, ept $$1, @Nullable box $$2, int $$3) {
      bok $$4 = new bok(bom.G, 260, 0, false, false);
      bol.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      chx.a(this::b).encodeStart(to.a, this.cE).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dry.a.a.encodeStart(to.a, this.cD).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         chx.a(this::b).parse(new Dynamic(to.a, $$0.c("anger"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cE = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         dry.a.a.parse(new Dynamic(to.a, $$0.p("listener"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cD = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bqa.l)) {
         this.a(this.y().c(), 10.0F, this.fc());
      }
   }

   public chw y() {
      return chw.a(this.gx());
   }

   private int gx() {
      return this.cE.b(this.p());
   }

   public void c(box $$0) {
      this.cE.a($$0);
   }

   public void d(@Nullable box $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable box $$0, int $$1, boolean $$2) {
      if (!this.gd() && this.b($$0)) {
         chz.a((bpp)this);
         boolean $$3 = !(this.dP().c(bys.o).orElse(null) instanceof ciu);
         int $$4 = this.cE.a($$0, $$1);
         if ($$0 instanceof ciu && $$3 && chw.a($$4).d()) {
            this.dP().b(bys.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bpp> gn() {
      return this.y().d() ? this.cE.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bpp p() {
      return this.dP().c(bys.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.dP().a(bys.aE, axy.a, 1200L);
      if ($$2 == bpt.k) {
         this.b(bqa.n);
         this.dP().a(bys.aC, axy.a, (long)chz.a);
         this.a(aty.Bg, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.gd() && !this.gr()) {
         box $$3 = $$0.d();
         this.a($$3, chw.c.a() + 20, false);
         if (this.bC.c(bys.o).isEmpty() && $$3 instanceof bpp $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bpp $$0) {
      this.dP().b(bys.ay);
      this.dP().a(bys.o, $$0);
      this.dP().b(bys.E);
      bvh.a(this, 200);
   }

   @Override
   public bpa e(bqa $$0) {
      bpa $$1 = super.e($$0);
      return this.gr() ? bpa.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bx() {
      return !this.gr() && super.bx();
   }

   @Override
   protected void D(box $$0) {
      if (!this.gd() && !this.dP().a(bys.aH)) {
         this.dP().a(bys.aH, axy.a, 20L);
         this.d($$0);
         chz.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public chx go() {
      return this.cE;
   }

   @Override
   protected bza b(cxb $$0) {
      return new byz(this, $$0) {
         @Override
         protected ejf a(int $$0) {
            this.o = new ejj();
            this.o.a(true);
            return new ejf(this.o, $$0) {
               @Override
               protected float a(ejb $$0, ejb $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dry.a gp() {
      return this.cD;
   }

   @Override
   public dry.d gq() {
      return this.cC;
   }

   class a implements dry.d {
      private static final int b = 16;
      private final drt c = new drn(chy.this, chy.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public drt b() {
         return this.c;
      }

      @Override
      public avd<drp> c() {
         return aut.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drp> $$2, drp.a $$3) {
         if (!chy.this.gd() && !chy.this.ey() && !chy.this.dP().a(bys.aI) && !chy.this.gr() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bpp $$4 && !chy.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(apf $$0, ib $$1, il<drp> $$2, @Nullable box $$3, @Nullable box $$4, float $$5) {
         if (!chy.this.ey()) {
            chy.this.bC.a(bys.aI, axy.a, 40L);
            $$0.a(chy.this, (byte)61);
            chy.this.a(aty.Bz, 5.0F, chy.this.fc());
            ib $$6 = $$1;
            if ($$4 != null) {
               if (chy.this.a($$4, 30.0)) {
                  if (chy.this.dP().a(bys.aA)) {
                     if (chy.this.b($$4)) {
                        $$6 = $$4.dm();
                     }

                     chy.this.d($$4);
                  } else {
                     chy.this.a($$4, 10, true);
                  }
               }

               chy.this.dP().a(bys.aA, axy.a, 100L);
            } else {
               chy.this.d($$3);
            }

            if (!chy.this.y().d()) {
               Optional<bpp> $$7 = chy.this.cE.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  chz.a(chy.this, $$6);
               }
            }
         }
      }
   }
}
