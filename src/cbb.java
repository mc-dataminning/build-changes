import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class cbb extends bzl<clp> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<clp, buc> e;
   private final cij f;
   private final float g;
   private final ToDoubleFunction<clp> h;
   private ffq i;
   private final Function<clp, awo> j;
   private final Function<clp, awo> k;

   public cbb(Function<clp, buc> $$0, cij $$1, float $$2, ToDoubleFunction<clp> $$3, Function<clp, awo> $$4, Function<clp, awo> $$5) {
      super(ImmutableMap.of(cgw.W, cgx.b, cgw.X, cgx.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ffq.c;
   }

   protected boolean a(ars $$0, clp $$1) {
      return $$1.ec().a(cgw.X);
   }

   protected boolean a(ars $$0, clp $$1, long $$2) {
      return $$1.ec().a(cgw.X);
   }

   protected void b(ars $$0, clp $$1, long $$2) {
      iv $$3 = $$1.dv();
      byu<?> $$4 = $$1.ec();
      ffq $$5 = $$4.c(cgw.X).get();
      this.i = new ffq((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cgw.n, new cgz($$5, this.g, 0));
   }

   protected void c(ars $$0, clp $$1, long $$2) {
      List<bxu> $$3 = $$0.a(bxu.class, this.f, $$1, $$1.cR());
      byu<?> $$4 = $$1.ec();
      if (!$$3.isEmpty()) {
         bxu $$5 = $$3.get(0);
         bvi $$6 = $$0.al().c((bxu)$$1);
         float $$7 = (float)$$1.h(bza.c);
         if ($$5.a($$0, $$6, $$7)) {
            dgn.a($$0, (bwt)$$5, $$6);
         }

         int $$8 = $$1.b(bvz.a) ? $$1.c(bvz.a).e() + 1 : 0;
         int $$9 = $$1.b(bvz.b) ? $$1.c(bvz.b).e() + 1 : 0;
         float $$10 = 0.25F * (float)($$8 - $$9);
         float $$11 = azo.a($$1.fo() * 1.65F, 0.2F, 3.0F) + $$10;
         bvi $$12 = $$0.al().b((bxu)$$1);
         float $$13 = $$5.b($$0, $$12, $$7);
         float $$14 = $$13 > 0.0F ? 0.5F : 1.0F;
         $$5.p((double)($$14 * $$11) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awq.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awq.g, 1.0F, 1.0F);
         boolean $$15 = $$1.gw();
         if ($$15) {
            $$0.a(null, $$1, this.k.apply($$1), awq.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cgz> $$16 = $$4.c(cgw.n);
         Optional<ffq> $$17 = $$4.c(cgw.X);
         boolean $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a($$17.get(), 0.25);
         if ($$18) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(ars $$0, clp $$1) {
      ffq $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      iv $$3 = iv.a((jp)$$1.dt().e($$2));
      return $$0.a_($$3).a(axe.cs) || $$0.a_($$3.d()).a(axe.cs);
   }

   protected void b(ars $$0, clp $$1) {
      $$0.a($$1, (byte)59);
      $$1.ec().a(cgw.W, this.e.apply($$1).a($$0.A));
      $$1.ec().b(cgw.X);
   }
}
