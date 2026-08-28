import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class cbm extends bzw<cma> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cma, bun> e;
   private final ciu f;
   private final float g;
   private final ToDoubleFunction<cma> h;
   private fgc i;
   private final Function<cma, awx> j;
   private final Function<cma, awx> k;

   public cbm(Function<cma, bun> $$0, ciu $$1, float $$2, ToDoubleFunction<cma> $$3, Function<cma, awx> $$4, Function<cma, awx> $$5) {
      super(ImmutableMap.of(chh.W, chi.b, chh.X, chi.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fgc.c;
   }

   protected boolean a(asb $$0, cma $$1) {
      return $$1.ec().a(chh.X);
   }

   protected boolean a(asb $$0, cma $$1, long $$2) {
      return $$1.ec().a(chh.X);
   }

   protected void b(asb $$0, cma $$1, long $$2) {
      iw $$3 = $$1.dv();
      bzf<?> $$4 = $$1.ec();
      fgc $$5 = $$4.c(chh.X).get();
      this.i = new fgc((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(chh.n, new chk($$5, this.g, 0));
   }

   protected void c(asb $$0, cma $$1, long $$2) {
      List<byf> $$3 = $$0.a(byf.class, this.f, $$1, $$1.cR());
      bzf<?> $$4 = $$1.ec();
      if (!$$3.isEmpty()) {
         byf $$5 = $$3.get(0);
         bvt $$6 = $$0.al().c((byf)$$1);
         float $$7 = (float)$$1.h(bzl.c);
         if ($$5.a($$0, $$6, $$7)) {
            dgz.a($$0, (bxe)$$5, $$6);
         }

         int $$8 = $$1.b(bwk.a) ? $$1.c(bwk.a).e() + 1 : 0;
         int $$9 = $$1.b(bwk.b) ? $$1.c(bwk.b).e() + 1 : 0;
         float $$10 = 0.25F * (float)($$8 - $$9);
         float $$11 = azz.a($$1.fo() * 1.65F, 0.2F, 3.0F) + $$10;
         bvt $$12 = $$0.al().b((byf)$$1);
         float $$13 = $$5.b($$0, $$12, $$7);
         float $$14 = $$13 > 0.0F ? 0.5F : 1.0F;
         $$5.p((double)($$14 * $$11) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awz.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awz.g, 1.0F, 1.0F);
         boolean $$15 = $$1.gw();
         if ($$15) {
            $$0.a(null, $$1, this.k.apply($$1), awz.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<chk> $$16 = $$4.c(chh.n);
         Optional<fgc> $$17 = $$4.c(chh.X);
         boolean $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a($$17.get(), 0.25);
         if ($$18) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(asb $$0, cma $$1) {
      fgc $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      iw $$3 = iw.a((jq)$$1.dt().e($$2));
      return $$0.a_($$3).a(axn.cs) || $$0.a_($$3.d()).a(axn.cs);
   }

   protected void b(asb $$0, cma $$1) {
      $$0.a($$1, (byte)59);
      $$1.ec().a(chh.W, this.e.apply($$1).a($$0.A));
      $$1.ec().b(chh.X);
   }
}
