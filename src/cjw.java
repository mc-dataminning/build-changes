import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cjw extends cje implements ciw, ckk {
   private static final ajs<Boolean> d = ajw.a(cjw.class, aju.k);
   private static final int e = 40;
   private static final int bY = 1;
   private static final float bZ = 0.6F;
   private static final int ca = 6;
   private static final float cb = 0.5F;
   private static final int cc = 40;
   private static final int cd = 15;
   private static final int ce = 200;
   private static final float cf = 0.3F;
   private static final float cg = 0.4F;
   private int ch;
   protected static final ImmutableList<? extends cdb<? extends cda<? super cjw>>> b = ImmutableList.of(cdb.c, cdb.d);
   protected static final ImmutableList<? extends cbu<?>> c = ImmutableList.of(cbu.g, cbu.h, cbu.k, cbu.l, cbu.n, cbu.m, cbu.E, cbu.t, cbu.o, cbu.p);

   public cjw(bsc<? extends cjw> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bts.b<cjw> dT() {
      return bts.a(c, b);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      bts<cjw> $$1 = this.dT().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cnn.a));
      $$1.b(cnn.b);
      $$1.f();
      return $$1;
   }

   private static void a(bts<cjw> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bvp(45, 90), new bvt()));
   }

   private static void b(bts<cjw> $$0) {
      $$0.a(
         cnn.b,
         10,
         ImmutableList.of(
            bwv.a(cjw::gr),
            bwj.a(8.0F, bph.a(30, 60)),
            new bwg(ImmutableList.of(Pair.of(bwb.a(0.4F), 2), Pair.of(bwq.a(0.4F, 3), 2), Pair.of(new but(30, 60), 1)))
         )
      );
   }

   private static void c(bts<cjw> $$0) {
      $$0.a(cnn.k, 10, ImmutableList.of(bwo.a(1.0F), bxw.a(cjw::u, bvq.a(40)), bxw.a(cjw::p_, bvq.a(15)), bwy.a()), cbu.o);
   }

   private Optional<? extends bsq> gr() {
      return this.dS().c(cbu.h).orElse(cbw.a()).a(this::j);
   }

   private boolean j(bsq $$0) {
      bsc<?> $$1 = $$0.ak();
      return $$1 != bsc.bt && $$1 != bsc.x && cda.c(this, $$0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajs<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static btx.a s() {
      return cje.gv().a(bty.q, 40.0).a(bty.r, 0.3F).a(bty.n, 0.6F).a(bty.d, 1.0).a(bty.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(brw $$0) {
      if (!($$0 instanceof bsq)) {
         return false;
      } else {
         this.ch = 10;
         this.dP().a(this, (byte)4);
         this.b(avi.Dl);
         return ckk.a(this, (bsq)$$0);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gc();
   }

   @Override
   protected void e(bsq $$0) {
      if (!this.p_()) {
         ckk.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bsq) {
         bsq $$3 = (bsq)$$0.d();
         if (this.c($$3) && !bul.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bsq $$0) {
      this.bD.b(cbu.E);
      this.bD.a(cbu.o, $$0, 200L);
   }

   @Override
   public bts<cjw> dS() {
      return (bts<cjw>)super.dS();
   }

   protected void y() {
      cnn $$0 = this.bD.g().orElse(null);
      this.bD.a(ImmutableList.of(cnn.k, cnn.b));
      cnn $$1 = this.bD.g().orElse(null);
      if ($$1 == cnn.k && $$0 != cnn.k) {
         this.gq();
      }

      this.v(this.bD.a(cbu.o));
   }

   @Override
   protected void Y() {
      this.dP().af().a("zoglinBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (!this.dP().B && $$0) {
         this.f(bty.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.ap().a(d);
   }

   @Override
   public void n_() {
      if (this.ch > 0) {
         this.ch--;
      }

      super.n_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.b(avi.Dl);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
      return this.ch;
   }

   @Override
   protected avh v() {
      if (this.dP().B) {
         return null;
      } else {
         return this.bD.a(cbu.o) ? avi.Dk : avi.Dj;
      }
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.Dn;
   }

   @Override
   protected avh o_() {
      return avi.Dm;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.Do, 0.15F, 1.0F);
   }

   protected void gq() {
      this.b(avi.Dk);
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
