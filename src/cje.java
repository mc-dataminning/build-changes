import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cje extends chg implements duk {
   private static final Logger bZ = LogUtils.getLogger();
   private static final int ca = 40;
   private static final int cb = 200;
   private static final int cc = 500;
   private static final float cd = 0.3F;
   private static final float ce = 1.0F;
   private static final float cf = 1.5F;
   private static final int cg = 30;
   private static final aja<Integer> ch = aje.a(cje.class, ajc.b);
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
   public bpv b = new bpv();
   public bpv c = new bpv();
   public bpv d = new bpv();
   public bpv e = new bpv();
   public bpv bX = new bpv();
   public bpv bY = new bpv();
   private final dty<duk.b> cB;
   private final duk.d cC;
   private duk.a cD;
   cjd cE = new cjd(this::b, Collections.emptyList());

   public cje(bqg<? extends chg> $$0, czg $$1) {
      super($$0, $$1);
      this.cC = new cje.a();
      this.cD = new duk.a();
      this.cB = new dty<>(new duk.b(this));
      this.bM = 5;
      this.K().a(true);
      this.a(els.m, 0.0F);
      this.a(els.q, 8.0F);
      this.a(els.f, 8.0F);
      this.a(els.i, 8.0F);
      this.a(els.o, 0.0F);
      this.a(els.n, 0.0F);
   }

   @Override
   public yp<aba> di() {
      return new abb(this, this.c(bre.n) ? 1 : 0);
   }

   @Override
   public void a(abb $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bre.n);
      }
   }

   @Override
   public boolean a(czj $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(id $$0, czj $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(boy $$0) {
      return this.gr() && !$$0.a(avg.e) ? true : super.b($$0);
   }

   boolean gr() {
      return this.c(bre.o) || this.c(bre.n);
   }

   @Override
   protected boolean o(bqa $$0) {
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

   public static brz.a r() {
      return chg.gt().a(bsa.q, 500.0).a(bsa.r, 0.3F).a(bsa.n, 1.0).a(bsa.d, 1.5).a(bsa.c, 30.0);
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
   protected aun v() {
      return !this.c(bre.l) && !this.gr() ? this.y().b() : null;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Br;
   }

   @Override
   protected aun o_() {
      return auo.Bn;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.BB, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bqa $$0) {
      this.dM().a(this, (byte)4);
      this.a(auo.Bm, 10.0F, this.fc());
      bwl.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ch, 0);
   }

   public int u() {
      return this.an.a(ch);
   }

   private void gu() {
      this.an.a(ch, this.gx());
   }

   @Override
   public void l() {
      if (this.dM() instanceof apu $$0) {
         duk.c.a($$0, this.cD, this.cC);
         if (this.fU() || this.V()) {
            cjf.a((bqt)this);
         }
      }

      super.l();
      if (this.dM().x_()) {
         if (this.ah % this.gv() == 0) {
            this.cz = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), auo.Bq, this.db(), 5.0F, this.fc(), false);
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
      apu $$0 = (apu)this.dM();
      $$0.af().a("wardenBrain");
      this.dP().a($$0, this);
      this.dM().af().c();
      super.Y();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cE.a($$0, this::b);
         this.gu();
      }

      cjf.a(this);
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
      float $$0 = (float)this.u() / (float)cjc.c.a();
      return 40 - axm.d(axm.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float G(float $$0) {
      return axm.i($$0, (float)this.cx, (float)this.cw) / 10.0F;
   }

   public float H(float $$0) {
      return axm.i($$0, (float)this.cA, (float)this.cz) / 10.0F;
   }

   private void a(bpv $$0) {
      if ((float)$$0.b() < 4500.0F) {
         axt $$1 = this.ei();
         dpi $$2 = this.bn();
         if ($$2.l() != dim.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)axm.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)axm.b($$1, -0.7F, 0.7F);
               this.dM().a(new kf(kn.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aja<?> $$0) {
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
   public boolean a(cyy $$0) {
      return this.gr();
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cjf.a(this, $$0);
   }

   @Override
   public bru<cje> dP() {
      return (bru<cje>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   public void a(BiConsumer<dty<?>, apu> $$0) {
      if (this.dM() instanceof apu $$1) {
         $$0.accept(this.cB, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bqa $$0) {
      if ($$0 instanceof bqt $$1
         && this.dM() == $$0.dM()
         && bqf.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bqg.d
         && $$1.ai() != bqg.bl
         && !$$1.cr()
         && !$$1.ey()
         && this.dM().C_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(apu $$0, esj $$1, @Nullable bqa $$2, int $$3) {
      bpm $$4 = new bpm(bpo.G, 260, 0, false, false);
      bpn.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      cjd.a(this::b).encodeStart(uc.a, this.cE).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("anger", $$1));
      duk.a.a.encodeStart(uc.a, this.cD).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cjd.a(this::b).parse(new Dynamic(uc.a, $$0.c("anger"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cE = $$0x);
         this.gu();
      }

      if ($$0.b("listener", 10)) {
         duk.a.a.parse(new Dynamic(uc.a, $$0.p("listener"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cD = $$0x);
      }
   }

   private void gw() {
      if (!this.c(bre.l)) {
         this.a(this.y().c(), 10.0F, this.fc());
      }
   }

   public cjc y() {
      return cjc.a(this.gx());
   }

   private int gx() {
      return this.cE.b(this.p());
   }

   public void c(bqa $$0) {
      this.cE.a($$0);
   }

   public void d(@Nullable bqa $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bqa $$0, int $$1, boolean $$2) {
      if (!this.gd() && this.b($$0)) {
         cjf.a((bqt)this);
         boolean $$3 = !(this.dP().c(bzw.o).orElse(null) instanceof cka);
         int $$4 = this.cE.a($$0, $$1);
         if ($$0 instanceof cka && $$3 && cjc.a($$4).d()) {
            this.dP().b(bzw.o);
         }

         if ($$2) {
            this.gw();
         }
      }
   }

   public Optional<bqt> gn() {
      return this.y().d() ? this.cE.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bqt p() {
      return this.dP().c(bzw.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      this.dP().a(bzw.aE, ayo.a, 1200L);
      if ($$2 == bqx.k) {
         this.b(bre.n);
         this.dP().a(bzw.aC, ayo.a, (long)cjf.a);
         this.a(auo.Bj, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.gd() && !this.gr()) {
         bqa $$3 = $$0.d();
         this.a($$3, cjc.c.a() + 20, false);
         if (this.bC.c(bzw.o).isEmpty() && $$3 instanceof bqt $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bqt $$0) {
      this.dP().b(bzw.ay);
      this.dP().a(bzw.o, $$0);
      this.dP().b(bzw.E);
      bwl.a(this, 200);
   }

   @Override
   public bqd e(bre $$0) {
      bqd $$1 = super.e($$0);
      return this.gr() ? bqd.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bx() {
      return !this.gr() && super.bx();
   }

   @Override
   protected void D(bqa $$0) {
      if (!this.gd() && !this.dP().a(bzw.aH)) {
         this.dP().a(bzw.aH, ayo.a, 20L);
         this.d($$0);
         cjf.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cjd go() {
      return this.cE;
   }

   @Override
   protected cae b(czg $$0) {
      return new cad(this, $$0) {
         @Override
         protected elr a(int $$0) {
            this.o = new elx();
            this.o.a(true);
            return new elr(this.o, $$0) {
               @Override
               protected float a(eln $$0, eln $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public duk.a gp() {
      return this.cD;
   }

   @Override
   public duk.d gq() {
      return this.cC;
   }

   class a implements duk.d {
      private static final int b = 16;
      private final duf c = new dtz(cje.this, cje.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public duf b() {
         return this.c;
      }

      @Override
      public avt<dub> c() {
         return avk.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apu $$0, id $$1, in<dub> $$2, dub.a $$3) {
         if (!cje.this.gd() && !cje.this.ey() && !cje.this.dP().a(bzw.aI) && !cje.this.gr() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bqt $$4 && !cje.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(apu $$0, id $$1, in<dub> $$2, @Nullable bqa $$3, @Nullable bqa $$4, float $$5) {
         if (!cje.this.ey()) {
            cje.this.bC.a(bzw.aI, ayo.a, 40L);
            $$0.a(cje.this, (byte)61);
            cje.this.a(auo.BC, 5.0F, cje.this.fc());
            id $$6 = $$1;
            if ($$4 != null) {
               if (cje.this.a($$4, 30.0)) {
                  if (cje.this.dP().a(bzw.aA)) {
                     if (cje.this.b($$4)) {
                        $$6 = $$4.dm();
                     }

                     cje.this.d($$4);
                  } else {
                     cje.this.a($$4, 10, true);
                  }
               }

               cje.this.dP().a(bzw.aA, ayo.a, 100L);
            } else {
               cje.this.d($$3);
            }

            if (!cje.this.y().d()) {
               Optional<bqt> $$7 = cje.this.cE.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cjf.a(cje.this, $$6);
               }
            }
         }
      }
   }
}
