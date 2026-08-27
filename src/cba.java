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

public class cba extends bzk implements dke {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final aeg<Integer> cd = aej.a(cba.class, aei.b);
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
   public bio b = new bio();
   public bio c = new bio();
   public bio d = new bio();
   public bio e = new bio();
   public bio bT = new bio();
   public bio bU = new bio();
   private final djs<dke.b> cw;
   private final dke.d cx;
   private dke.a cy;
   caz cz = new caz(this::a, Collections.emptyList());

   public cba(biw<? extends bzk> $$0, cpx $$1) {
      super($$0, $$1);
      this.cx = new cba.a();
      this.cy = new dke.a();
      this.cw = new djs<>(new dke.b(this));
      this.bJ = 5;
      this.L().a(true);
      this.a(eaz.m, 0.0F);
      this.a(eaz.q, 8.0F);
      this.a(eaz.f, 8.0F);
      this.a(eaz.i, 8.0F);
      this.a(eaz.o, 0.0F);
      this.a(eaz.n, 0.0F);
   }

   @Override
   public vf<wy> di() {
      return new wz(this, this.c(bju.n) ? 1 : 0);
   }

   @Override
   public void a(wz $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bju.n);
      }
   }

   @Override
   public boolean a(cqa $$0) {
      return super.a($$0) && $$0.a(this, this.ag().n().a(this.dj()));
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bhq $$0) {
      return this.gh() && !$$0.a(apw.d) ? true : super.b($$0);
   }

   boolean gh() {
      return this.c(bju.o) || this.c(bju.n);
   }

   @Override
   protected boolean o(bis $$0) {
      return false;
   }

   @Override
   public boolean fF() {
      return true;
   }

   @Override
   protected float aK() {
      return this.Z + 0.55F;
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 500.0).a(bko.d, 0.3F).a(bko.c, 1.0).a(bko.g, 1.5).a(bko.f, 30.0);
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
   protected ape w() {
      return !this.c(bju.l) && !this.gh() ? this.y().b() : null;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.zD;
   }

   @Override
   protected ape l_() {
      return apf.zz;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.zN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bis $$0) {
      this.dL().a(this, (byte)4);
      this.a(apf.zy, 10.0F, this.eW());
      boy.a(this, 40);
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
      if (this.dL() instanceof aks $$0) {
         dke.c.a($$0, this.cy, this.cx);
         if (this.fK() || this.U()) {
            cbb.a((bji)this);
         }
      }

      super.l();
      if (this.dL().w_()) {
         if (this.ah % this.gl() == 0) {
            this.cu = 10;
            if (!this.aS()) {
               this.dL().a(this.dq(), this.ds(), this.dw(), apf.zC, this.da(), 5.0F, this.eW(), false);
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
      aks $$0 = (aks)this.dL();
      $$0.ad().a("wardenBrain");
      this.dN().a($$0, this);
      this.dL().ad().c();
      super.X();
      if ((this.ah + this.ah()) % 120 == 0) {
         a($$0, this.dj(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gk();
      }

      cbb.a(this);
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
      float $$0 = (float)this.t() / (float)cay.c.a();
      return 40 - ary.d(ary.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return ary.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return ary.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bio $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ase $$1 = this.ef();
         dfl $$2 = this.bi();
         if ($$2.l() != czc.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dq() + (double)ary.b($$1, -0.7F, 0.7F);
               double $$5 = this.ds();
               double $$6 = this.dw() + (double)ary.b($$1, -0.7F, 0.7F);
               this.dL().a(new ip(ix.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aeg<?> $$0) {
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
      return this.gh();
   }

   @Override
   protected bki<?> a(Dynamic<?> $$0) {
      return cbb.a(this, $$0);
   }

   @Override
   public bki<cba> dN() {
      return (bki<cba>)super.dN();
   }

   @Override
   protected void W() {
      super.W();
      abd.a(this);
   }

   @Override
   public void a(BiConsumer<djs<?>, aks> $$0) {
      if (this.dL() instanceof aks $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bis $$0) {
      if ($$0 instanceof bji $$1
         && this.dL() == $$0.dL()
         && biv.e.test($$0)
         && !this.s($$0)
         && $$1.ag() != biw.d
         && $$1.ag() != biw.bi
         && !$$1.cq()
         && !$$1.ev()
         && this.dL().B_().a($$1.cG())) {
         return true;
      }

      return false;
   }

   public static void a(aks $$0, ehp $$1, @Nullable bis $$2, int $$3) {
      bif $$4 = new bif(bih.G, 260, 0, false, false);
      big.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      caz.a(this::a).encodeStart(rk.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dke.a.a.encodeStart(rk.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         caz.a(this::a).parse(new Dynamic(rk.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gk();
      }

      if ($$0.b("listener", 10)) {
         dke.a.a.parse(new Dynamic(rk.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gm() {
      if (!this.c(bju.l)) {
         this.a(this.y().c(), 10.0F, this.eW());
      }
   }

   public cay y() {
      return cay.a(this.gn());
   }

   private int gn() {
      return this.cz.b(this.q());
   }

   public void b(bis $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable bis $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bis $$0, int $$1, boolean $$2) {
      if (!this.fT() && this.a($$0)) {
         cbb.a((bji)this);
         boolean $$3 = !(this.dN().c(bsj.o).orElse(null) instanceof cbw);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cbw && $$3 && cay.a($$4).d()) {
            this.dN().b(bsj.o);
         }

         if ($$2) {
            this.gm();
         }
      }
   }

   public Optional<bji> gd() {
      return this.y().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bji q() {
      return this.dN().c(bsj.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.dN().a(bsj.aD, asz.a, 1200L);
      if ($$2 == bjm.k) {
         this.b(bju.n);
         this.dN().a(bsj.aB, asz.a, (long)cbb.a);
         this.a(apf.zv, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dL().B && !this.fT() && !this.gh()) {
         bis $$3 = $$0.d();
         this.a($$3, cay.c.a() + 20, false);
         if (this.bz.c(bsj.o).isEmpty() && $$3 instanceof bji $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bji $$0) {
      this.dN().b(bsj.ax);
      this.dN().a(bsj.o, $$0);
      this.dN().b(bsj.E);
      boy.a(this, 200);
   }

   @Override
   public bit a(bju $$0) {
      bit $$1 = super.a($$0);
      return this.gh() ? bit.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bs() {
      return !this.gh() && super.bs();
   }

   @Override
   protected void D(bis $$0) {
      if (!this.fT() && !this.dN().a(bsj.aG)) {
         this.dN().a(bsj.aG, asz.a, 20L);
         this.c($$0);
         cbb.a(this, $$0.dl());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public caz ge() {
      return this.cz;
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bsq(this, $$0) {
         @Override
         protected ebf a(int $$0) {
            this.o = new ebi();
            this.o.a(true);
            return new ebf(this.o, $$0) {
               @Override
               protected float a(ebb $$0, ebb $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dke.a gf() {
      return this.cy;
   }

   @Override
   public dke.d gg() {
      return this.cx;
   }

   class a implements dke.d {
      private static final int b = 16;
      private final djz c = new djt(cba.this, cba.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djz b() {
         return this.c;
      }

      @Override
      public aqj<djv> c() {
         return aqa.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aks $$0, gw $$1, djv $$2, djv.a $$3) {
         if (!cba.this.fT() && !cba.this.ev() && !cba.this.dN().a(bsj.aH) && !cba.this.gh() && $$0.B_().a($$1)) {
            if ($$3.a() instanceof bji $$4 && !cba.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aks $$0, gw $$1, djv $$2, @Nullable bis $$3, @Nullable bis $$4, float $$5) {
         if (!cba.this.ev()) {
            cba.this.bz.a(bsj.aH, asz.a, 40L);
            $$0.a(cba.this, (byte)61);
            cba.this.a(apf.zO, 5.0F, cba.this.eW());
            gw $$6 = $$1;
            if ($$4 != null) {
               if (cba.this.a($$4, 30.0)) {
                  if (cba.this.dN().a(bsj.az)) {
                     if (cba.this.a($$4)) {
                        $$6 = $$4.dl();
                     }

                     cba.this.c($$4);
                  } else {
                     cba.this.a($$4, 10, true);
                  }
               }

               cba.this.dN().a(bsj.az, asz.a, 100L);
            } else {
               cba.this.c($$3);
            }

            if (!cba.this.y().d()) {
               Optional<bji> $$7 = cba.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cbb.a(cba.this, $$6);
               }
            }
         }
      }
   }
}
