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

public class cdd extends cbn implements dmg {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final afs<Integer> cd = afv.a(cdd.class, afu.b);
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
   public bkr b = new bkr();
   public bkr c = new bkr();
   public bkr d = new bkr();
   public bkr e = new bkr();
   public bkr bT = new bkr();
   public bkr bU = new bkr();
   private final dlu<dmg.b> cw;
   private final dmg.d cx;
   private dmg.a cy;
   cdc cz = new cdc(this::a, Collections.emptyList());

   public cdd(bkz<? extends cbn> $$0, csf $$1) {
      super($$0, $$1);
      this.cx = new cdd.a();
      this.cy = new dmg.a();
      this.cw = new dlu<>(new dmg.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(edi.m, 0.0F);
      this.a(edi.q, 8.0F);
      this.a(edi.f, 8.0F);
      this.a(edi.i, 8.0F);
      this.a(edi.o, 0.0F);
      this.a(edi.n, 0.0F);
   }

   @Override
   public wo<yh> dk() {
      return new yi(this, this.c(blx.n) ? 1 : 0);
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(blx.n);
      }
   }

   @Override
   public boolean a(csi $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dl()));
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bjt $$0) {
      return this.gj() && !$$0.a(arm.d) ? true : super.b($$0);
   }

   boolean gj() {
      return this.c(blx.o) || this.c(blx.n);
   }

   @Override
   protected boolean o(bkv $$0) {
      return false;
   }

   @Override
   public boolean fH() {
      return true;
   }

   @Override
   protected float aM() {
      return this.Z + 0.55F;
   }

   public static bmq.a u() {
      return cbn.gl().a(bmr.l, 500.0).a(bmr.m, 0.3F).a(bmr.i, 1.0).a(bmr.d, 1.5).a(bmr.c, 30.0);
   }

   @Override
   public boolean aX() {
      return true;
   }

   @Override
   protected float eX() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected aqu y() {
      return !this.c(blx.l) && !this.gj() ? this.A().b() : null;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.Ai;
   }

   @Override
   protected aqu n_() {
      return aqv.Ae;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.As, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bkv $$0) {
      this.dN().a(this, (byte)4);
      this.a(aqv.Ad, 10.0F, this.eY());
      brb.a(this, 40);
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

   private void gm() {
      this.an.b(cd, this.gp());
   }

   @Override
   public void l() {
      if (this.dN() instanceof ami $$0) {
         dmg.c.a($$0, this.cy, this.cx);
         if (this.fM() || this.W()) {
            cde.a((bll)this);
         }
      }

      super.l();
      if (this.dN().y_()) {
         if (this.ah % this.gn() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dN().a(this.ds(), this.du(), this.dy(), aqv.Ah, this.dc(), 5.0F, this.eY(), false);
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
      ami $$0 = (ami)this.dN();
      $$0.ae().a("wardenBrain");
      this.dP().a($$0, this);
      this.dN().ae().c();
      super.Z();
      if ((this.ah + this.aj()) % 120 == 0) {
         a($$0, this.dl(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gm();
      }

      cde.a(this);
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

   private int gn() {
      float $$0 = (float)this.w() / (float)cdb.c.a();
      return 40 - atq.d(atq.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return atq.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return atq.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bkr $$0) {
      if ((float)$$0.b() < 4500.0F) {
         atw $$1 = this.eh();
         dhn $$2 = this.bk();
         if ($$2.l() != dbk.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.ds() + (double)atq.b($$1, -0.7F, 0.7F);
               double $$5 = this.du();
               double $$6 = this.dy() + (double)atq.b($$1, -0.7F, 0.7F);
               this.dN().a(new jo(jw.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(afs<?> $$0) {
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
   public boolean cM() {
      return this.gj();
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return cde.a(this, $$0);
   }

   @Override
   public bml<cdd> dP() {
      return (bml<cdd>)super.dP();
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   public void a(BiConsumer<dlu<?>, ami> $$0) {
      if (this.dN() instanceof ami $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bkv $$0) {
      if ($$0 instanceof bll $$1
         && this.dN() == $$0.dN()
         && bky.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != bkz.d
         && $$1.ai() != bkz.bi
         && !$$1.cr()
         && !$$1.ex()
         && this.dN().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(ami $$0, ejz $$1, @Nullable bkv $$2, int $$3) {
      bki $$4 = new bki(bkk.G, 260, 0, false, false);
      bkj.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      cdc.a(this::a).encodeStart(sr.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dmg.a.a.encodeStart(sr.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cdc.a(this::a).parse(new Dynamic(sr.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gm();
      }

      if ($$0.b("listener", 10)) {
         dmg.a.a.parse(new Dynamic(sr.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void go() {
      if (!this.c(blx.l)) {
         this.a(this.A().c(), 10.0F, this.eY());
      }
   }

   public cdb A() {
      return cdb.a(this.gp());
   }

   private int gp() {
      return this.cz.b(this.q());
   }

   public void b(bkv $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable bkv $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bkv $$0, int $$1, boolean $$2) {
      if (!this.fV() && this.a($$0)) {
         cde.a((bll)this);
         boolean $$3 = !(this.dP().c(bum.o).orElse(null) instanceof cdz);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cdz && $$3 && cdb.a($$4).d()) {
            this.dP().b(bum.o);
         }

         if ($$2) {
            this.go();
         }
      }
   }

   public Optional<bll> gf() {
      return this.A().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bll q() {
      return this.dP().c(bum.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.dP().a(bum.aD, aus.a, 1200L);
      if ($$2 == blp.k) {
         this.b(blx.n);
         this.dP().a(bum.aB, aus.a, (long)cde.a);
         this.a(aqv.Aa, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dN().B && !this.fV() && !this.gj()) {
         bkv $$3 = $$0.d();
         this.a($$3, cdb.c.a() + 20, false);
         if (this.bz.c(bum.o).isEmpty() && $$3 instanceof bll $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bll $$0) {
      this.dP().b(bum.ax);
      this.dP().a(bum.o, $$0);
      this.dP().b(bum.E);
      brb.a(this, 200);
   }

   @Override
   public bkw a(blx $$0) {
      bkw $$1 = super.a($$0);
      return this.gj() ? bkw.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gj() && super.bu();
   }

   @Override
   protected void D(bkv $$0) {
      if (!this.fV() && !this.dP().a(bum.aG)) {
         this.dP().a(bum.aG, aus.a, 20L);
         this.c($$0);
         cde.a(this, $$0.dn());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cdc gg() {
      return this.cz;
   }

   @Override
   protected buu b(csf $$0) {
      return new but(this, $$0) {
         @Override
         protected edo a(int $$0) {
            this.o = new edr();
            this.o.a(true);
            return new edo(this.o, $$0) {
               @Override
               protected float a(edk $$0, edk $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dmg.a gh() {
      return this.cy;
   }

   @Override
   public dmg.d gi() {
      return this.cx;
   }

   class a implements dmg.d {
      private static final int b = 16;
      private final dmb c = new dlv(cdd.this, cdd.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dmb b() {
         return this.c;
      }

      @Override
      public arz<dlx> c() {
         return arq.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ami $$0, hx $$1, dlx $$2, dlx.a $$3) {
         if (!cdd.this.fV() && !cdd.this.ex() && !cdd.this.dP().a(bum.aH) && !cdd.this.gj() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof bll $$4 && !cdd.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ami $$0, hx $$1, dlx $$2, @Nullable bkv $$3, @Nullable bkv $$4, float $$5) {
         if (!cdd.this.ex()) {
            cdd.this.bz.a(bum.aH, aus.a, 40L);
            $$0.a(cdd.this, (byte)61);
            cdd.this.a(aqv.At, 5.0F, cdd.this.eY());
            hx $$6 = $$1;
            if ($$4 != null) {
               if (cdd.this.a($$4, 30.0)) {
                  if (cdd.this.dP().a(bum.az)) {
                     if (cdd.this.a($$4)) {
                        $$6 = $$4.dn();
                     }

                     cdd.this.c($$4);
                  } else {
                     cdd.this.a($$4, 10, true);
                  }
               }

               cdd.this.dP().a(bum.az, aus.a, 100L);
            } else {
               cdd.this.c($$3);
            }

            if (!cdd.this.A().d()) {
               Optional<bll> $$7 = cdd.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cde.a(cdd.this, $$6);
               }
            }
         }
      }
   }
}
