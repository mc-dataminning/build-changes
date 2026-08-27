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

public class cdv extends cbz implements dni {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final afz<Integer> cd = agc.a(cdv.class, agb.b);
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
   private int cv;
   public blb b = new blb();
   public blb c = new blb();
   public blb d = new blb();
   public blb e = new blb();
   public blb bT = new blb();
   public blb bU = new blb();
   private final dmw<dni.b> cw;
   private final dni.d cx;
   private dni.a cy;
   cdu cz = new cdu(this::a, Collections.emptyList());

   public cdv(blj<? extends cbz> $$0, csy $$1) {
      super($$0, $$1);
      this.cx = new cdv.a();
      this.cy = new dni.a();
      this.cw = new dmw<>(new dni.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(eek.m, 0.0F);
      this.a(eek.q, 8.0F);
      this.a(eek.f, 8.0F);
      this.a(eek.i, 8.0F);
      this.a(eek.o, 0.0F);
      this.a(eek.n, 0.0F);
   }

   @Override
   public wu<yo> dj() {
      return new yp(this, this.c(bmh.n) ? 1 : 0);
   }

   @Override
   public void a(yp $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bmh.n);
      }
   }

   @Override
   public boolean a(ctb $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bkd $$0) {
      return this.gi() && !$$0.a(art.e) ? true : super.b($$0);
   }

   boolean gi() {
      return this.c(bmh.o) || this.c(bmh.n);
   }

   @Override
   protected boolean o(blf $$0) {
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

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 500.0).a(bnb.m, 0.3F).a(bnb.i, 1.0).a(bnb.d, 1.5).a(bnb.c, 30.0);
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
   protected arb y() {
      return !this.c(bmh.l) && !this.gi() ? this.A().b() : null;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.AD;
   }

   @Override
   protected arb n_() {
      return arc.Az;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.AN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(blf $$0) {
      this.dM().a(this, (byte)4);
      this.a(arc.Ay, 10.0F, this.eX());
      brm.a(this, 40);
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
      if (this.dM() instanceof amp $$0) {
         dni.c.a($$0, this.cy, this.cx);
         if (this.fL() || this.W()) {
            cdw.a((blv)this);
         }
      }

      super.l();
      if (this.dM().y_()) {
         if (this.ah % this.gm() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), arc.AC, this.db(), 5.0F, this.eX(), false);
            }
         }

         this.ct = this.cs;
         if (this.cs > 0) {
            this.cs--;
         }

         this.cv = this.cu;
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
      amp $$0 = (amp)this.dM();
      $$0.ae().a("wardenBrain");
      this.dO().a($$0, this);
      this.dM().ae().c();
      super.Z();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dk(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gl();
      }

      cdw.a(this);
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
      float $$0 = (float)this.w() / (float)cdt.c.a();
      return 40 - aty.d(aty.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return aty.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return aty.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(blb $$0) {
      if ((float)$$0.b() < 4500.0F) {
         auf $$1 = this.eg();
         dip $$2 = this.bk();
         if ($$2.l() != dce.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)aty.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)aty.b($$1, -0.7F, 0.7F);
               this.dM().a(new jn(jv.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(afz<?> $$0) {
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
   public boolean a(csq $$0) {
      return this.gi();
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return cdw.a(this, $$0);
   }

   @Override
   public bmv<cdv> dO() {
      return (bmv<cdv>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   public void a(BiConsumer<dmw<?>, amp> $$0) {
      if (this.dM() instanceof amp $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable blf $$0) {
      if ($$0 instanceof blv $$1
         && this.dM() == $$0.dM()
         && bli.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != blj.d
         && $$1.ai() != blj.bj
         && !$$1.cr()
         && !$$1.ew()
         && this.dM().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(amp $$0, elb $$1, @Nullable blf $$2, int $$3) {
      bks $$4 = new bks(bku.G, 260, 0, false, false);
      bkt.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      cdu.a(this::a).encodeStart(sx.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dni.a.a.encodeStart(sx.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cdu.a(this::a).parse(new Dynamic(sx.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gl();
      }

      if ($$0.b("listener", 10)) {
         dni.a.a.parse(new Dynamic(sx.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gn() {
      if (!this.c(bmh.l)) {
         this.a(this.A().c(), 10.0F, this.eX());
      }
   }

   public cdt A() {
      return cdt.a(this.go());
   }

   private int go() {
      return this.cz.b(this.q());
   }

   public void b(blf $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable blf $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable blf $$0, int $$1, boolean $$2) {
      if (!this.fU() && this.a($$0)) {
         cdw.a((blv)this);
         boolean $$3 = !(this.dO().c(bux.o).orElse(null) instanceof cer);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cer && $$3 && cdt.a($$4).d()) {
            this.dO().b(bux.o);
         }

         if ($$2) {
            this.gn();
         }
      }
   }

   public Optional<blv> ge() {
      return this.A().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public blv q() {
      return this.dO().c(bux.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.dO().a(bux.aD, avc.a, 1200L);
      if ($$2 == blz.k) {
         this.b(bmh.n);
         this.dO().a(bux.aB, avc.a, (long)cdw.a);
         this.a(arc.Av, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.fU() && !this.gi()) {
         blf $$3 = $$0.d();
         this.a($$3, cdt.c.a() + 20, false);
         if (this.bz.c(bux.o).isEmpty() && $$3 instanceof blv $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(blv $$0) {
      this.dO().b(bux.ax);
      this.dO().a(bux.o, $$0);
      this.dO().b(bux.E);
      brm.a(this, 200);
   }

   @Override
   public blg a(bmh $$0) {
      blg $$1 = super.a($$0);
      return this.gi() ? blg.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gi() && super.bu();
   }

   @Override
   protected void D(blf $$0) {
      if (!this.fU() && !this.dO().a(bux.aG)) {
         this.dO().a(bux.aG, avc.a, 20L);
         this.c($$0);
         cdw.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cdu gf() {
      return this.cz;
   }

   @Override
   protected bvf b(csy $$0) {
      return new bve(this, $$0) {
         @Override
         protected eeq a(int $$0) {
            this.o = new eet();
            this.o.a(true);
            return new eeq(this.o, $$0) {
               @Override
               protected float a(eem $$0, eem $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dni.a gg() {
      return this.cy;
   }

   @Override
   public dni.d gh() {
      return this.cx;
   }

   class a implements dni.d {
      private static final int b = 16;
      private final dnd c = new dmx(cdv.this, cdv.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dnd b() {
         return this.c;
      }

      @Override
      public asg<dmz> c() {
         return arx.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(amp $$0, hv $$1, dmz $$2, dmz.a $$3) {
         if (!cdv.this.fU() && !cdv.this.ew() && !cdv.this.dO().a(bux.aH) && !cdv.this.gi() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof blv $$4 && !cdv.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(amp $$0, hv $$1, dmz $$2, @Nullable blf $$3, @Nullable blf $$4, float $$5) {
         if (!cdv.this.ew()) {
            cdv.this.bz.a(bux.aH, avc.a, 40L);
            $$0.a(cdv.this, (byte)61);
            cdv.this.a(arc.AO, 5.0F, cdv.this.eX());
            hv $$6 = $$1;
            if ($$4 != null) {
               if (cdv.this.a($$4, 30.0)) {
                  if (cdv.this.dO().a(bux.az)) {
                     if (cdv.this.a($$4)) {
                        $$6 = $$4.dm();
                     }

                     cdv.this.c($$4);
                  } else {
                     cdv.this.a($$4, 10, true);
                  }
               }

               cdv.this.dO().a(bux.az, avc.a, 100L);
            } else {
               cdv.this.c($$3);
            }

            if (!cdv.this.A().d()) {
               Optional<blv> $$7 = cdv.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cdw.a(cdv.this, $$6);
               }
            }
         }
      }
   }
}
