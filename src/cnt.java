import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cnt extends clv implements eat {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final ako<Integer> cj = aks.a(cnt.class, akq.b);
   private static final int ck = 200;
   private static final int cl = 260;
   private static final int cm = 20;
   private static final int cn = 120;
   private static final int co = 20;
   private static final int cp = 35;
   private static final int cq = 10;
   private static final int cr = 20;
   private static final int cs = 100;
   private static final int ct = 20;
   private static final int cu = 30;
   private static final float cv = 4.5F;
   private static final float cw = 0.7F;
   private static final int cx = 30;
   private int cy;
   private int cA;
   private int cB;
   private int cC;
   public bua b = new bua();
   public bua c = new bua();
   public bua d = new bua();
   public bua e = new bua();
   public bua bY = new bua();
   public bua bZ = new bua();
   private final eah<eat.b> cD;
   private final eat.d cE;
   private eat.a cF;
   cns cG = new cns(this::c, Collections.emptyList());

   public cnt(bup<? extends clv> $$0, dff $$1) {
      super($$0, $$1);
      this.cE = new cnt.a();
      this.cF = new eat.a();
      this.cD = new eah<>(new eat.b(this));
      this.bN = 5;
      this.P().a(true);
      this.a(esf.m, 0.0F);
      this.a(esf.q, 8.0F);
      this.a(esf.f, 8.0F);
      this.a(esf.i, 8.0F);
      this.a(esf.o, 0.0F);
      this.a(esf.n, 0.0F);
   }

   @Override
   public zs<ach> a(arp $$0) {
      return new aci(this, $$0, this.c(bvq.n) ? 1 : 0);
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bvq.n);
      }
   }

   @Override
   public boolean a(dfi $$0) {
      return super.a($$0) && $$0.a(this, this.ar().n().a(this.dw()));
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bsy $$0) {
      return this.gz() && !$$0.a(axf.d) ? true : super.b($$0);
   }

   boolean gz() {
      return this.c(bvq.o) || this.c(bvq.n);
   }

   @Override
   protected boolean o(bui $$0) {
      return false;
   }

   @Override
   public boolean fX() {
      return true;
   }

   @Override
   protected float aW() {
      return this.Y + 0.55F;
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 500.0).a(bwm.v, 0.3F).a(bwm.p, 1.0).a(bwm.d, 1.5).a(bwm.c, 30.0).a(bwm.m, 24.0);
   }

   @Override
   public boolean bj() {
      return true;
   }

   @Override
   protected float fj() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awn w() {
      return !this.c(bvq.l) && !this.gz() ? this.y().b() : null;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.BS;
   }

   @Override
   protected awn o_() {
      return awo.BO;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.Cc, 10.0F, 1.0F);
   }

   @Override
   public boolean E(bui $$0) {
      this.dY().a(this, (byte)4);
      this.a(awo.BN, 10.0F, this.fk());
      cax.a(this, 40);
      return super.E($$0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int t() {
      return this.am.a(cj);
   }

   private void gC() {
      this.am.a(cj, this.gF());
   }

   @Override
   public void l() {
      if (this.dY() instanceof arq $$0) {
         eat.c.a($$0, this.cF, this.cE);
         if (this.gc() || this.Z()) {
            cnu.a((bve)this);
         }
      }

      super.l();
      if (this.dY().y_()) {
         if (this.ag % this.gD() == 0) {
            this.cB = 10;
            if (!this.bd()) {
               this.dY().a(this.dD(), this.dF(), this.dJ(), awo.BR, this.do(), 5.0F, this.fk(), false);
            }
         }

         this.cA = this.cy;
         if (this.cy > 0) {
            this.cy--;
         }

         this.cC = this.cB;
         if (this.cB > 0) {
            this.cB--;
         }

         switch (this.ay()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void ac() {
      arq $$0 = (arq)this.dY();
      bor $$1 = boq.a();
      $$1.a("wardenBrain");
      this.ee().a($$0, this);
      $$1.c();
      super.ac();
      if ((this.ag + this.as()) % 120 == 0) {
         a($$0, this.dw(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cG.a($$0, this::c);
         this.gC();
      }

      cnu.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bY.a(this.ag);
      } else if ($$0 == 61) {
         this.cy = 10;
      } else if ($$0 == 62) {
         this.bZ.a(this.ag);
      } else {
         super.b($$0);
      }
   }

   private int gD() {
      float $$0 = (float)this.t() / (float)cnr.c.a();
      return 40 - azn.d(azn.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azn.h($$0, (float)this.cA, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return azn.h($$0, (float)this.cC, (float)this.cB) / 10.0F;
   }

   private void a(bua $$0) {
      if ((float)$$0.a((float)this.ag) < 4500.0F) {
         azv $$1 = this.eb();
         dvo $$2 = this.bw();
         if ($$2.o() != dop.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dD() + (double)azn.b($$1, -0.7F, 0.7F);
               double $$5 = this.dF();
               double $$6 = this.dJ() + (double)azn.b($$1, -0.7F, 0.7F);
               this.dY().a(new lk(ls.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ako<?> $$0) {
      if (ar.equals($$0)) {
         switch (this.ay()) {
            case n:
               this.d.a(this.ag);
               break;
            case o:
               this.e.a(this.ag);
               break;
            case l:
               this.b.a(this.ag);
               break;
            case m:
               this.c.a(this.ag);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dex $$0) {
      return this.gz();
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return cnu.a(this, $$0);
   }

   @Override
   public bwg<cnt> ee() {
      return (bwg<cnt>)super.ee();
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   public void a(BiConsumer<eah<?>, arq> $$0) {
      if (this.dY() instanceof arq $$1) {
         $$0.accept(this.cD, $$1);
      }
   }

   @Contract("null->false")
   public boolean c(@Nullable bui $$0) {
      if ($$0 instanceof bve $$1
         && this.dY() == $$0.dY()
         && bun.e.test($$0)
         && !this.s($$0)
         && $$1.ar() != bup.d
         && $$1.ar() != bup.bm
         && !$$1.cE()
         && !$$1.eI()
         && this.dY().C_().a($$1.cT())) {
         return true;
      }

      return false;
   }

   public static void a(arq $$0, ezr $$1, @Nullable bui $$2, int $$3) {
      btn $$4 = new btn(btp.G, 260, 0, false, false);
      bto.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      alj<vk> $$1 = this.ea().a(vb.a);
      cns.a(this::c)
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      eat.a.a
         .encodeStart($$1, this.cF)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      alj<vk> $$1 = this.ea().a(vb.a);
      if ($$0.e("anger")) {
         cns.a(this::c)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
         this.gC();
      }

      if ($$0.b("listener", 10)) {
         eat.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cF = $$0x);
      }
   }

   private void gE() {
      if (!this.c(bvq.l)) {
         this.a(this.y().c(), 10.0F, this.fk());
      }
   }

   public cnr y() {
      return cnr.a(this.gF());
   }

   private int gF() {
      return this.cG.b(this.m());
   }

   @Override
   public void d(bui $$0) {
      this.cG.a($$0);
   }

   public void e(@Nullable bui $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bui $$0, int $$1, boolean $$2) {
      if (!this.gi() && this.c($$0)) {
         cnu.a((bve)this);
         boolean $$3 = !(this.m() instanceof cor);
         int $$4 = this.cG.a($$0, $$1);
         if ($$0 instanceof cor && $$3 && cnr.a($$4).d()) {
            this.ee().b(cei.o);
         }

         if ($$2) {
            this.gE();
         }
      }
   }

   public Optional<bve> gv() {
      return this.y().d() ? this.cG.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bve m() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.ee().a(cei.aE, bat.a, 1200L);
      if ($$2 == buo.k) {
         this.b(bvq.n);
         this.ee().a(cei.aC, bat.a, (long)cnu.a);
         this.a(awo.BK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dY().C && !this.gi() && !this.gz()) {
         bui $$3 = $$0.d();
         this.a($$3, cnr.c.a() + 20, false);
         if (this.bF.c(cei.o).isEmpty() && $$3 instanceof bve $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bve $$0) {
      this.ee().b(cei.ay);
      this.ee().a(cei.o, $$0);
      this.ee().b(cei.E);
      cax.a(this, 200);
   }

   @Override
   public bul e(bvq $$0) {
      bul $$1 = super.e($$0);
      return this.gz() ? bul.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bK() {
      return !this.gz() && super.bK();
   }

   @Override
   protected void F(bui $$0) {
      if (!this.gi() && !this.ee().a(cei.aH)) {
         this.ee().a(cei.aH, bat.a, 20L);
         this.e($$0);
         cnu.a(this, $$0.dy());
      }

      super.F($$0);
   }

   @VisibleForTesting
   public cns gw() {
      return this.cG;
   }

   @Override
   protected ceq b(dff $$0) {
      return new cep(this, $$0) {
         @Override
         protected ese a(int $$0) {
            this.o = new esk();
            this.o.a(true);
            return new ese(this.o, $$0) {
               @Override
               protected float a(esa $$0, esa $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public eat.a gx() {
      return this.cF;
   }

   @Override
   public eat.d gy() {
      return this.cE;
   }

   class a implements eat.d {
      private static final int b = 16;
      private final eao c = new eai(cnt.this, cnt.this.cU());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eao b() {
         return this.c;
      }

      @Override
      public axt<eak> c() {
         return axk.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, jh $$1, jq<eak> $$2, eak.a $$3) {
         if (!cnt.this.gi() && !cnt.this.eI() && !cnt.this.ee().a(cei.aI) && !cnt.this.gz() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bve $$4 && !cnt.this.c($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arq $$0, jh $$1, jq<eak> $$2, @Nullable bui $$3, @Nullable bui $$4, float $$5) {
         if (!cnt.this.eI()) {
            cnt.this.bF.a(cei.aI, bat.a, 40L);
            $$0.a(cnt.this, (byte)61);
            cnt.this.a(awo.Cd, 5.0F, cnt.this.fk());
            jh $$6 = $$1;
            if ($$4 != null) {
               if (cnt.this.a($$4, 30.0)) {
                  if (cnt.this.ee().a(cei.aA)) {
                     if (cnt.this.c($$4)) {
                        $$6 = $$4.dy();
                     }

                     cnt.this.e($$4);
                  } else {
                     cnt.this.a($$4, 10, true);
                  }
               }

               cnt.this.ee().a(cei.aA, bat.a, 100L);
            } else {
               cnt.this.e($$3);
            }

            if (!cnt.this.y().d()) {
               Optional<bve> $$7 = cnt.this.cG.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cnu.a(cnt.this, $$6);
               }
            }
         }
      }
   }
}
