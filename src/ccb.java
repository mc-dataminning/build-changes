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

public class ccb extends cal implements dku {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final afc<Integer> cd = aff.a(ccb.class, afe.b);
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
   public bjp b = new bjp();
   public bjp c = new bjp();
   public bjp d = new bjp();
   public bjp e = new bjp();
   public bjp bT = new bjp();
   public bjp bU = new bjp();
   private final dki<dku.b> cw;
   private final dku.d cx;
   private dku.a cy;
   cca cz = new cca(this::a, Collections.emptyList());

   public ccb(bjx<? extends cal> $$0, cqz $$1) {
      super($$0, $$1);
      this.cx = new ccb.a();
      this.cy = new dku.a();
      this.cw = new dki<>(new dku.b(this));
      this.bJ = 5;
      this.L().a(true);
      this.a(ebp.m, 0.0F);
      this.a(ebp.q, 8.0F);
      this.a(ebp.f, 8.0F);
      this.a(ebp.i, 8.0F);
      this.a(ebp.o, 0.0F);
      this.a(ebp.n, 0.0F);
   }

   @Override
   public wb<xu> di() {
      return new xv(this, this.c(bkv.n) ? 1 : 0);
   }

   @Override
   public void a(xv $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bkv.n);
      }
   }

   @Override
   public boolean a(crc $$0) {
      return super.a($$0) && $$0.a(this, this.ag().n().a(this.dj()));
   }

   @Override
   public float a(ht $$0, crc $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bir $$0) {
      return this.gi() && !$$0.a(aqu.d) ? true : super.b($$0);
   }

   boolean gi() {
      return this.c(bkv.o) || this.c(bkv.n);
   }

   @Override
   protected boolean o(bjt $$0) {
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

   public static blo.a s() {
      return cal.gk().a(blp.l, 500.0).a(blp.m, 0.3F).a(blp.i, 1.0).a(blp.d, 1.5).a(blp.c, 30.0);
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
   protected aqc w() {
      return !this.c(bkv.l) && !this.gi() ? this.y().b() : null;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.zF;
   }

   @Override
   protected aqc m_() {
      return aqd.zB;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.zP, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bjt $$0) {
      this.dL().a(this, (byte)4);
      this.a(aqd.zA, 10.0F, this.eW());
      bpz.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void b_() {
      super.b_();
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
      if (this.dL() instanceof alq $$0) {
         dku.c.a($$0, this.cy, this.cx);
         if (this.fL() || this.U()) {
            ccc.a((bkj)this);
         }
      }

      super.l();
      if (this.dL().x_()) {
         if (this.ah % this.gm() == 0) {
            this.cu = 10;
            if (!this.aS()) {
               this.dL().a(this.dq(), this.ds(), this.dw(), aqd.zE, this.da(), 5.0F, this.eW(), false);
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
      alq $$0 = (alq)this.dL();
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

      ccc.a(this);
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
      float $$0 = (float)this.t() / (float)cbz.c.a();
      return 40 - asy.d(asy.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return asy.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return asy.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bjp $$0) {
      if ((float)$$0.b() < 4500.0F) {
         ate $$1 = this.ef();
         dgb $$2 = this.bi();
         if ($$2.l() != dae.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dq() + (double)asy.b($$1, -0.7F, 0.7F);
               double $$5 = this.ds();
               double $$6 = this.dw() + (double)asy.b($$1, -0.7F, 0.7F);
               this.dL().a(new jk(js.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(afc<?> $$0) {
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
   protected blj<?> a(Dynamic<?> $$0) {
      return ccc.a(this, $$0);
   }

   @Override
   public blj<ccb> dN() {
      return (blj<ccb>)super.dN();
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   public void a(BiConsumer<dki<?>, alq> $$0) {
      if (this.dL() instanceof alq $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bjt $$0) {
      if ($$0 instanceof bkj $$1
         && this.dL() == $$0.dL()
         && bjw.e.test($$0)
         && !this.s($$0)
         && $$1.ag() != bjx.d
         && $$1.ag() != bjx.bi
         && !$$1.cq()
         && !$$1.ev()
         && this.dL().C_().a($$1.cG())) {
         return true;
      }

      return false;
   }

   public static void a(alq $$0, eif $$1, @Nullable bjt $$2, int $$3) {
      bjg $$4 = new bjg(bji.G, 260, 0, false, false);
      bjh.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      cca.a(this::a).encodeStart(sf.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dku.a.a.encodeStart(sf.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cca.a(this::a).parse(new Dynamic(sf.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gl();
      }

      if ($$0.b("listener", 10)) {
         dku.a.a.parse(new Dynamic(sf.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gn() {
      if (!this.c(bkv.l)) {
         this.a(this.y().c(), 10.0F, this.eW());
      }
   }

   public cbz y() {
      return cbz.a(this.go());
   }

   private int go() {
      return this.cz.b(this.q());
   }

   public void b(bjt $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable bjt $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bjt $$0, int $$1, boolean $$2) {
      if (!this.fU() && this.a($$0)) {
         ccc.a((bkj)this);
         boolean $$3 = !(this.dN().c(btk.o).orElse(null) instanceof ccx);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof ccx && $$3 && cbz.a($$4).d()) {
            this.dN().b(btk.o);
         }

         if ($$2) {
            this.gn();
         }
      }
   }

   public Optional<bkj> ge() {
      return this.y().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bkj q() {
      return this.dN().c(btk.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.dN().a(btk.aD, atz.a, 1200L);
      if ($$2 == bkn.k) {
         this.b(bkv.n);
         this.dN().a(btk.aB, atz.a, (long)ccc.a);
         this.a(aqd.zx, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dL().B && !this.fU() && !this.gi()) {
         bjt $$3 = $$0.d();
         this.a($$3, cbz.c.a() + 20, false);
         if (this.bz.c(btk.o).isEmpty() && $$3 instanceof bkj $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bkj $$0) {
      this.dN().b(btk.ax);
      this.dN().a(btk.o, $$0);
      this.dN().b(btk.E);
      bpz.a(this, 200);
   }

   @Override
   public bju a(bkv $$0) {
      bju $$1 = super.a($$0);
      return this.gi() ? bju.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bs() {
      return !this.gi() && super.bs();
   }

   @Override
   protected void D(bjt $$0) {
      if (!this.fU() && !this.dN().a(btk.aG)) {
         this.dN().a(btk.aG, atz.a, 20L);
         this.c($$0);
         ccc.a(this, $$0.dl());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cca gf() {
      return this.cz;
   }

   @Override
   protected bts b(cqz $$0) {
      return new btr(this, $$0) {
         @Override
         protected ebv a(int $$0) {
            this.o = new eby();
            this.o.a(true);
            return new ebv(this.o, $$0) {
               @Override
               protected float a(ebr $$0, ebr $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dku.a gg() {
      return this.cy;
   }

   @Override
   public dku.d gh() {
      return this.cx;
   }

   class a implements dku.d {
      private static final int b = 16;
      private final dkp c = new dkj(ccb.this, ccb.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dkp b() {
         return this.c;
      }

      @Override
      public arh<dkl> c() {
         return aqy.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(alq $$0, ht $$1, dkl $$2, dkl.a $$3) {
         if (!ccb.this.fU() && !ccb.this.ev() && !ccb.this.dN().a(btk.aH) && !ccb.this.gi() && $$0.C_().a($$1)) {
            if ($$3.a() instanceof bkj $$4 && !ccb.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(alq $$0, ht $$1, dkl $$2, @Nullable bjt $$3, @Nullable bjt $$4, float $$5) {
         if (!ccb.this.ev()) {
            ccb.this.bz.a(btk.aH, atz.a, 40L);
            $$0.a(ccb.this, (byte)61);
            ccb.this.a(aqd.zQ, 5.0F, ccb.this.eW());
            ht $$6 = $$1;
            if ($$4 != null) {
               if (ccb.this.a($$4, 30.0)) {
                  if (ccb.this.dN().a(btk.az)) {
                     if (ccb.this.a($$4)) {
                        $$6 = $$4.dl();
                     }

                     ccb.this.c($$4);
                  } else {
                     ccb.this.a($$4, 10, true);
                  }
               }

               ccb.this.dN().a(btk.az, atz.a, 100L);
            } else {
               ccb.this.c($$3);
            }

            if (!ccb.this.y().d()) {
               Optional<bkj> $$7 = ccb.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  ccc.a(ccb.this, $$6);
               }
            }
         }
      }
   }
}
