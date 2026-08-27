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

public class cef extends ccj implements dnt {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final agj<Integer> cd = agm.a(cef.class, agl.b);
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
   public bll b = new bll();
   public bll c = new bll();
   public bll d = new bll();
   public bll e = new bll();
   public bll bT = new bll();
   public bll bU = new bll();
   private final dnh<dnt.b> cx;
   private final dnt.d cy;
   private dnt.a cz;
   cee cA = new cee(this::a, Collections.emptyList());

   public cef(blt<? extends ccj> $$0, cti $$1) {
      super($$0, $$1);
      this.cy = new cef.a();
      this.cz = new dnt.a();
      this.cx = new dnh<>(new dnt.b(this));
      this.bJ = 5;
      this.N().a(true);
      this.a(eev.m, 0.0F);
      this.a(eev.q, 8.0F);
      this.a(eev.f, 8.0F);
      this.a(eev.i, 8.0F);
      this.a(eev.o, 0.0F);
      this.a(eev.n, 0.0F);
   }

   @Override
   public xd<yx> dj() {
      return new yy(this, this.c(bmr.n) ? 1 : 0);
   }

   @Override
   public void a(yy $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bmr.n);
      }
   }

   @Override
   public boolean a(ctl $$0) {
      return super.a($$0) && $$0.a(this, this.ai().n().a(this.dk()));
   }

   @Override
   public float a(hx $$0, ctl $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bkn $$0) {
      return this.gi() && !$$0.a(asd.e) ? true : super.b($$0);
   }

   boolean gi() {
      return this.c(bmr.o) || this.c(bmr.n);
   }

   @Override
   protected boolean o(blp $$0) {
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

   public static bnk.a u() {
      return ccj.gk().a(bnl.l, 500.0).a(bnl.m, 0.3F).a(bnl.i, 1.0).a(bnl.d, 1.5).a(bnl.c, 30.0);
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
   protected arl y() {
      return !this.c(bmr.l) && !this.gi() ? this.A().b() : null;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.AD;
   }

   @Override
   protected arl n_() {
      return arm.Az;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.AN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(blp $$0) {
      this.dM().a(this, (byte)4);
      this.a(arm.Ay, 10.0F, this.eX());
      brw.a(this, 40);
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
      if (this.dM() instanceof amz $$0) {
         dnt.c.a($$0, this.cz, this.cy);
         if (this.fL() || this.W()) {
            ceg.a((bmf)this);
         }
      }

      super.l();
      if (this.dM().y_()) {
         if (this.ah % this.gm() == 0) {
            this.cu = 10;
            if (!this.aU()) {
               this.dM().a(this.dr(), this.dt(), this.dx(), arm.AC, this.db(), 5.0F, this.eX(), false);
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
      amz $$0 = (amz)this.dM();
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

      ceg.a(this);
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
      float $$0 = (float)this.w() / (float)ced.c.a();
      return 40 - aui.d(aui.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return aui.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return aui.i($$0, (float)this.cw, (float)this.cu) / 10.0F;
   }

   private void a(bll $$0) {
      if ((float)$$0.b() < 4500.0F) {
         aup $$1 = this.eg();
         dja $$2 = this.bk();
         if ($$2.l() != dco.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dr() + (double)aui.b($$1, -0.7F, 0.7F);
               double $$5 = this.dt();
               double $$6 = this.dx() + (double)aui.b($$1, -0.7F, 0.7F);
               this.dM().a(new jp(jx.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(agj<?> $$0) {
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
   public boolean a(cta $$0) {
      return this.gi();
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return ceg.a(this, $$0);
   }

   @Override
   public bnf<cef> dO() {
      return (bnf<cef>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   public void a(BiConsumer<dnh<?>, amz> $$0) {
      if (this.dM() instanceof amz $$1) {
         $$0.accept(this.cx, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable blp $$0) {
      if ($$0 instanceof bmf $$1
         && this.dM() == $$0.dM()
         && bls.e.test($$0)
         && !this.s($$0)
         && $$1.ai() != blt.d
         && $$1.ai() != blt.bj
         && !$$1.cr()
         && !$$1.ew()
         && this.dM().D_().a($$1.cH())) {
         return true;
      }

      return false;
   }

   public static void a(amz $$0, elm $$1, @Nullable blp $$2, int $$3) {
      blc $$4 = new blc(ble.G, 260, 0, false, false);
      bld.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      cee.a(this::a).encodeStart(sz.a, this.cA).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dnt.a.a.encodeStart(sz.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cee.a(this::a).parse(new Dynamic(sz.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cA = $$0x);
         this.gl();
      }

      if ($$0.b("listener", 10)) {
         dnt.a.a.parse(new Dynamic(sz.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
      }
   }

   private void gn() {
      if (!this.c(bmr.l)) {
         this.a(this.A().c(), 10.0F, this.eX());
      }
   }

   public ced A() {
      return ced.a(this.go());
   }

   private int go() {
      return this.cA.b(this.q());
   }

   public void b(blp $$0) {
      this.cA.a($$0);
   }

   public void c(@Nullable blp $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable blp $$0, int $$1, boolean $$2) {
      if (!this.fU() && this.a($$0)) {
         ceg.a((bmf)this);
         boolean $$3 = !(this.dO().c(bvh.o).orElse(null) instanceof cfb);
         int $$4 = this.cA.a($$0, $$1);
         if ($$0 instanceof cfb && $$3 && ced.a($$4).d()) {
            this.dO().b(bvh.o);
         }

         if ($$2) {
            this.gn();
         }
      }
   }

   public Optional<bmf> ge() {
      return this.A().d() ? this.cA.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bmf q() {
      return this.dO().c(bvh.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      this.dO().a(bvh.aD, avm.a, 1200L);
      if ($$2 == bmj.k) {
         this.b(bmr.n);
         this.dO().a(bvh.aB, avm.a, (long)ceg.a);
         this.a(arm.Av, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dM().B && !this.fU() && !this.gi()) {
         blp $$3 = $$0.d();
         this.a($$3, ced.c.a() + 20, false);
         if (this.bz.c(bvh.o).isEmpty() && $$3 instanceof bmf $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(bmf $$0) {
      this.dO().b(bvh.ax);
      this.dO().a(bvh.o, $$0);
      this.dO().b(bvh.E);
      brw.a(this, 200);
   }

   @Override
   public blq a(bmr $$0) {
      blq $$1 = super.a($$0);
      return this.gi() ? blq.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bu() {
      return !this.gi() && super.bu();
   }

   @Override
   protected void D(blp $$0) {
      if (!this.fU() && !this.dO().a(bvh.aG)) {
         this.dO().a(bvh.aG, avm.a, 20L);
         this.c($$0);
         ceg.a(this, $$0.dm());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cee gf() {
      return this.cA;
   }

   @Override
   protected bvp b(cti $$0) {
      return new bvo(this, $$0) {
         @Override
         protected efb a(int $$0) {
            this.o = new efe();
            this.o.a(true);
            return new efb(this.o, $$0) {
               @Override
               protected float a(eex $$0, eex $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public dnt.a gg() {
      return this.cz;
   }

   @Override
   public dnt.d gh() {
      return this.cy;
   }

   class a implements dnt.d {
      private static final int b = 16;
      private final dno c = new dni(cef.this, cef.this.cI());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dno b() {
         return this.c;
      }

      @Override
      public asq<dnk> c() {
         return ash.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(amz $$0, hx $$1, dnk $$2, dnk.a $$3) {
         if (!cef.this.fU() && !cef.this.ew() && !cef.this.dO().a(bvh.aH) && !cef.this.gi() && $$0.D_().a($$1)) {
            if ($$3.a() instanceof bmf $$4 && !cef.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(amz $$0, hx $$1, dnk $$2, @Nullable blp $$3, @Nullable blp $$4, float $$5) {
         if (!cef.this.ew()) {
            cef.this.bz.a(bvh.aH, avm.a, 40L);
            $$0.a(cef.this, (byte)61);
            cef.this.a(arm.AO, 5.0F, cef.this.eX());
            hx $$6 = $$1;
            if ($$4 != null) {
               if (cef.this.a($$4, 30.0)) {
                  if (cef.this.dO().a(bvh.az)) {
                     if (cef.this.a($$4)) {
                        $$6 = $$4.dm();
                     }

                     cef.this.c($$4);
                  } else {
                     cef.this.a($$4, 10, true);
                  }
               }

               cef.this.dO().a(bvh.az, avm.a, 100L);
            } else {
               cef.this.c($$3);
            }

            if (!cef.this.A().d()) {
               Optional<bmf> $$7 = cef.this.cA.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  ceg.a(cef.this, $$6);
               }
            }
         }
      }
   }
}
