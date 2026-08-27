import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class chr extends cgz implements cgr, cif {
   private static final aiy<Boolean> d = ajc.a(chr.class, aja.k);
   private static final int e = 40;
   private static final int bX = 1;
   private static final float bY = 0.6F;
   private static final int bZ = 6;
   private static final float ca = 0.5F;
   private static final int cb = 40;
   private static final int cc = 15;
   private static final int cd = 200;
   private static final float ce = 0.3F;
   private static final float cf = 0.4F;
   private int cg;
   protected static final ImmutableList<? extends cay<? extends cax<? super chr>>> b = ImmutableList.of(cay.c, cay.d);
   protected static final ImmutableList<? extends bzr<?>> c = ImmutableList.of(bzr.g, bzr.h, bzr.k, bzr.l, bzr.n, bzr.m, bzr.E, bzr.t, bzr.o, bzr.p);

   public chr(bqb<? extends chr> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   protected brp.b<chr> dQ() {
      return brp.a(c, b);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      brp<chr> $$1 = this.dQ().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cli.a));
      $$1.b(cli.b);
      $$1.f();
      return $$1;
   }

   private static void a(brp<chr> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new btm(45, 90), new btq()));
   }

   private static void b(brp<chr> $$0) {
      $$0.a(
         cli.b,
         10,
         ImmutableList.of(
            bus.a(chr::gp),
            bug.a(8.0F, bnl.a(30, 60)),
            new bud(ImmutableList.of(Pair.of(bty.a(0.4F), 2), Pair.of(bun.a(0.4F, 3), 2), Pair.of(new bsq(30, 60), 1)))
         )
      );
   }

   private static void c(brp<chr> $$0) {
      $$0.a(cli.k, 10, ImmutableList.of(bul.a(1.0F), bvt.a(chr::u, btn.a(40)), bvt.a(chr::p_, btn.a(15)), buv.a()), bzr.o);
   }

   private Optional<? extends bqo> gp() {
      return this.dP().c(bzr.h).orElse(bzt.a()).a(this::j);
   }

   private boolean j(bqo $$0) {
      bqb<?> $$1 = $$0.ai();
      return $$1 != bqb.bs && $$1 != bqb.x && cax.c(this, $$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(aiy<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.j_();
      }
   }

   public static bru.a r() {
      return cgz.gt().a(brv.q, 40.0).a(brv.r, 0.3F).a(brv.n, 0.6F).a(brv.d, 1.0).a(brv.c, 6.0);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   public boolean C(bpv $$0) {
      if (!($$0 instanceof bqo)) {
         return false;
      } else {
         this.cg = 10;
         this.dM().a(this, (byte)4);
         this.b(aum.CS);
         return cif.a(this, (bqo)$$0);
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return !this.gb();
   }

   @Override
   protected void e(bqo $$0) {
      if (!this.p_()) {
         cif.b(this, $$0);
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof bqo) {
         bqo $$3 = (bqo)$$0.d();
         if (this.c($$3) && !bsi.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bqo $$0) {
      this.bC.b(bzr.E);
      this.bC.a(bzr.o, $$0, 200L);
   }

   @Override
   public brp<chr> dP() {
      return (brp<chr>)super.dP();
   }

   protected void y() {
      cli $$0 = this.bC.g().orElse(null);
      this.bC.a(ImmutableList.of(cli.k, cli.b));
      cli $$1 = this.bC.g().orElse(null);
      if ($$1 == cli.k && $$0 != cli.k) {
         this.go();
      }

      this.v(this.bC.a(bzr.o));
   }

   @Override
   protected void Y() {
      this.dM().af().a("zoglinBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      this.y();
   }

   @Override
   public void a(boolean $$0) {
      this.an().a(d, $$0);
      if (!this.dM().B && $$0) {
         this.f(brv.c).a(0.5);
      }
   }

   @Override
   public boolean p_() {
      return this.an().a(d);
   }

   @Override
   public void n_() {
      if (this.cg > 0) {
         this.cg--;
      }

      super.n_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cg = 10;
         this.b(aum.CS);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cg;
   }

   @Override
   protected aul v() {
      if (this.dM().B) {
         return null;
      } else {
         return this.bC.a(bzr.o) ? aum.CR : aum.CQ;
      }
   }

   @Override
   protected aul d(bot $$0) {
      return aum.CU;
   }

   @Override
   protected aul o_() {
      return aum.CT;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.CV, 0.15F, 1.0F);
   }

   protected void go() {
      this.b(aum.CR);
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.p_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
