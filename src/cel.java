import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cel extends cco implements dnz {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final agm<Integer> cd = agp.a(cel.class, ago.b);
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
   public blq b = new blq();
   public blq c = new blq();
   public blq d = new blq();
   public blq e = new blq();
   public blq bT = new blq();
   public blq bU = new blq();
   private final dnn<dnz.b> cx;
   private final dnz.d cy;
   private dnz.a cz;
   cek cA = new cek(this::a, Collections.emptyList());

   public cel(bly<? extends cco> $$0, cto $$1) {
      super($$0, $$1);
      this.cy = new cel.a();
      this.cz = new dnz.a();
      this.cx = new dnn<>(new dnz.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(efb.m, 0.0F);
      this.a(efb.q, 8.0F);
      this.a(efb.f, 8.0F);
      this.a(efb.i, 8.0F);
      this.a(efb.o, 0.0F);
      this.a(efb.n, 0.0F);
   }

   @Override
   public xf<za> dj() {
      return new zb(this, this.c(bmw.n) ? 1 : 0);
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bmw.n);
      }
   }

   @Override
   public boolean a(ctr $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bks $$0) {
      return this.gi() && !$$0.a(asi.e) ? true : super.b($$0);
   }

   boolean gi() {
      return this.c(bmw.o) || this.c(bmw.n);
   }

   @Override
   protected boolean o(blu $$0) {
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

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 500.0).a(bnq.m, 0.3F).a(bnq.i, 1.0).a(bnq.d, 1.5).a(bnq.c, 30.0);
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
   protected arq y() {
      return !this.c(bmw.l) && !this.gi() ? this.A().b() : null;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.AD;
   }

   @Override
   protected arq n_() {
      return arr.Az;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.AN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(blu $$0) {
      this.dM().a(this, (byte)4);
      this.a(arr.Ay, 10.0F, this.eX());
      bsb.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cd, 0);
   }

   public int w() {
      return this.an.b(cd);
   }

   private void gl() {
      this.an.b(cd, this.go());
   }

   @Override
   public void l() {
      if (this.dM() instanceof and $$0) {
         dnz.c.a($$0, this.cz, this.cy);
         if (this.fL() || this.W()) {
            cem.a((bmk)this);
         }
      }

      super.l();
      if (this.dM().y_()) {
         if (this.ah % this.gm() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), arr.AC, this.db(), 5.0F, this.eX(), false);
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
   protected void Z() {
      and $$0 = (and)this.dM();
      $$0.af().a("wardenBrain");
      this.dO().a($$0, this);
      this.dM().af().c();
      super.Z();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cA.a($$0, this::a);
         this.gl();
      }

      cem.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bT.a(this.ah);
      } else if ($$0 == 61) {
         this.cs = 10;
      } else if ($$0 == 62) {
         this.bU.a(this.ah);
      } else {
         super.b($$0);
      }
   }

   private int gm() {
      float $$0 = (float)this.w() / (float)cej.c.a();
      return 40 - aun.d(aun.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return aun.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return aun.i($$0, (float)this.cw, (float)this.cu) / 10.0F;
   }

   private void a(blq $$0) {
      if ((float)$$0.b() < 4500.0F) {
         auu $$1 = this.eg();
         djg $$2 = this.bk();
         if ($$2.l() != dcu.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)aun.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)aun.b($$1, -0.7F, 0.7F);
               this.dM().a(new jp(jx.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(agm<?> $$0) {
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
   public boolean a(ctg $$0) {
      return this.gi();
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return cem.a(this, $$0);
   }

   @Override
   public bnk<cel> dO() {
      return (bnk<cel>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public void a(BiConsumer<dnn<?>, and> $$0) {
      if (this.dM() instanceof and $$1) {
         $$0.accept(this.cx, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable blu $$0) {
      if ($$0 instanceof bmk $$1
         && this.dM() == $$0.dM()
         && blx.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bly.d
         && $$1.ai() != bly.bj
         && !$$1.cr()
         && !$$1.ew()
         && this.dM().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(and $$0, els $$1, @Nullable blu $$2, int $$3) {
      blh $$4 = new blh(blj.G, 260, 0, false, false);
      bli.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cek.a(this::a).encodeStart(tb.a, this.cA).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dnz.a.a.encodeStart(tb.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cek.a(this::a).parse(new Dynamic(tb.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cA = $$0x);
         this.gl();
      }

      if ($$0.b("listener", 10)) {
         dnz.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
      }
   }

   private void gn() {
      if (!this.c(bmw.l)) {
         this.a(this.A().c(), 10.0F, this.eX());
      }
   }

   public cej A() {
      return cej.a(this.go());
   }

   private int go() {
      return this.cA.b(this.q());
   }

   public void b(blu $$0) {
      this.cA.a($$0);
   }

   public void c(@Nullable blu $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable blu $$0, int $$1, boolean $$2) {
      if (!this.fU() && this.a($$0)) {
         cem.a((bmk)this);
         boolean $$3 = !(this.dO().c(bvm.o).orElse(null) instanceof cfh);
         int $$4 = this.cA.a($$0, $$1);
         if ($$0 instanceof cfh && $$3 && cej.a($$4).d()) {
            this.dO().b(bvm.o);
         }

         if ($$2) {
            this.gn();
         }
      }
   }

   public Optional<bmk> ge() {
      return this.A().d() ? this.cA.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bmk q() {
      return this.dO().c(bvm.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      this.dO().a(bvm.aD, avr.a, 1200L);
      if ($$2 == bmo.k) {
         this.b(bmw.n);
         this.dO().a(bvm.aB, avr.a, (long)cem.a);
         this.a(arr.Av, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.fU() && !this.gi()) {
         blu $$3 = $$0.d();
         this.a($$3, cej.c.a() + 20, false);
         if (this.bz.c(bvm.o).isEmpty() && $$3 instanceof bmk $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bmk $$0) {
      this.dO().b(bvm.ax);
      this.dO().a(bvm.o, $$0);
      this.dO().b(bvm.E);
      bsb.a(this, 200);
   }

   @Override
   public blv a(bmw $$0) {
      blv $$1 = super.a($$0);
      return this.gi() ? blv.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gi() && super.bu();
   }

   @Override
   protected void D(blu $$0) {
      if (!this.fU() && !this.dO().a(bvm.aG)) {
         this.dO().a(bvm.aG, avr.a, 20L);
         this.c($$0);
         cem.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cek gf() {
      return this.cA;
   }

   @Override
   protected bvu b(cto $$0) {
      return new bvt(this, $$0) {
         @Override
         protected efh a(int $$0) {
            this.o = new efk();
            this.o.a(true);
            return new efh(this.o, $$0) {
               @Override
               protected float a(efd $$0, efd $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dnz.a gg() {
      return this.cz;
   }

   @Override
   public dnz.d gh() {
      return this.cy;
   }

   class a implements dnz.d {
      private static final int b = 16;
      private final dnu c = new dno(cel.this, cel.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dnu b() {
         return this.c;
      }

      @Override
      public asv<dnq> c() {
         return asm.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnq $$2, dnq.a $$3) {
         if (!cel.this.fU() && !cel.this.ew() && !cel.this.dO().a(bvm.aH) && !cel.this.gi() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof bmk $$4 && !cel.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(and $$0, hx $$1, dnq $$2, @Nullable blu $$3, @Nullable blu $$4, float $$5) {
         if (!cel.this.ew()) {
            cel.this.bz.a(bvm.aH, avr.a, 40L);
            $$0.a(cel.this, (byte)61);
            cel.this.a(arr.AO, 5.0F, cel.this.eX());
            hx $$6 = $$1;
            if ($$4 != null) {
               if (cel.this.a($$4, 30.0)) {
                  if (cel.this.dO().a(bvm.az)) {
                     if (cel.this.a($$4)) {
                        $$6 = $$4.dm();
                     }

                     cel.this.c($$4);
                  } else {
                     cel.this.a($$4, 10, true);
                  }
               }

               cel.this.dO().a(bvm.az, avr.a, 100L);
            } else {
               cel.this.c($$3);
            }

            if (!cel.this.A().d()) {
               Optional<bmk> $$7 = cel.this.cA.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cem.a(cel.this, $$6);
               }
            }
         }
      }
   }
}
