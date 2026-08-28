import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class cal extends byv<cld> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cld, bto> e;
   private final cht f;
   private final float g;
   private final ToDoubleFunction<cld> h;
   private feq i;
   private final Function<cld, awm> j;
   private final Function<cld, awm> k;

   public cal(Function<cld, bto> $$0, cht $$1, float $$2, ToDoubleFunction<cld> $$3, Function<cld, awm> $$4, Function<cld, awm> $$5) {
      super(ImmutableMap.of(cgg.W, cgh.b, cgg.X, cgh.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = feq.c;
   }

   protected boolean a(arq $$0, cld $$1) {
      return $$1.ec().a(cgg.X);
   }

   protected boolean a(arq $$0, cld $$1, long $$2) {
      return $$1.ec().a(cgg.X);
   }

   protected void b(arq $$0, cld $$1, long $$2) {
      iu $$3 = $$1.dv();
      bye<?> $$4 = $$1.ec();
      feq $$5 = $$4.c(cgg.X).get();
      this.i = new feq((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cgg.n, new cgj($$5, this.g, 0));
   }

   protected void c(arq $$0, cld $$1, long $$2) {
      List<bxe> $$3 = $$0.a(bxe.class, this.f, $$1, $$1.cR());
      bye<?> $$4 = $$1.ec();
      if (!$$3.isEmpty()) {
         bxe $$5 = $$3.get(0);
         buu $$6 = $$0.al().c((bxe)$$1);
         float $$7 = (float)$$1.h(byk.c);
         if ($$5.a($$0, $$6, $$7)) {
            dfs.a($$0, (bwf)$$5, $$6);
         }

         int $$8 = $$1.b(bvl.a) ? $$1.c(bvl.a).e() + 1 : 0;
         int $$9 = $$1.b(bvl.b) ? $$1.c(bvl.b).e() + 1 : 0;
         float $$10 = 0.25F * (float)($$8 - $$9);
         float $$11 = azm.a($$1.fo() * 1.65F, 0.2F, 3.0F) + $$10;
         buu $$12 = $$0.al().b((bxe)$$1);
         float $$13 = $$5.b($$0, $$12, $$7);
         float $$14 = $$13 > 0.0F ? 0.5F : 1.0F;
         $$5.p((double)($$14 * $$11) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, 1.0F);
         boolean $$15 = $$1.gt();
         if ($$15) {
            $$0.a(null, $$1, this.k.apply($$1), awo.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cgj> $$16 = $$4.c(cgg.n);
         Optional<feq> $$17 = $$4.c(cgg.X);
         boolean $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a($$17.get(), 0.25);
         if ($$18) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arq $$0, cld $$1) {
      feq $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      iu $$3 = iu.a((jo)$$1.dt().e($$2));
      return $$0.a_($$3).a(axc.cr) || $$0.a_($$3.d()).a(axc.cr);
   }

   protected void b(arq $$0, cld $$1) {
      $$0.a($$1, (byte)59);
      $$1.ec().a(cgg.W, this.e.apply($$1).a($$0.A));
      $$1.ec().b(cgg.X);
   }
}
