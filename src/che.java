import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class che extends cfg implements dra {
   private static final Logger bX = LogUtils.getLogger();
   private static final int bY = 40;
   private static final int bZ = 200;
   private static final int ca = 500;
   private static final float cb = 0.3F;
   private static final float cc = 1.0F;
   private static final float cd = 1.5F;
   private static final int ce = 30;
   private static final aii<Integer> cf = ail.a(che.class, aik.b);
   private static final int cg = 200;
   private static final int ch = 260;
   private static final int ci = 20;
   private static final int cj = 120;
   private static final int ck = 20;
   private static final int cl = 35;
   private static final int cm = 10;
   private static final int cn = 20;
   private static final int co = 100;
   private static final int cp = 20;
   private static final int cq = 30;
   private static final float cr = 4.5F;
   private static final float cs = 0.7F;
   private static final int ct = 30;
   private int cu;
   private int cv;
   private int cx;
   private int cy;
   public bob b = new bob();
   public bob c = new bob();
   public bob d = new bob();
   public bob e = new bob();
   public bob bV = new bob();
   public bob bW = new bob();
   private final dqo<dra.b> cz;
   private final dra.d cA;
   private dra.a cB;
   chd cC = new chd(this::a, Collections.emptyList());

   public che(bol<? extends cfg> $$0, cwe $$1) {
      super($$0, $$1);
      this.cA = new che.a();
      this.cB = new dra.a();
      this.cz = new dqo<>(new dra.b(this));
      this.bK = 5;
      this.N().a(true);
      this.a(eic.m, 0.0F);
      this.a(eic.q, 8.0F);
      this.a(eic.f, 8.0F);
      this.a(eic.i, 8.0F);
      this.a(eic.o, 0.0F);
      this.a(eic.n, 0.0F);
   }

   @Override
   public xz<aai> df() {
      return new aaj(this, this.c(bpi.n) ? 1 : 0);
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bpi.n);
      }
   }

   @Override
   public boolean a(cwh $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dh()));
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bne $$0) {
      return this.gp() && !$$0.a(aug.e) ? true : super.b($$0);
   }

   boolean gp() {
      return this.c(bpi.o) || this.c(bpi.n);
   }

   @Override
   protected boolean n(bof $$0) {
      return false;
   }

   @Override
   public boolean fI() {
      return true;
   }

   @Override
   protected float aM() {
      return this.Y + 0.55F;
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 500.0).a(bqe.o, 0.3F).a(bqe.k, 1.0).a(bqe.d, 1.5).a(bqe.c, 30.0);
   }

   @Override
   public boolean aX() {
      return true;
   }

   @Override
   protected float eY() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected ato y() {
      return !this.c(bpi.l) && !this.gp() ? this.A().b() : null;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.Bg;
   }

   @Override
   protected ato n_() {
      return atp.Bc;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.Bq, 10.0F, 1.0F);
   }

   @Override
   public boolean B(bof $$0) {
      this.dJ().a(this, (byte)4);
      this.a(atp.Bb, 10.0F, this.eZ());
      bup.a(this, 40);
      return super.B($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cf, 0);
   }

   public int w() {
      return this.am.b(cf);
   }

   private void gs() {
      this.am.b(cf, this.gv());
   }

   @Override
   public void l() {
      if (this.dJ() instanceof apa $$0) {
         dra.c.a($$0, this.cB, this.cA);
         if (this.fS() || this.X()) {
            chf.a((box)this);
         }
      }

      super.l();
      if (this.dJ().y_()) {
         if (this.ag % this.gt() == 0) {
            this.cx = 10;
            if (!this.aU()) {
               this.dJ().a(this.do(), this.dq(), this.du(), atp.Bf, this.cY(), 5.0F, this.eZ(), false);
            }
         }

         this.cv = this.cu;
         if (this.cu > 0) {
            this.cu--;
         }

         this.cy = this.cx;
         if (this.cx > 0) {
            this.cx--;
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
      apa $$0 = (apa)this.dJ();
      $$0.ae().a("wardenBrain");
      this.dM().a($$0, this);
      this.dJ().ae().c();
      super.aa();
      if ((this.ag + this.aj()) % 120 == 0) {
         a($$0, this.dh(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cC.a($$0, this::a);
         this.gs();
      }

      chf.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bV.a(this.ag);
      } else if ($$0 == 61) {
         this.cu = 10;
      } else if ($$0 == 62) {
         this.bW.a(this.ag);
      } else {
         super.b($$0);
      }
   }

   private int gt() {
      float $$0 = (float)this.w() / (float)chc.c.a();
      return 40 - awm.d(awm.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return awm.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   public float F(float $$0) {
      return awm.i($$0, (float)this.cy, (float)this.cx) / 10.0F;
   }

   private void a(bob $$0) {
      if ((float)$$0.b() < 4500.0F) {
         awt $$1 = this.ef();
         dme $$2 = this.bk();
         if ($$2.l() != dfk.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.do() + (double)awm.b($$1, -0.7F, 0.7F);
               double $$5 = this.dq();
               double $$6 = this.du() + (double)awm.b($$1, -0.7F, 0.7F);
               this.dJ().a(new jt(kb.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aii<?> $$0) {
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
   public boolean a(cvw $$0) {
      return this.gp();
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return chf.a(this, $$0);
   }

   @Override
   public bpy<che> dM() {
      return (bpy<che>)super.dM();
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   public void a(BiConsumer<dqo<?>, apa> $$0) {
      if (this.dJ() instanceof apa $$1) {
         $$0.accept(this.cz, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bof $$0) {
      if ($$0 instanceof box $$1
         && this.dJ() == $$0.dJ()
         && bok.e.test($$0)
         && !this.r($$0)
         && $$1.ai() != bol.e
         && $$1.ai() != bol.bk
         && !$$1.co()
         && !$$1.ev()
         && this.dJ().D_().a($$1.cE())) {
         return true;
      }

      return false;
   }

   public static void a(apa $$0, eov $$1, @Nullable bof $$2, int $$3) {
      bns $$4 = new bns(bnu.G, 260, 0, false, false);
      bnt.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      chd.a(this::a).encodeStart(tm.a, this.cC).resultOrPartial(bX::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dra.a.a.encodeStart(tm.a, this.cB).resultOrPartial(bX::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         chd.a(this::a).parse(new Dynamic(tm.a, $$0.c("anger"))).resultOrPartial(bX::error).ifPresent($$0x -> this.cC = $$0x);
         this.gs();
      }

      if ($$0.b("listener", 10)) {
         dra.a.a.parse(new Dynamic(tm.a, $$0.p("listener"))).resultOrPartial(bX::error).ifPresent($$0x -> this.cB = $$0x);
      }
   }

   private void gu() {
      if (!this.c(bpi.l)) {
         this.a(this.A().c(), 10.0F, this.eZ());
      }
   }

   public chc A() {
      return chc.a(this.gv());
   }

   private int gv() {
      return this.cC.b(this.q());
   }

   public void b(bof $$0) {
      this.cC.a($$0);
   }

   public void c(@Nullable bof $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bof $$0, int $$1, boolean $$2) {
      if (!this.gb() && this.a($$0)) {
         chf.a((box)this);
         boolean $$3 = !(this.dM().c(bya.o).orElse(null) instanceof cia);
         int $$4 = this.cC.a($$0, $$1);
         if ($$0 instanceof cia && $$3 && chc.a($$4).d()) {
            this.dM().b(bya.o);
         }

         if ($$2) {
            this.gu();
         }
      }
   }

   public Optional<box> gl() {
      return this.A().d() ? this.cC.a() : Optional.empty();
   }

   @Nullable
   @Override
   public box q() {
      return this.dM().c(bya.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.dM().a(bya.aE, axo.a, 1200L);
      if ($$2 == bpb.k) {
         this.b(bpi.n);
         this.dM().a(bya.aC, axo.a, (long)chf.a);
         this.a(atp.AY, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dJ().B && !this.gb() && !this.gp()) {
         bof $$3 = $$0.d();
         this.a($$3, chc.c.a() + 20, false);
         if (this.bA.c(bya.o).isEmpty() && $$3 instanceof box $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(box $$0) {
      this.dM().b(bya.ay);
      this.dM().a(bya.o, $$0);
      this.dM().b(bya.E);
      bup.a(this, 200);
   }

   @Override
   public boi e(bpi $$0) {
      boi $$1 = super.e($$0);
      return this.gp() ? boi.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gp() && super.bu();
   }

   @Override
   protected void C(bof $$0) {
      if (!this.gb() && !this.dM().a(bya.aH)) {
         this.dM().a(bya.aH, axo.a, 20L);
         this.c($$0);
         chf.a(this, $$0.dj());
      }

      super.C($$0);
   }

   @VisibleForTesting
   public chd gm() {
      return this.cC;
   }

   @Override
   protected byi b(cwe $$0) {
      return new byh(this, $$0) {
         @Override
         protected eii a(int $$0) {
            this.o = new eil();
            this.o.a(true);
            return new eii(this.o, $$0) {
               @Override
               protected float a(eie $$0, eie $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dra.a gn() {
      return this.cB;
   }

   @Override
   public dra.d go() {
      return this.cA;
   }

   class a implements dra.d {
      private static final int b = 16;
      private final dqv c = new dqp(che.this, che.this.cF());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dqv b() {
         return this.c;
      }

      @Override
      public aut<dqr> c() {
         return auk.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apa $$0, ib $$1, il<dqr> $$2, dqr.a $$3) {
         if (!che.this.gb() && !che.this.ev() && !che.this.dM().a(bya.aI) && !che.this.gp() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof box $$4 && !che.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(apa $$0, ib $$1, il<dqr> $$2, @Nullable bof $$3, @Nullable bof $$4, float $$5) {
         if (!che.this.ev()) {
            che.this.bA.a(bya.aI, axo.a, 40L);
            $$0.a(che.this, (byte)61);
            che.this.a(atp.Br, 5.0F, che.this.eZ());
            ib $$6 = $$1;
            if ($$4 != null) {
               if (che.this.a($$4, 30.0)) {
                  if (che.this.dM().a(bya.aA)) {
                     if (che.this.a($$4)) {
                        $$6 = $$4.dj();
                     }

                     che.this.c($$4);
                  } else {
                     che.this.a($$4, 10, true);
                  }
               }

               che.this.dM().a(bya.aA, axo.a, 100L);
            } else {
               che.this.c($$3);
            }

            if (!che.this.A().d()) {
               Optional<box> $$7 = che.this.cC.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  chf.a(che.this, $$6);
               }
            }
         }
      }
   }
}
