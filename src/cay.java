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

public class cay extends bzi implements dkc {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final aef<Integer> cd = aei.a(cay.class, aeh.b);
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
   public bim b = new bim();
   public bim c = new bim();
   public bim d = new bim();
   public bim e = new bim();
   public bim bT = new bim();
   public bim bU = new bim();
   private final djq<dkc.b> cw;
   private final dkc.d cx;
   private dkc.a cy;
   cax cz = new cax(this::a, Collections.emptyList());

   public cay(biu<? extends bzi> $$0, cpv $$1) {
      super($$0, $$1);
      this.cx = new cay.a();
      this.cy = new dkc.a();
      this.cw = new djq<>(new dkc.b(this));
      this.bJ = 5;
      this.L().a(true);
      this.a(eax.m, 0.0F);
      this.a(eax.q, 8.0F);
      this.a(eax.f, 8.0F);
      this.a(eax.i, 8.0F);
      this.a(eax.o, 0.0F);
      this.a(eax.n, 0.0F);
   }

   @Override
   public vd<ww> V() {
      return new wx(this, this.c(bjs.n) ? 1 : 0);
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bjs.n);
      }
   }

   @Override
   public boolean a(cpy $$0) {
      return super.a($$0) && $$0.a(this, this.ah().n().a(this.dj()));
   }

   @Override
   public float a(gw $$0, cpy $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bho $$0) {
      return this.gh() && !$$0.a(apv.d) ? true : super.b($$0);
   }

   boolean gh() {
      return this.c(bjs.o) || this.c(bjs.n);
   }

   @Override
   protected boolean o(biq $$0) {
      return false;
   }

   @Override
   public boolean fF() {
      return true;
   }

   @Override
   protected float aL() {
      return this.Z + 0.55F;
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.a, 500.0).a(bkm.d, 0.3F).a(bkm.c, 1.0).a(bkm.g, 1.5).a(bkm.f, 30.0);
   }

   @Override
   public boolean aW() {
      return true;
   }

   @Override
   protected float eV() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected apd w() {
      return !this.c(bjs.l) && !this.gh() ? this.y().b() : null;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.zD;
   }

   @Override
   protected apd l_() {
      return ape.zz;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.zN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(biq $$0) {
      this.dL().a(this, (byte)4);
      this.a(ape.zy, 10.0F, this.eW());
      bow.a(this, 40);
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

   private void gk() {
      this.an.b(cd, this.gn());
   }

   @Override
   public void l() {
      if (this.dL() instanceof akr $$0) {
         dkc.c.a($$0, this.cy, this.cx);
         if (this.fK() || this.U()) {
            caz.a((bjg)this);
         }
      }

      super.l();
      if (this.dL().w_()) {
         if (this.ah % this.gl() == 0) {
            this.cu = 10;
            if (!this.aT()) {
               this.dL().a(this.dq(), this.ds(), this.dw(), ape.zC, this.db(), 5.0F, this.eW(), false);
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

         switch (this.ao()) {
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
      akr $$0 = (akr)this.dL();
      $$0.ad().a("wardenBrain");
      this.dN().a($$0, this);
      this.dL().ad().c();
      super.Y();
      if ((this.ah + this.ai()) % 120 == 0) {
         a($$0, this.dj(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gk();
      }

      caz.a(this);
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

   private int gl() {
      float $$0 = (float)this.t() / (float)caw.c.a();
      return 40 - arx.d(arx.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return arx.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return arx.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bim $$0) {
      if ((float)$$0.b() < 4500.0F) {
         asc $$1 = this.ef();
         dfj $$2 = this.bj();
         if ($$2.l() != cza.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dq() + (double)arx.b($$1, -0.7F, 0.7F);
               double $$5 = this.ds();
               double $$6 = this.dw() + (double)arx.b($$1, -0.7F, 0.7F);
               this.dL().a(new ip(ix.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aef<?> $$0) {
      if (as.equals($$0)) {
         switch (this.ao()) {
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
   public boolean cM() {
      return this.gh();
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return caz.a(this, $$0);
   }

   @Override
   public bkg<cay> dN() {
      return (bkg<cay>)super.dN();
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }

   @Override
   public void a(BiConsumer<djq<?>, akr> $$0) {
      if (this.dL() instanceof akr $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable biq $$0) {
      if ($$0 instanceof bjg $$1
         && this.dL() == $$0.dL()
         && bit.e.test($$0)
         && !this.s($$0)
         && $$1.ah() != biu.d
         && $$1.ah() != biu.bi
         && !$$1.cr()
         && !$$1.ev()
         && this.dL().B_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(akr $$0, ehn $$1, @Nullable biq $$2, int $$3) {
      bid $$4 = new bid(bif.G, 260, 0, false, false);
      bie.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      cax.a(this::a).encodeStart(ri.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dkc.a.a.encodeStart(ri.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cax.a(this::a).parse(new Dynamic(ri.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gk();
      }

      if ($$0.b("listener", 10)) {
         dkc.a.a.parse(new Dynamic(ri.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gm() {
      if (!this.c(bjs.l)) {
         this.a(this.y().c(), 10.0F, this.eW());
      }
   }

   public caw y() {
      return caw.a(this.gn());
   }

   private int gn() {
      return this.cz.b(this.q());
   }

   public void b(biq $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable biq $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable biq $$0, int $$1, boolean $$2) {
      if (!this.fT() && this.a($$0)) {
         caz.a((bjg)this);
         boolean $$3 = !(this.dN().c(bsh.o).orElse(null) instanceof cbu);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cbu && $$3 && caw.a($$4).d()) {
            this.dN().b(bsh.o);
         }

         if ($$2) {
            this.gm();
         }
      }
   }

   public Optional<bjg> gd() {
      return this.y().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bjg q() {
      return this.dN().c(bsh.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      this.dN().a(bsh.aD, asx.a, 1200L);
      if ($$2 == bjk.k) {
         this.b(bjs.n);
         this.dN().a(bsh.aB, asx.a, (long)caz.a);
         this.a(ape.zv, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dL().B && !this.fT() && !this.gh()) {
         biq $$3 = $$0.d();
         this.a($$3, caw.c.a() + 20, false);
         if (this.bz.c(bsh.o).isEmpty() && $$3 instanceof bjg $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bjg $$0) {
      this.dN().b(bsh.ax);
      this.dN().a(bsh.o, $$0);
      this.dN().b(bsh.E);
      bow.a(this, 200);
   }

   @Override
   public bir a(bjs $$0) {
      bir $$1 = super.a($$0);
      return this.gh() ? bir.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bt() {
      return !this.gh() && super.bt();
   }

   @Override
   protected void D(biq $$0) {
      if (!this.fT() && !this.dN().a(bsh.aG)) {
         this.dN().a(bsh.aG, asx.a, 20L);
         this.c($$0);
         caz.a(this, $$0.dl());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cax ge() {
      return this.cz;
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bso(this, $$0) {
         @Override
         protected ebd a(int $$0) {
            this.o = new ebg();
            this.o.a(true);
            return new ebd(this.o, $$0) {
               @Override
               protected float a(eaz $$0, eaz $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dkc.a gf() {
      return this.cy;
   }

   @Override
   public dkc.d gg() {
      return this.cx;
   }

   class a implements dkc.d {
      private static final int b = 16;
      private final djx c = new djr(cay.this, cay.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djx b() {
         return this.c;
      }

      @Override
      public aqi<djt> c() {
         return apz.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akr $$0, gw $$1, djt $$2, djt.a $$3) {
         if (!cay.this.fT() && !cay.this.ev() && !cay.this.dN().a(bsh.aH) && !cay.this.gh() && $$0.B_().a($$1)) {
            if ($$3.a() instanceof bjg $$4 && !cay.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(akr $$0, gw $$1, djt $$2, @Nullable biq $$3, @Nullable biq $$4, float $$5) {
         if (!cay.this.ev()) {
            cay.this.bz.a(bsh.aH, asx.a, 40L);
            $$0.a(cay.this, (byte)61);
            cay.this.a(ape.zO, 5.0F, cay.this.eW());
            gw $$6 = $$1;
            if ($$4 != null) {
               if (cay.this.a($$4, 30.0)) {
                  if (cay.this.dN().a(bsh.az)) {
                     if (cay.this.a($$4)) {
                        $$6 = $$4.dl();
                     }

                     cay.this.c($$4);
                  } else {
                     cay.this.a($$4, 10, true);
                  }
               }

               cay.this.dN().a(bsh.az, asx.a, 100L);
            } else {
               cay.this.c($$3);
            }

            if (!cay.this.y().d()) {
               Optional<bjg> $$7 = cay.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  caz.a(cay.this, $$6);
               }
            }
         }
      }
   }
}
