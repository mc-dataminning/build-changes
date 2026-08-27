import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cgl extends cen implements dpy {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final aie<Integer> cd = aih.a(cgl.class, aig.b);
   private static final int ce = 200;
   private static final int cf = 260;
   private static final int cg = 20;
   private static final int ch = 120;
   private static final int ci = 20;
   private static final int cj = 35;
   private static final int ck = 10;
   private static final int cl = 20;
   private static final int cm = 100;
   private static final int cn = 20;
   private static final int co = 30;
   private static final float cp = 4.5F;
   private static final float cq = 0.7F;
   private static final int cr = 30;
   private int cs;
   private int ct;
   private int cu;
   private int cw;
   public bnk b = new bnk();
   public bnk c = new bnk();
   public bnk d = new bnk();
   public bnk e = new bnk();
   public bnk bT = new bnk();
   public bnk bU = new bnk();
   private final dpm<dpy.b> cx;
   private final dpy.d cy;
   private dpy.a cz;
   cgk cA = new cgk(this::a, Collections.emptyList());

   public cgl(bnu<? extends cen> $$0, cvn $$1) {
      super($$0, $$1);
      this.cy = new cgl.a();
      this.cz = new dpy.a();
      this.cx = new dpm<>(new dpy.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(eha.m, 0.0F);
      this.a(eha.q, 8.0F);
      this.a(eha.f, 8.0F);
      this.a(eha.i, 8.0F);
      this.a(eha.o, 0.0F);
      this.a(eha.n, 0.0F);
   }

   @Override
   public xx<aag> di() {
      return new aah(this, this.c(bor.n) ? 1 : 0);
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bor.n);
      }
   }

   @Override
   public boolean a(cvq $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bmn $$0) {
      return this.gk() && !$$0.a(aub.e) ? true : super.b($$0);
   }

   boolean gk() {
      return this.c(bor.o) || this.c(bor.n);
   }

   @Override
   protected boolean n(bno $$0) {
      return false;
   }

   @Override
   public boolean fG() {
      return true;
   }

   @Override
   protected float aM() {
      return this.Y + 0.55F;
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.n, 500.0).a(bpl.o, 0.3F).a(bpl.k, 1.0).a(bpl.d, 1.5).a(bpl.c, 30.0);
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
   protected atj y() {
      return !this.c(bor.l) && !this.gk() ? this.A().b() : null;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.AS;
   }

   @Override
   protected atj n_() {
      return atk.AO;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.Bc, 10.0F, 1.0F);
   }

   @Override
   public boolean B(bno $$0) {
      this.dM().a(this, (byte)4);
      this.a(atk.AN, 10.0F, this.eX());
      btw.a(this, 40);
      return super.B($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cd, 0);
   }

   public int w() {
      return this.am.b(cd);
   }

   private void gn() {
      this.am.b(cd, this.gq());
   }

   @Override
   public void l() {
      if (this.dM() instanceof aov $$0) {
         dpy.c.a($$0, this.cz, this.cy);
         if (this.fN() || this.X()) {
            cgm.a((bog)this);
         }
      }

      super.l();
      if (this.dM().y_()) {
         if (this.ag % this.go() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), atk.AR, this.db(), 5.0F, this.eX(), false);
            }
         }

         this.ct = this.cs;
         if (this.cs > 0) {
            this.cs--;
         }

         this.cw = this.cu;
         if (this.cu > 0) {
            this.cu--;
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
      aov $$0 = (aov)this.dM();
      $$0.af().a("wardenBrain");
      this.dO().a($$0, this);
      this.dM().af().c();
      super.aa();
      if ((this.ag + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cA.a($$0, this::a);
         this.gn();
      }

      cgm.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bT.a(this.ag);
      } else if ($$0 == 61) {
         this.cs = 10;
      } else if ($$0 == 62) {
         this.bU.a(this.ag);
      } else {
         super.b($$0);
      }
   }

   private int go() {
      float $$0 = (float)this.w() / (float)cgj.c.a();
      return 40 - awh.d(awh.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return awh.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return awh.i($$0, (float)this.cw, (float)this.cu) / 10.0F;
   }

   private void a(bnk $$0) {
      if ((float)$$0.b() < 4500.0F) {
         awo $$1 = this.eh();
         dlf $$2 = this.bk();
         if ($$2.l() != det.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)awh.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)awh.b($$1, -0.7F, 0.7F);
               this.dM().a(new jr(jz.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aie<?> $$0) {
      if (ar.equals($$0)) {
         switch (this.ap()) {
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
   public boolean a(cvf $$0) {
      return this.gk();
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cgm.a(this, $$0);
   }

   @Override
   public bpf<cgl> dO() {
      return (bpf<cgl>)super.dO();
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void a(BiConsumer<dpm<?>, aov> $$0) {
      if (this.dM() instanceof aov $$1) {
         $$0.accept(this.cx, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bno $$0) {
      if ($$0 instanceof bog $$1
         && this.dM() == $$0.dM()
         && bnt.e.test($$0)
         && !this.r($$0)
         && $$1.ai() != bnu.e
         && $$1.ai() != bnu.bk
         && !$$1.cr()
         && !$$1.ex()
         && this.dM().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(aov $$0, ens $$1, @Nullable bno $$2, int $$3) {
      bnb $$4 = new bnb(bnd.G, 260, 0, false, false);
      bnc.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cgk.a(this::a).encodeStart(tk.a, this.cA).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dpy.a.a.encodeStart(tk.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cgk.a(this::a).parse(new Dynamic(tk.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cA = $$0x);
         this.gn();
      }

      if ($$0.b("listener", 10)) {
         dpy.a.a.parse(new Dynamic(tk.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
      }
   }

   private void gp() {
      if (!this.c(bor.l)) {
         this.a(this.A().c(), 10.0F, this.eX());
      }
   }

   public cgj A() {
      return cgj.a(this.gq());
   }

   private int gq() {
      return this.cA.b(this.q());
   }

   public void b(bno $$0) {
      this.cA.a($$0);
   }

   public void c(@Nullable bno $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bno $$0, int $$1, boolean $$2) {
      if (!this.fW() && this.a($$0)) {
         cgm.a((bog)this);
         boolean $$3 = !(this.dO().c(bxh.o).orElse(null) instanceof chh);
         int $$4 = this.cA.a($$0, $$1);
         if ($$0 instanceof chh && $$3 && cgj.a($$4).d()) {
            this.dO().b(bxh.o);
         }

         if ($$2) {
            this.gp();
         }
      }
   }

   public Optional<bog> gg() {
      return this.A().d() ? this.cA.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bog q() {
      return this.dO().c(bxh.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.dO().a(bxh.aE, axk.a, 1200L);
      if ($$2 == bok.k) {
         this.b(bor.n);
         this.dO().a(bxh.aC, axk.a, (long)cgm.a);
         this.a(atk.AK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.fW() && !this.gk()) {
         bno $$3 = $$0.d();
         this.a($$3, cgj.c.a() + 20, false);
         if (this.bz.c(bxh.o).isEmpty() && $$3 instanceof bog $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bog $$0) {
      this.dO().b(bxh.ay);
      this.dO().a(bxh.o, $$0);
      this.dO().b(bxh.E);
      btw.a(this, 200);
   }

   @Override
   public bnr e(bor $$0) {
      bnr $$1 = super.e($$0);
      return this.gk() ? bnr.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gk() && super.bu();
   }

   @Override
   protected void C(bno $$0) {
      if (!this.fW() && !this.dO().a(bxh.aH)) {
         this.dO().a(bxh.aH, axk.a, 20L);
         this.c($$0);
         cgm.a(this, $$0.dm());
      }

      super.C($$0);
   }

   @VisibleForTesting
   public cgk gh() {
      return this.cA;
   }

   @Override
   protected bxp b(cvn $$0) {
      return new bxo(this, $$0) {
         @Override
         protected ehg a(int $$0) {
            this.o = new ehj();
            this.o.a(true);
            return new ehg(this.o, $$0) {
               @Override
               protected float a(ehc $$0, ehc $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dpy.a gi() {
      return this.cz;
   }

   @Override
   public dpy.d gj() {
      return this.cy;
   }

   class a implements dpy.d {
      private static final int b = 16;
      private final dpt c = new dpn(cgl.this, cgl.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dpt b() {
         return this.c;
      }

      @Override
      public auo<dpp> c() {
         return auf.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aov $$0, hz $$1, ij<dpp> $$2, dpp.a $$3) {
         if (!cgl.this.fW() && !cgl.this.ex() && !cgl.this.dO().a(bxh.aI) && !cgl.this.gk() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof bog $$4 && !cgl.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aov $$0, hz $$1, ij<dpp> $$2, @Nullable bno $$3, @Nullable bno $$4, float $$5) {
         if (!cgl.this.ex()) {
            cgl.this.bz.a(bxh.aI, axk.a, 40L);
            $$0.a(cgl.this, (byte)61);
            cgl.this.a(atk.Bd, 5.0F, cgl.this.eX());
            hz $$6 = $$1;
            if ($$4 != null) {
               if (cgl.this.a($$4, 30.0)) {
                  if (cgl.this.dO().a(bxh.aA)) {
                     if (cgl.this.a($$4)) {
                        $$6 = $$4.dm();
                     }

                     cgl.this.c($$4);
                  } else {
                     cgl.this.a($$4, 10, true);
                  }
               }

               cgl.this.dO().a(bxh.aA, axk.a, 100L);
            } else {
               cgl.this.c($$3);
            }

            if (!cgl.this.A().d()) {
               Optional<bog> $$7 = cgl.this.cA.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cgm.a(cgl.this, $$6);
               }
            }
         }
      }
   }
}
