import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cjp extends chr implements dva {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final ajk<Integer> ci = ajo.a(cjp.class, ajm.b);
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
   public bqg b = new bqg();
   public bqg c = new bqg();
   public bqg d = new bqg();
   public bqg e = new bqg();
   public bqg bY = new bqg();
   public bqg bZ = new bqg();
   private final duo<dva.b> cC;
   private final dva.d cD;
   private dva.a cE;
   cjo cF = new cjo(this::b, Collections.emptyList());

   public cjp(bqr<? extends chr> $$0, czu $$1) {
      super($$0, $$1);
      this.cD = new cjp.a();
      this.cE = new dva.a();
      this.cC = new duo<>(new dva.b(this));
      this.bN = 5;
      this.K().a(true);
      this.a(emi.m, 0.0F);
      this.a(emi.q, 8.0F);
      this.a(emi.f, 8.0F);
      this.a(emi.i, 8.0F);
      this.a(emi.o, 0.0F);
      this.a(emi.n, 0.0F);
   }

   @Override
   public yz<abk> dj() {
      return new abl(this, this.c(brp.n) ? 1 : 0);
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(brp.n);
      }
   }

   @Override
   public boolean a(czx $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dl()));
   }

   @Override
   public float a(im $$0, czx $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bpj $$0) {
      return this.gt() && !$$0.a(avq.e) ? true : super.b($$0);
   }

   boolean gt() {
      return this.c(brp.o) || this.c(brp.n);
   }

   @Override
   protected boolean o(bql $$0) {
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

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 500.0).a(bsl.r, 0.3F).a(bsl.n, 1.0).a(bsl.d, 1.5).a(bsl.c, 30.0);
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
   protected auy v() {
      return !this.c(brp.l) && !this.gt() ? this.y().b() : null;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.By;
   }

   @Override
   protected auy o_() {
      return auz.Bu;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.BI, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bql $$0) {
      this.dN().a(this, (byte)4);
      this.a(auz.Bt, 10.0F, this.fd());
      bww.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(ajo.a $$0) {
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
      if (this.dN() instanceof aqe $$0) {
         dva.c.a($$0, this.cE, this.cD);
         if (this.fV() || this.V()) {
            cjq.a((bre)this);
         }
      }

      super.l();
      if (this.dN().x_()) {
         if (this.ai % this.gx() == 0) {
            this.cA = 10;
            if (!this.aU()) {
               this.dN().a(this.ds(), this.du(), this.dy(), auz.Bx, this.dc(), 5.0F, this.fd(), false);
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
      aqe $$0 = (aqe)this.dN();
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

      cjq.a(this);
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
      float $$0 = (float)this.u() / (float)cjn.c.a();
      return 40 - axw.d(axw.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return axw.i($$0, (float)this.cy, (float)this.cx) / 10.0F;
   }

   public float H(float $$0) {
      return axw.i($$0, (float)this.cB, (float)this.cA) / 10.0F;
   }

   private void a(bqg $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ayd $$1 = this.ej();
         dpy $$2 = this.bn();
         if ($$2.l() != djb.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.ds() + (double)axw.b($$1, -0.7F, 0.7F);
               double $$5 = this.du();
               double $$6 = this.dy() + (double)axw.b($$1, -0.7F, 0.7F);
               this.dN().a(new kn(kw.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajk<?> $$0) {
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
   public boolean a(czm $$0) {
      return this.gt();
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cjq.a(this, $$0);
   }

   @Override
   public bsf<cjp> dQ() {
      return (bsf<cjp>)super.dQ();
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   public void a(BiConsumer<duo<?>, aqe> $$0) {
      if (this.dN() instanceof aqe $$1) {
         $$0.accept(this.cC, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bql $$0) {
      if ($$0 instanceof bre $$1
         && this.dN() == $$0.dN()
         && bqq.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bqr.d
         && $$1.ai() != bqr.bl
         && !$$1.cs()
         && !$$1.ez()
         && this.dN().C_().a($$1.cI())) {
         return true;
      }

      return false;
   }

   public static void a(aqe $$0, etf $$1, @Nullable bql $$2, int $$3) {
      bpx $$4 = new bpx(bpz.G, 260, 0, false, false);
      bpy.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      cjo.a(this::b).encodeStart(um.a, this.cF).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dva.a.a.encodeStart(um.a, this.cE).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cjo.a(this::b).parse(new Dynamic(um.a, $$0.c("anger"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cF = $$0x);
         this.gw();
      }

      if ($$0.b("listener", 10)) {
         dva.a.a.parse(new Dynamic(um.a, $$0.p("listener"))).resultOrPartial(ca::error).ifPresent($$0x -> this.cE = $$0x);
      }
   }

   private void gy() {
      if (!this.c(brp.l)) {
         this.a(this.y().c(), 10.0F, this.fd());
      }
   }

   public cjn y() {
      return cjn.a(this.gz());
   }

   private int gz() {
      return this.cF.b(this.p());
   }

   public void c(bql $$0) {
      this.cF.a($$0);
   }

   public void d(@Nullable bql $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bql $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         cjq.a((bre)this);
         boolean $$3 = !(this.dQ().c(cah.o).orElse(null) instanceof ckl);
         int $$4 = this.cF.a($$0, $$1);
         if ($$0 instanceof ckl && $$3 && cjn.a($$4).d()) {
            this.dQ().b(cah.o);
         }

         if ($$2) {
            this.gy();
         }
      }
   }

   public Optional<bre> gp() {
      return this.y().d() ? this.cF.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bre p() {
      return this.dQ().c(cah.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      this.dQ().a(cah.aE, ayy.a, 1200L);
      if ($$2 == bri.k) {
         this.b(brp.n);
         this.dQ().a(cah.aC, ayy.a, (long)cjq.a);
         this.a(auz.Bq, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dN().B && !this.gf() && !this.gt()) {
         bql $$3 = $$0.d();
         this.a($$3, cjn.c.a() + 20, false);
         if (this.bE.c(cah.o).isEmpty() && $$3 instanceof bre $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bre $$0) {
      this.dQ().b(cah.ay);
      this.dQ().a(cah.o, $$0);
      this.dQ().b(cah.E);
      bww.a(this, 200);
   }

   @Override
   public bqo e(brp $$0) {
      bqo $$1 = super.e($$0);
      return this.gt() ? bqo.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean by() {
      return !this.gt() && super.by();
   }

   @Override
   protected void D(bql $$0) {
      if (!this.gf() && !this.dQ().a(cah.aH)) {
         this.dQ().a(cah.aH, ayy.a, 20L);
         this.d($$0);
         cjq.a(this, $$0.dn());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cjo gq() {
      return this.cF;
   }

   @Override
   protected cap b(czu $$0) {
      return new cao(this, $$0) {
         @Override
         protected emh a(int $$0) {
            this.o = new emn();
            this.o.a(true);
            return new emh(this.o, $$0) {
               @Override
               protected float a(emd $$0, emd $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dva.a gr() {
      return this.cE;
   }

   @Override
   public dva.d gs() {
      return this.cD;
   }

   class a implements dva.d {
      private static final int b = 16;
      private final duv c = new dup(cjp.this, cjp.this.cJ());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public duv b() {
         return this.c;
      }

      @Override
      public awd<dur> c() {
         return avu.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqe $$0, im $$1, iv<dur> $$2, dur.a $$3) {
         if (!cjp.this.gf() && !cjp.this.ez() && !cjp.this.dQ().a(cah.aI) && !cjp.this.gt() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bre $$4 && !cjp.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aqe $$0, im $$1, iv<dur> $$2, @Nullable bql $$3, @Nullable bql $$4, float $$5) {
         if (!cjp.this.ez()) {
            cjp.this.bE.a(cah.aI, ayy.a, 40L);
            $$0.a(cjp.this, (byte)61);
            cjp.this.a(auz.BJ, 5.0F, cjp.this.fd());
            im $$6 = $$1;
            if ($$4 != null) {
               if (cjp.this.a($$4, 30.0)) {
                  if (cjp.this.dQ().a(cah.aA)) {
                     if (cjp.this.b($$4)) {
                        $$6 = $$4.dn();
                     }

                     cjp.this.d($$4);
                  } else {
                     cjp.this.a($$4, 10, true);
                  }
               }

               cjp.this.dQ().a(cah.aA, ayy.a, 100L);
            } else {
               cjp.this.d($$3);
            }

            if (!cjp.this.y().d()) {
               Optional<bre> $$7 = cjp.this.cF.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cjq.a(cjp.this, $$6);
               }
            }
         }
      }
   }
}
