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

public class cat extends bzd implements djx {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final aec<Integer> cd = aef.a(cat.class, aee.b);
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
   public bih b = new bih();
   public bih c = new bih();
   public bih d = new bih();
   public bih e = new bih();
   public bih bT = new bih();
   public bih bU = new bih();
   private final djl<djx.b> cw;
   private final djx.d cx;
   private djx.a cy;
   cas cz = new cas(this::a, Collections.emptyList());

   public cat(bip<? extends bzd> $$0, cpq $$1) {
      super($$0, $$1);
      this.cx = new cat.a();
      this.cy = new djx.a();
      this.cw = new djl<>(new djx.b(this));
      this.bJ = 5;
      this.H().a(true);
      this.a(eas.m, 0.0F);
      this.a(eas.q, 8.0F);
      this.a(eas.f, 8.0F);
      this.a(eas.i, 8.0F);
      this.a(eas.o, 0.0F);
      this.a(eas.n, 0.0F);
   }

   @Override
   public va<ws> U() {
      return new wt(this, this.c(bjn.n) ? 1 : 0);
   }

   @Override
   public void a(wt $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bjn.n);
      }
   }

   @Override
   public boolean a(cpt $$0) {
      return super.a($$0) && $$0.a(this, this.ag().n().a(this.di()));
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bhj $$0) {
      return this.ge() && !$$0.a(apq.d) ? true : super.b($$0);
   }

   boolean ge() {
      return this.c(bjn.o) || this.c(bjn.n);
   }

   @Override
   protected boolean o(bil $$0) {
      return false;
   }

   @Override
   public boolean fE() {
      return true;
   }

   @Override
   protected float aK() {
      return this.Z + 0.55F;
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 500.0).a(bkh.d, 0.3F).a(bkh.c, 1.0).a(bkh.g, 1.5).a(bkh.f, 30.0);
   }

   @Override
   public boolean aV() {
      return true;
   }

   @Override
   protected float eU() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected aoy r() {
      return !this.c(bjn.l) && !this.ge() ? this.t().b() : null;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.zD;
   }

   @Override
   protected aoy h_() {
      return aoz.zz;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.zN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bil $$0) {
      this.dK().a(this, (byte)4);
      this.a(aoz.zy, 10.0F, this.eV());
      bor.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, 0);
   }

   public int q() {
      return this.an.b(cd);
   }

   private void gh() {
      this.an.b(cd, this.gk());
   }

   @Override
   public void l() {
      if (this.dK() instanceof akn $$0) {
         djx.c.a($$0, this.cy, this.cx);
         if (this.fH() || this.R()) {
            cau.a((bjb)this);
         }
      }

      super.l();
      if (this.dK().r_()) {
         if (this.ah % this.gi() == 0) {
            this.cu = 10;
            if (!this.aS()) {
               this.dK().a(this.dp(), this.dr(), this.dv(), aoz.zC, this.da(), 5.0F, this.eV(), false);
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
   protected void V() {
      akn $$0 = (akn)this.dK();
      $$0.ad().a("wardenBrain");
      this.dM().a($$0, this);
      this.dK().ad().c();
      super.V();
      if ((this.ah + this.ah()) % 120 == 0) {
         a($$0, this.di(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gh();
      }

      cau.a(this);
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

   private int gi() {
      float $$0 = (float)this.q() / (float)car.c.a();
      return 40 - ars.d(ars.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return ars.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return ars.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bih $$0) {
      if ((float)$$0.b() < 4500.0F) {
         arx $$1 = this.ee();
         dfe $$2 = this.bi();
         if ($$2.l() != cyv.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dp() + (double)ars.b($$1, -0.7F, 0.7F);
               double $$5 = this.dr();
               double $$6 = this.dv() + (double)ars.b($$1, -0.7F, 0.7F);
               this.dK().a(new ip(ix.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(aec<?> $$0) {
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
      return this.ge();
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return cau.a(this, $$0);
   }

   @Override
   public bkb<cat> dM() {
      return (bkb<cat>)super.dM();
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   public void a(BiConsumer<djl<?>, akn> $$0) {
      if (this.dK() instanceof akn $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bil $$0) {
      if ($$0 instanceof bjb $$1
         && this.dK() == $$0.dK()
         && bio.e.test($$0)
         && !this.s($$0)
         && $$1.ag() != bip.d
         && $$1.ag() != bip.bi
         && !$$1.cq()
         && !$$1.eu()
         && this.dK().w_().a($$1.cG())) {
         return true;
      }

      return false;
   }

   public static void a(akn $$0, ehi $$1, @Nullable bil $$2, int $$3) {
      bhy $$4 = new bhy(bia.G, 260, 0, false, false);
      bhz.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      cas.a(this::a).encodeStart(rf.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      djx.a.a.encodeStart(rf.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cas.a(this::a).parse(new Dynamic(rf.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gh();
      }

      if ($$0.b("listener", 10)) {
         djx.a.a.parse(new Dynamic(rf.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gj() {
      if (!this.c(bjn.l)) {
         this.a(this.t().c(), 10.0F, this.eV());
      }
   }

   public car t() {
      return car.a(this.gk());
   }

   private int gk() {
      return this.cz.b(this.j());
   }

   public void b(bil $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable bil $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bil $$0, int $$1, boolean $$2) {
      if (!this.fQ() && this.a($$0)) {
         cau.a((bjb)this);
         boolean $$3 = !(this.dM().c(bsc.o).orElse(null) instanceof cbp);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cbp && $$3 && car.a($$4).d()) {
            this.dM().b(bsc.o);
         }

         if ($$2) {
            this.gj();
         }
      }
   }

   public Optional<bjb> ga() {
      return this.t().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bjb j() {
      return this.dM().c(bsc.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.dM().a(bsc.aD, ass.a, 1200L);
      if ($$2 == bjf.k) {
         this.b(bjn.n);
         this.dM().a(bsc.aB, ass.a, (long)cau.a);
         this.a(aoz.zv, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dK().B && !this.fQ() && !this.ge()) {
         bil $$3 = $$0.d();
         this.a($$3, car.c.a() + 20, false);
         if (this.bz.c(bsc.o).isEmpty() && $$3 instanceof bjb $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bjb $$0) {
      this.dM().b(bsc.ax);
      this.dM().a(bsc.o, $$0);
      this.dM().b(bsc.E);
      bor.a(this, 200);
   }

   @Override
   public bim a(bjn $$0) {
      bim $$1 = super.a($$0);
      return this.ge() ? bim.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bs() {
      return !this.ge() && super.bs();
   }

   @Override
   protected void D(bil $$0) {
      if (!this.fQ() && !this.dM().a(bsc.aG)) {
         this.dM().a(bsc.aG, ass.a, 20L);
         this.c($$0);
         cau.a(this, $$0.dk());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cas gb() {
      return this.cz;
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bsj(this, $$0) {
         @Override
         protected eay a(int $$0) {
            this.o = new ebb();
            this.o.a(true);
            return new eay(this.o, $$0) {
               @Override
               protected float a(eau $$0, eau $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public djx.a gc() {
      return this.cy;
   }

   @Override
   public djx.d gd() {
      return this.cx;
   }

   class a implements djx.d {
      private static final int b = 16;
      private final djs c = new djm(cat.this, cat.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djs b() {
         return this.c;
      }

      @Override
      public aqd<djo> c() {
         return apu.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akn $$0, gw $$1, djo $$2, djo.a $$3) {
         if (!cat.this.fQ() && !cat.this.eu() && !cat.this.dM().a(bsc.aH) && !cat.this.ge() && $$0.w_().a($$1)) {
            if ($$3.a() instanceof bjb $$4 && !cat.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(akn $$0, gw $$1, djo $$2, @Nullable bil $$3, @Nullable bil $$4, float $$5) {
         if (!cat.this.eu()) {
            cat.this.bz.a(bsc.aH, ass.a, 40L);
            $$0.a(cat.this, (byte)61);
            cat.this.a(aoz.zO, 5.0F, cat.this.eV());
            gw $$6 = $$1;
            if ($$4 != null) {
               if (cat.this.a($$4, 30.0)) {
                  if (cat.this.dM().a(bsc.az)) {
                     if (cat.this.a($$4)) {
                        $$6 = $$4.dk();
                     }

                     cat.this.c($$4);
                  } else {
                     cat.this.a($$4, 10, true);
                  }
               }

               cat.this.dM().a(bsc.az, ass.a, 100L);
            } else {
               cat.this.c($$3);
            }

            if (!cat.this.t().d()) {
               Optional<bjb> $$7 = cat.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cau.a(cat.this, $$6);
               }
            }
         }
      }
   }
}
