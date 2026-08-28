import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bzh extends bxr<cjs> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cjs, bsj> e;
   private final cgp f;
   private final float g;
   private final ToDoubleFunction<cjs> h;
   private fbx i;
   private final Function<cjs, avz> j;
   private final Function<cjs, avz> k;

   public bzh(Function<cjs, bsj> $$0, cgp $$1, float $$2, ToDoubleFunction<cjs> $$3, Function<cjs, avz> $$4, Function<cjs, avz> $$5) {
      super(ImmutableMap.of(cfc.V, cfd.b, cfc.W, cfd.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fbx.c;
   }

   protected boolean a(ard $$0, cjs $$1) {
      return $$1.ea().a(cfc.W);
   }

   protected boolean a(ard $$0, cjs $$1, long $$2) {
      return $$1.ea().a(cfc.W);
   }

   protected void b(ard $$0, cjs $$1, long $$2) {
      ji $$3 = $$1.du();
      bxa<?> $$4 = $$1.ea();
      fbx $$5 = $$4.c(cfc.W).get();
      this.i = new fbx((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cfc.m, new cff($$5, this.g, 0));
   }

   protected void c(ard $$0, cjs $$1, long $$2) {
      List<bvy> $$3 = $$0.a(bvy.class, this.f, $$1, $$1.cQ());
      bxa<?> $$4 = $$1.ea();
      if (!$$3.isEmpty()) {
         bvy $$5 = $$3.get(0);
         btp $$6 = $$0.al().c((bvy)$$1);
         if ($$5.a($$0, $$6, (float)$$1.h(bxg.c))) {
            ddt.a($$0, (bva)$$5, $$6);
         }

         int $$7 = $$1.b(bug.a) ? $$1.c(bug.a).e() + 1 : 0;
         int $$8 = $$1.b(bug.b) ? $$1.c(bug.b).e() + 1 : 0;
         float $$9 = 0.25F * (float)($$7 - $$8);
         float $$10 = ayz.a($$1.fq() * 1.65F, 0.2F, 3.0F) + $$9;
         float $$11 = $$5.i($$0.al().b((bvy)$$1)) ? 0.5F : 1.0F;
         $$5.p((double)($$11 * $$10) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
         boolean $$12 = $$1.gu();
         if ($$12) {
            $$0.a(null, $$1, this.k.apply($$1), awb.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cff> $$13 = $$4.c(cfc.m);
         Optional<fbx> $$14 = $$4.c(cfc.W);
         boolean $$15 = $$13.isEmpty() || $$14.isEmpty() || $$13.get().a().a().a($$14.get(), 0.25);
         if ($$15) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ard $$0, cjs $$1) {
      fbx $$2 = $$1.dx().d(1.0, 0.0, 1.0).d();
      ji $$3 = ji.a((kb)$$1.ds().e($$2));
      return $$0.a_($$3).a(awp.cq) || $$0.a_($$3.d()).a(awp.cq);
   }

   protected void b(ard $$0, cjs $$1) {
      $$0.a($$1, (byte)59);
      $$1.ea().a(cfc.V, this.e.apply($$1).a($$0.A));
      $$1.ea().b(cfc.W);
   }
}
