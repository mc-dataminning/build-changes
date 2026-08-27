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

public class cbe extends bzo implements djw {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final aef<Integer> cd = aei.a(cbe.class, aeh.b);
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
   public bis b = new bis();
   public bis c = new bis();
   public bis d = new bis();
   public bis e = new bis();
   public bis bT = new bis();
   public bis bU = new bis();
   private final djk<djw.b> cw;
   private final djw.d cx;
   private djw.a cy;
   cbd cz = new cbd(this::a, Collections.emptyList());

   public cbe(bja<? extends bzo> $$0, cqb $$1) {
      super($$0, $$1);
      this.cx = new cbe.a();
      this.cy = new djw.a();
      this.cw = new djk<>(new djw.b(this));
      this.bJ = 5;
      this.L().a(true);
      this.a(ear.m, 0.0F);
      this.a(ear.q, 8.0F);
      this.a(ear.f, 8.0F);
      this.a(ear.i, 8.0F);
      this.a(ear.o, 0.0F);
      this.a(ear.n, 0.0F);
   }

   @Override
   public ve<wx> di() {
      return new wy(this, this.c(bjy.n) ? 1 : 0);
   }

   @Override
   public void a(wy $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bjy.n);
      }
   }

   @Override
   public boolean a(cqe $$0) {
      return super.a($$0) && $$0.a(this, this.ag().n().a(this.dj()));
   }

   @Override
   public float a(gw $$0, cqe $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bhu $$0) {
      return this.gi() && !$$0.a(apx.d) ? true : super.b($$0);
   }

   boolean gi() {
      return this.c(bjy.o) || this.c(bjy.n);
   }

   @Override
   protected boolean o(biw $$0) {
      return false;
   }

   @Override
   public boolean fG() {
      return true;
   }

   @Override
   protected float aK() {
      return this.Z + 0.55F;
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 500.0).a(bks.m, 0.3F).a(bks.i, 1.0).a(bks.d, 1.5).a(bks.c, 30.0);
   }

   @Override
   public boolean aV() {
      return true;
   }

   @Override
   protected float eV() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected apf w() {
      return !this.c(bjy.l) && !this.gi() ? this.y().b() : null;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.zD;
   }

   @Override
   protected apf l_() {
      return apg.zz;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.zN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(biw $$0) {
      this.dL().a(this, (byte)4);
      this.a(apg.zy, 10.0F, this.eW());
      bpc.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, 0);
   }

   public int t() {
      return this.an.b(cd);
   }

   private void gl() {
      this.an.b(cd, this.go());
   }

   @Override
   public void l() {
      if (this.dL() instanceof akt $$0) {
         djw.c.a($$0, this.cy, this.cx);
         if (this.fL() || this.U()) {
            cbf.a((bjm)this);
         }
      }

      super.l();
      if (this.dL().w_()) {
         if (this.ah % this.gm() == 0) {
            this.cu = 10;
            if (!this.aS()) {
               this.dL().a(this.dq(), this.ds(), this.dw(), apg.zC, this.da(), 5.0F, this.eW(), false);
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

         switch (this.an()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void X() {
      akt $$0 = (akt)this.dL();
      $$0.ad().a("wardenBrain");
      this.dN().a($$0, this);
      this.dL().ad().c();
      super.X();
      if ((this.ah + this.ah()) % 120 == 0) {
         a($$0, this.dj(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gl();
      }

      cbf.a(this);
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
      float $$0 = (float)this.t() / (float)cbc.c.a();
      return 40 - asb.d(asb.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return asb.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return asb.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bis $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ash $$1 = this.ef();
         dfd $$2 = this.bi();
         if ($$2.l() != czg.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dq() + (double)asb.b($$1, -0.7F, 0.7F);
               double $$5 = this.ds();
               double $$6 = this.dw() + (double)asb.b($$1, -0.7F, 0.7F);
               this.dL().a(new in(iv.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aef<?> $$0) {
      if (as.equals($$0)) {
         switch (this.an()) {
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
   public boolean cL() {
      return this.gi();
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return cbf.a(this, $$0);
   }

   @Override
   public bkm<cbe> dN() {
      return (bkm<cbe>)super.dN();
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   @Override
   public void a(BiConsumer<djk<?>, akt> $$0) {
      if (this.dL() instanceof akt $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable biw $$0) {
      if ($$0 instanceof bjm $$1
         && this.dL() == $$0.dL()
         && biz.e.test($$0)
         && !this.s($$0)
         && $$1.ag() != bja.d
         && $$1.ag() != bja.bi
         && !$$1.cq()
         && !$$1.ev()
         && this.dL().B_().a($$1.cG())) {
         return true;
      }

      return false;
   }

   public static void a(akt $$0, ehh $$1, @Nullable biw $$2, int $$3) {
      bij $$4 = new bij(bil.G, 260, 0, false, false);
      bik.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cbd.a(this::a).encodeStart(ri.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      djw.a.a.encodeStart(ri.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cbd.a(this::a).parse(new Dynamic(ri.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gl();
      }

      if ($$0.b("listener", 10)) {
         djw.a.a.parse(new Dynamic(ri.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gn() {
      if (!this.c(bjy.l)) {
         this.a(this.y().c(), 10.0F, this.eW());
      }
   }

   public cbc y() {
      return cbc.a(this.go());
   }

   private int go() {
      return this.cz.b(this.q());
   }

   public void b(biw $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable biw $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable biw $$0, int $$1, boolean $$2) {
      if (!this.fU() && this.a($$0)) {
         cbf.a((bjm)this);
         boolean $$3 = !(this.dN().c(bsn.o).orElse(null) instanceof cca);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cca && $$3 && cbc.a($$4).d()) {
            this.dN().b(bsn.o);
         }

         if ($$2) {
            this.gn();
         }
      }
   }

   public Optional<bjm> ge() {
      return this.y().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bjm q() {
      return this.dN().c(bsn.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      this.dN().a(bsn.aD, atc.a, 1200L);
      if ($$2 == bjq.k) {
         this.b(bjy.n);
         this.dN().a(bsn.aB, atc.a, (long)cbf.a);
         this.a(apg.zv, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dL().B && !this.fU() && !this.gi()) {
         biw $$3 = $$0.d();
         this.a($$3, cbc.c.a() + 20, false);
         if (this.bz.c(bsn.o).isEmpty() && $$3 instanceof bjm $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bjm $$0) {
      this.dN().b(bsn.ax);
      this.dN().a(bsn.o, $$0);
      this.dN().b(bsn.E);
      bpc.a(this, 200);
   }

   @Override
   public bix a(bjy $$0) {
      bix $$1 = super.a($$0);
      return this.gi() ? bix.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bs() {
      return !this.gi() && super.bs();
   }

   @Override
   protected void D(biw $$0) {
      if (!this.fU() && !this.dN().a(bsn.aG)) {
         this.dN().a(bsn.aG, atc.a, 20L);
         this.c($$0);
         cbf.a(this, $$0.dl());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cbd gf() {
      return this.cz;
   }

   @Override
   protected bsv b(cqb $$0) {
      return new bsu(this, $$0) {
         @Override
         protected eax a(int $$0) {
            this.o = new eba();
            this.o.a(true);
            return new eax(this.o, $$0) {
               @Override
               protected float a(eat $$0, eat $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public djw.a gg() {
      return this.cy;
   }

   @Override
   public djw.d gh() {
      return this.cx;
   }

   class a implements djw.d {
      private static final int b = 16;
      private final djr c = new djl(cbe.this, cbe.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djr b() {
         return this.c;
      }

      @Override
      public aqk<djn> c() {
         return aqb.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akt $$0, gw $$1, djn $$2, djn.a $$3) {
         if (!cbe.this.fU() && !cbe.this.ev() && !cbe.this.dN().a(bsn.aH) && !cbe.this.gi() && $$0.B_().a($$1)) {
            if ($$3.a() instanceof bjm $$4 && !cbe.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(akt $$0, gw $$1, djn $$2, @Nullable biw $$3, @Nullable biw $$4, float $$5) {
         if (!cbe.this.ev()) {
            cbe.this.bz.a(bsn.aH, atc.a, 40L);
            $$0.a(cbe.this, (byte)61);
            cbe.this.a(apg.zO, 5.0F, cbe.this.eW());
            gw $$6 = $$1;
            if ($$4 != null) {
               if (cbe.this.a($$4, 30.0)) {
                  if (cbe.this.dN().a(bsn.az)) {
                     if (cbe.this.a($$4)) {
                        $$6 = $$4.dl();
                     }

                     cbe.this.c($$4);
                  } else {
                     cbe.this.a($$4, 10, true);
                  }
               }

               cbe.this.dN().a(bsn.az, atc.a, 100L);
            } else {
               cbe.this.c($$3);
            }

            if (!cbe.this.y().d()) {
               Optional<bjm> $$7 = cbe.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cbf.a(cbe.this, $$6);
               }
            }
         }
      }
   }
}
