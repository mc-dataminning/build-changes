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

public class cem extends ccp implements doa {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final agm<Integer> cd = agp.a(cem.class, ago.b);
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
   public blr b = new blr();
   public blr c = new blr();
   public blr d = new blr();
   public blr e = new blr();
   public blr bT = new blr();
   public blr bU = new blr();
   private final dno<doa.b> cx;
   private final doa.d cy;
   private doa.a cz;
   cel cA = new cel(this::a, Collections.emptyList());

   public cem(blz<? extends ccp> $$0, ctp $$1) {
      super($$0, $$1);
      this.cy = new cem.a();
      this.cz = new doa.a();
      this.cx = new dno<>(new doa.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(efc.m, 0.0F);
      this.a(efc.q, 8.0F);
      this.a(efc.f, 8.0F);
      this.a(efc.i, 8.0F);
      this.a(efc.o, 0.0F);
      this.a(efc.n, 0.0F);
   }

   @Override
   public xf<za> dj() {
      return new zb(this, this.c(bmx.n) ? 1 : 0);
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bmx.n);
      }
   }

   @Override
   public boolean a(cts $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(hx $$0, cts $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bkt $$0) {
      return this.gi() && !$$0.a(asj.e) ? true : super.b($$0);
   }

   boolean gi() {
      return this.c(bmx.o) || this.c(bmx.n);
   }

   @Override
   protected boolean o(blv $$0) {
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

   public static bnq.a u() {
      return ccp.gk().a(bnr.l, 500.0).a(bnr.m, 0.3F).a(bnr.i, 1.0).a(bnr.d, 1.5).a(bnr.c, 30.0);
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
   protected arr y() {
      return !this.c(bmx.l) && !this.gi() ? this.A().b() : null;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.AD;
   }

   @Override
   protected arr n_() {
      return ars.Az;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.AN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(blv $$0) {
      this.dM().a(this, (byte)4);
      this.a(ars.Ay, 10.0F, this.eX());
      bsc.a(this, 40);
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
         doa.c.a($$0, this.cz, this.cy);
         if (this.fL() || this.W()) {
            cen.a((bml)this);
         }
      }

      super.l();
      if (this.dM().y_()) {
         if (this.ah % this.gm() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), ars.AC, this.db(), 5.0F, this.eX(), false);
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

      cen.a(this);
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
      float $$0 = (float)this.w() / (float)cek.c.a();
      return 40 - auo.d(auo.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return auo.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return auo.i($$0, (float)this.cw, (float)this.cu) / 10.0F;
   }

   private void a(blr $$0) {
      if ((float)$$0.b() < 4500.0F) {
         auv $$1 = this.eg();
         djh $$2 = this.bk();
         if ($$2.l() != dcv.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)auo.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)auo.b($$1, -0.7F, 0.7F);
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
   public boolean a(cth $$0) {
      return this.gi();
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return cen.a(this, $$0);
   }

   @Override
   public bnl<cem> dO() {
      return (bnl<cem>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public void a(BiConsumer<dno<?>, and> $$0) {
      if (this.dM() instanceof and $$1) {
         $$0.accept(this.cx, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable blv $$0) {
      if ($$0 instanceof bml $$1
         && this.dM() == $$0.dM()
         && bly.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != blz.d
         && $$1.ai() != blz.bj
         && !$$1.cr()
         && !$$1.ew()
         && this.dM().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(and $$0, elt $$1, @Nullable blv $$2, int $$3) {
      bli $$4 = new bli(blk.G, 260, 0, false, false);
      blj.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cel.a(this::a).encodeStart(tb.a, this.cA).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      doa.a.a.encodeStart(tb.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cel.a(this::a).parse(new Dynamic(tb.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cA = $$0x);
         this.gl();
      }

      if ($$0.b("listener", 10)) {
         doa.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
      }
   }

   private void gn() {
      if (!this.c(bmx.l)) {
         this.a(this.A().c(), 10.0F, this.eX());
      }
   }

   public cek A() {
      return cek.a(this.go());
   }

   private int go() {
      return this.cA.b(this.q());
   }

   public void b(blv $$0) {
      this.cA.a($$0);
   }

   public void c(@Nullable blv $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable blv $$0, int $$1, boolean $$2) {
      if (!this.fU() && this.a($$0)) {
         cen.a((bml)this);
         boolean $$3 = !(this.dO().c(bvn.o).orElse(null) instanceof cfi);
         int $$4 = this.cA.a($$0, $$1);
         if ($$0 instanceof cfi && $$3 && cek.a($$4).d()) {
            this.dO().b(bvn.o);
         }

         if ($$2) {
            this.gn();
         }
      }
   }

   public Optional<bml> ge() {
      return this.A().d() ? this.cA.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bml q() {
      return this.dO().c(bvn.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      this.dO().a(bvn.aD, avs.a, 1200L);
      if ($$2 == bmp.k) {
         this.b(bmx.n);
         this.dO().a(bvn.aB, avs.a, (long)cen.a);
         this.a(ars.Av, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.fU() && !this.gi()) {
         blv $$3 = $$0.d();
         this.a($$3, cek.c.a() + 20, false);
         if (this.bz.c(bvn.o).isEmpty() && $$3 instanceof bml $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bml $$0) {
      this.dO().b(bvn.ax);
      this.dO().a(bvn.o, $$0);
      this.dO().b(bvn.E);
      bsc.a(this, 200);
   }

   @Override
   public blw a(bmx $$0) {
      blw $$1 = super.a($$0);
      return this.gi() ? blw.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gi() && super.bu();
   }

   @Override
   protected void D(blv $$0) {
      if (!this.fU() && !this.dO().a(bvn.aG)) {
         this.dO().a(bvn.aG, avs.a, 20L);
         this.c($$0);
         cen.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cel gf() {
      return this.cA;
   }

   @Override
   protected bvv b(ctp $$0) {
      return new bvu(this, $$0) {
         @Override
         protected efi a(int $$0) {
            this.o = new efl();
            this.o.a(true);
            return new efi(this.o, $$0) {
               @Override
               protected float a(efe $$0, efe $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public doa.a gg() {
      return this.cz;
   }

   @Override
   public doa.d gh() {
      return this.cy;
   }

   class a implements doa.d {
      private static final int b = 16;
      private final dnv c = new dnp(cem.this, cem.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dnv b() {
         return this.c;
      }

      @Override
      public asw<dnr> c() {
         return asn.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnr $$2, dnr.a $$3) {
         if (!cem.this.fU() && !cem.this.ew() && !cem.this.dO().a(bvn.aH) && !cem.this.gi() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof bml $$4 && !cem.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(and $$0, hx $$1, dnr $$2, @Nullable blv $$3, @Nullable blv $$4, float $$5) {
         if (!cem.this.ew()) {
            cem.this.bz.a(bvn.aH, avs.a, 40L);
            $$0.a(cem.this, (byte)61);
            cem.this.a(ars.AO, 5.0F, cem.this.eX());
            hx $$6 = $$1;
            if ($$4 != null) {
               if (cem.this.a($$4, 30.0)) {
                  if (cem.this.dO().a(bvn.az)) {
                     if (cem.this.a($$4)) {
                        $$6 = $$4.dm();
                     }

                     cem.this.c($$4);
                  } else {
                     cem.this.a($$4, 10, true);
                  }
               }

               cem.this.dO().a(bvn.az, avs.a, 100L);
            } else {
               cem.this.c($$3);
            }

            if (!cem.this.A().d()) {
               Optional<bml> $$7 = cem.this.cA.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cen.a(cem.this, $$6);
               }
            }
         }
      }
   }
}
