import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cij extends chr implements chj, cix {
   private static final ajk<Boolean> d = ajo.a(cij.class, ajm.k);
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
   protected static final ImmutableList<? extends cbo<? extends cbn<? super cij>>> b = ImmutableList.of(cbo.c, cbo.d);
   protected static final ImmutableList<? extends cah<?>> c = ImmutableList.of(cah.g, cah.h, cah.k, cah.l, cah.n, cah.m, cah.E, cah.t, cah.o, cah.p);

   public cij(bqr<? extends cij> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   protected bsf.b<cij> dR() {
      return bsf.a(c, b);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      bsf<cij> $$1 = this.dR().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cma.a));
      $$1.b(cma.b);
      $$1.f();
      return $$1;
   }

   private static void a(bsf<cij> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new buc(45, 90), new bug()));
   }

   private static void b(bsf<cij> $$0) {
      $$0.a(
         cma.b,
         10,
         ImmutableList.of(
            bvi.a(cij::gr),
            buw.a(8.0F, bob.a(30, 60)),
            new but(ImmutableList.of(Pair.of(buo.a(0.4F), 2), Pair.of(bvd.a(0.4F, 3), 2), Pair.of(new btg(30, 60), 1)))
         )
      );
   }

   private static void c(bsf<cij> $$0) {
      $$0.a(cma.k, 10, ImmutableList.of(bvb.a(1.0F), bwj.a(cij::u, bud.a(40)), bwj.a(cij::p_, bud.a(15)), bvl.a()), cah.o);
   }

   private Optional<? extends bre> gr() {
      return this.dQ().c(cah.h).orElse(caj.a()).a(this::j);
   }

   private boolean j(bre $$0) {
      bqr<?> $$1 = $$0.ai();
      return $$1 != bqr.bs && $$1 != bqr.x && cbn.c(this, $$0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajk<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static bsk.a r() {
      return chr.gv().a(bsl.q, 40.0).a(bsl.r, 0.3F).a(bsl.n, 0.6F).a(bsl.d, 1.0).a(bsl.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bql $$0) {
      if (!($$0 instanceof bre)) {
         return false;
      } else {
         this.ch = 10;
         this.dN().a(this, (byte)4);
         this.b(auz.CZ);
         return cix.a(this, (bre)$$0);
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return !this.gc();
   }

   @Override
   protected void e(bre $$0) {
      if (!this.p_()) {
         cix.b(this, $$0);
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bre) {
         bre $$3 = (bre)$$0.d();
         if (this.c($$3) && !bsy.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bre $$0) {
      this.bE.b(cah.E);
      this.bE.a(cah.o, $$0, 200L);
   }

   @Override
   public bsf<cij> dQ() {
      return (bsf<cij>)super.dQ();
   }

   protected void y() {
      cma $$0 = this.bE.g().orElse(null);
      this.bE.a(ImmutableList.of(cma.k, cma.b));
      cma $$1 = this.bE.g().orElse(null);
      if ($$1 == cma.k && $$0 != cma.k) {
         this.gq();
      }

      this.v(this.bE.a(cah.o));
   }

   @Override
   protected void Y() {
      this.dN().af().a("zoglinBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (!this.dN().B && $$0) {
         this.f(bsl.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.an().a(d);
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
         this.b(auz.CZ);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gp() {
      return this.ch;
   }

   @Override
   protected auy v() {
      if (this.dN().B) {
         return null;
      } else {
         return this.bE.a(cah.o) ? auz.CY : auz.CX;
      }
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Db;
   }

   @Override
   protected auy o_() {
      return auz.Da;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.Dc, 0.15F, 1.0F);
   }

   protected void gq() {
      this.b(auz.CY);
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
