import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cgp extends cer implements dqf {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final aie<Integer> cd = aih.a(cgp.class, aig.b);
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
   public bnm b = new bnm();
   public bnm c = new bnm();
   public bnm d = new bnm();
   public bnm e = new bnm();
   public bnm bT = new bnm();
   public bnm bU = new bnm();
   private final dpt<dqf.b> cx;
   private final dqf.d cy;
   private dqf.a cz;
   cgo cA = new cgo(this::a, Collections.emptyList());

   public cgp(bnw<? extends cer> $$0, cvr $$1) {
      super($$0, $$1);
      this.cy = new cgp.a();
      this.cz = new dqf.a();
      this.cx = new dpt<>(new dqf.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(ehh.m, 0.0F);
      this.a(ehh.q, 8.0F);
      this.a(ehh.f, 8.0F);
      this.a(ehh.i, 8.0F);
      this.a(ehh.o, 0.0F);
      this.a(ehh.n, 0.0F);
   }

   @Override
   public xx<aag> di() {
      return new aah(this, this.c(bot.n) ? 1 : 0);
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bot.n);
      }
   }

   @Override
   public boolean a(cvu $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(hz $$0, cvu $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bmp $$0) {
      return this.gk() && !$$0.a(auc.e) ? true : super.b($$0);
   }

   boolean gk() {
      return this.c(bot.o) || this.c(bot.n);
   }

   @Override
   protected boolean n(bnq $$0) {
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

   public static bpo.a u() {
      return cer.gm().a(bpp.n, 500.0).a(bpp.o, 0.3F).a(bpp.k, 1.0).a(bpp.d, 1.5).a(bpp.c, 30.0);
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
   protected atk y() {
      return !this.c(bot.l) && !this.gk() ? this.A().b() : null;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.AT;
   }

   @Override
   protected atk n_() {
      return atl.AP;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.Bd, 10.0F, 1.0F);
   }

   @Override
   public boolean B(bnq $$0) {
      this.dM().a(this, (byte)4);
      this.a(atl.AO, 10.0F, this.eX());
      bua.a(this, 40);
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
      if (this.dM() instanceof aow $$0) {
         dqf.c.a($$0, this.cz, this.cy);
         if (this.fN() || this.X()) {
            cgq.a((boi)this);
         }
      }

      super.l();
      if (this.dM().y_()) {
         if (this.ag % this.go() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), atl.AS, this.db(), 5.0F, this.eX(), false);
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
      aow $$0 = (aow)this.dM();
      $$0.ae().a("wardenBrain");
      this.dO().a($$0, this);
      this.dM().ae().c();
      super.aa();
      if ((this.ag + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cA.a($$0, this::a);
         this.gn();
      }

      cgq.a(this);
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
      float $$0 = (float)this.w() / (float)cgn.c.a();
      return 40 - awi.d(awi.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return awi.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return awi.i($$0, (float)this.cw, (float)this.cu) / 10.0F;
   }

   private void a(bnm $$0) {
      if ((float)$$0.b() < 4500.0F) {
         awp $$1 = this.eh();
         dlj $$2 = this.bk();
         if ($$2.l() != dex.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)awi.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)awi.b($$1, -0.7F, 0.7F);
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
   public boolean a(cvj $$0) {
      return this.gk();
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cgq.a(this, $$0);
   }

   @Override
   public bpj<cgp> dO() {
      return (bpj<cgp>)super.dO();
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void a(BiConsumer<dpt<?>, aow> $$0) {
      if (this.dM() instanceof aow $$1) {
         $$0.accept(this.cx, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bnq $$0) {
      if ($$0 instanceof boi $$1
         && this.dM() == $$0.dM()
         && bnv.e.test($$0)
         && !this.r($$0)
         && $$1.ai() != bnw.e
         && $$1.ai() != bnw.bk
         && !$$1.cr()
         && !$$1.ex()
         && this.dM().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(aow $$0, enz $$1, @Nullable bnq $$2, int $$3) {
      bnd $$4 = new bnd(bnf.G, 260, 0, false, false);
      bne.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cgo.a(this::a).encodeStart(tk.a, this.cA).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dqf.a.a.encodeStart(tk.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cgo.a(this::a).parse(new Dynamic(tk.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cA = $$0x);
         this.gn();
      }

      if ($$0.b("listener", 10)) {
         dqf.a.a.parse(new Dynamic(tk.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
      }
   }

   private void gp() {
      if (!this.c(bot.l)) {
         this.a(this.A().c(), 10.0F, this.eX());
      }
   }

   public cgn A() {
      return cgn.a(this.gq());
   }

   private int gq() {
      return this.cA.b(this.q());
   }

   public void b(bnq $$0) {
      this.cA.a($$0);
   }

   public void c(@Nullable bnq $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bnq $$0, int $$1, boolean $$2) {
      if (!this.fW() && this.a($$0)) {
         cgq.a((boi)this);
         boolean $$3 = !(this.dO().c(bxl.o).orElse(null) instanceof chl);
         int $$4 = this.cA.a($$0, $$1);
         if ($$0 instanceof chl && $$3 && cgn.a($$4).d()) {
            this.dO().b(bxl.o);
         }

         if ($$2) {
            this.gp();
         }
      }
   }

   public Optional<boi> gg() {
      return this.A().d() ? this.cA.a() : Optional.empty();
   }

   @Nullable
   @Override
   public boi q() {
      return this.dO().c(bxl.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.dO().a(bxl.aE, axk.a, 1200L);
      if ($$2 == bom.k) {
         this.b(bot.n);
         this.dO().a(bxl.aC, axk.a, (long)cgq.a);
         this.a(atl.AL, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.fW() && !this.gk()) {
         bnq $$3 = $$0.d();
         this.a($$3, cgn.c.a() + 20, false);
         if (this.bz.c(bxl.o).isEmpty() && $$3 instanceof boi $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(boi $$0) {
      this.dO().b(bxl.ay);
      this.dO().a(bxl.o, $$0);
      this.dO().b(bxl.E);
      bua.a(this, 200);
   }

   @Override
   public bnt e(bot $$0) {
      bnt $$1 = super.e($$0);
      return this.gk() ? bnt.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gk() && super.bu();
   }

   @Override
   protected void C(bnq $$0) {
      if (!this.fW() && !this.dO().a(bxl.aH)) {
         this.dO().a(bxl.aH, axk.a, 20L);
         this.c($$0);
         cgq.a(this, $$0.dm());
      }

      super.C($$0);
   }

   @VisibleForTesting
   public cgo gh() {
      return this.cA;
   }

   @Override
   protected bxt b(cvr $$0) {
      return new bxs(this, $$0) {
         @Override
         protected ehn a(int $$0) {
            this.o = new ehq();
            this.o.a(true);
            return new ehn(this.o, $$0) {
               @Override
               protected float a(ehj $$0, ehj $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dqf.a gi() {
      return this.cz;
   }

   @Override
   public dqf.d gj() {
      return this.cy;
   }

   class a implements dqf.d {
      private static final int b = 16;
      private final dqa c = new dpu(cgp.this, cgp.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dqa b() {
         return this.c;
      }

      @Override
      public aup<dpw> c() {
         return aug.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aow $$0, hz $$1, ij<dpw> $$2, dpw.a $$3) {
         if (!cgp.this.fW() && !cgp.this.ex() && !cgp.this.dO().a(bxl.aI) && !cgp.this.gk() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof boi $$4 && !cgp.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aow $$0, hz $$1, ij<dpw> $$2, @Nullable bnq $$3, @Nullable bnq $$4, float $$5) {
         if (!cgp.this.ex()) {
            cgp.this.bz.a(bxl.aI, axk.a, 40L);
            $$0.a(cgp.this, (byte)61);
            cgp.this.a(atl.Be, 5.0F, cgp.this.eX());
            hz $$6 = $$1;
            if ($$4 != null) {
               if (cgp.this.a($$4, 30.0)) {
                  if (cgp.this.dO().a(bxl.aA)) {
                     if (cgp.this.a($$4)) {
                        $$6 = $$4.dm();
                     }

                     cgp.this.c($$4);
                  } else {
                     cgp.this.a($$4, 10, true);
                  }
               }

               cgp.this.dO().a(bxl.aA, axk.a, 100L);
            } else {
               cgp.this.c($$3);
            }

            if (!cgp.this.A().d()) {
               Optional<boi> $$7 = cgp.this.cA.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cgq.a(cgp.this, $$6);
               }
            }
         }
      }
   }
}
