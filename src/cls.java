import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cls extends cla implements cmg {
   private static final akg<Boolean> e = akk.a(cls.class, aki.k);
   private static final int bY = 40;
   private static final int bZ = 1;
   private static final float ca = 0.6F;
   private static final int cb = 6;
   private static final float cc = 0.5F;
   private static final int cd = 40;
   private static final int ce = 15;
   private static final int cf = 200;
   private static final float cg = 0.3F;
   private static final float ch = 0.4F;
   private int ci;
   protected static final ImmutableList<? extends ceu<? extends cet<? super cls>>> b = ImmutableList.of(ceu.c, ceu.d);
   protected static final ImmutableList<? extends cdn<?>> c = ImmutableList.of(cdn.g, cdn.h, cdn.k, cdn.l, cdn.n, cdn.m, cdn.E, cdn.t, cdn.o, cdn.p);

   public cls(btv<? extends cls> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bvl.b<cls> dY() {
      return bvl.a(c, b);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      bvl<cls> $$1 = this.dY().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cpm.a));
      $$1.b(cpm.b);
      $$1.f();
      return $$1;
   }

   private static void a(bvl<cls> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new bxi(45, 90), new bxm()));
   }

   private static void b(bvl<cls> $$0) {
      $$0.a(
         cpm.b,
         10,
         ImmutableList.of(
            byo.a(cls::gr),
            byc.a(8.0F, bra.a(30, 60)),
            new bxz(ImmutableList.of(Pair.of(bxu.a(0.4F), 2), Pair.of(byj.a(0.4F, 3), 2), Pair.of(new bwm(30, 60), 1)))
         )
      );
   }

   private static void c(bvl<cls> $$0) {
      $$0.a(cpm.k, 10, ImmutableList.of(byh.a(1.0F), bzp.a(cls::t, bxj.a(40)), bzp.a(cls::o_, bxj.a(15)), byr.a()), cdn.o);
   }

   private Optional<? extends buk> gr() {
      return this.dX().c(cdn.h).orElse(cdp.a()).a(this::j);
   }

   private boolean j(buk $$0) {
      btv<?> $$1 = $$0.ao();
      return $$1 != btv.bt && $$1 != btv.x && cet.c(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.i_();
      }
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$0.C_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 40.0).a(bvr.v, 0.3F).a(bvr.p, 0.6F).a(bvr.d, 1.0).a(bvr.c, 6.0);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   public boolean E(bto $$0) {
      if (!($$0 instanceof buk)) {
         return false;
      } else {
         this.ci = 10;
         this.dS().a(this, (byte)4);
         this.b(awe.Dv);
         return cmg.a(this, (buk)$$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void e(buk $$0) {
      if (!this.o_()) {
         cmg.b(this, $$0);
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof buk) {
         buk $$3 = (buk)$$0.d();
         if (this.c($$3) && !bwe.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(buk $$0) {
      this.bB.b(cdn.E);
      this.bB.a(cdn.o, $$0, 200L);
   }

   @Override
   public bvl<cls> dX() {
      return (bvl<cls>)super.dX();
   }

   protected void y() {
      cpm $$0 = this.bB.g().orElse(null);
      this.bB.a(ImmutableList.of(cpm.k, cpm.b));
      cpm $$1 = this.bB.g().orElse(null);
      if ($$1 == cpm.k && $$0 != cpm.k) {
         this.gq();
      }

      this.w(this.bB.a(cdn.o));
   }

   @Override
   protected void ad() {
      this.dS().ah().a("zoglinBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.at().a(e, $$0);
      if (!this.dS().B && $$0) {
         this.g(bvr.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.at().a(e);
   }

   @Override
   public void m_() {
      if (this.ci > 0) {
         this.ci--;
      }

      super.m_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ci = 10;
         this.b(awe.Dv);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
      return this.ci;
   }

   @Override
   protected awd w() {
      if (this.dS().B) {
         return null;
      } else {
         return this.bB.a(cdn.o) ? awe.Du : awe.Dt;
      }
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.Dx;
   }

   @Override
   protected awd n_() {
      return awe.Dw;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.Dy, 0.15F, 1.0F);
   }

   protected void gq() {
      this.b(awe.Du);
   }

   @Nullable
   @Override
   public buk m() {
      return this.R();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
