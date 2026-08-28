import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class cbd extends bzn<clr> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<clr, bue> e;
   private final cil f;
   private final float g;
   private final ToDoubleFunction<clr> h;
   private ffs i;
   private final Function<clr, awq> j;
   private final Function<clr, awq> k;

   public cbd(Function<clr, bue> $$0, cil $$1, float $$2, ToDoubleFunction<clr> $$3, Function<clr, awq> $$4, Function<clr, awq> $$5) {
      super(ImmutableMap.of(cgy.W, cgz.b, cgy.X, cgz.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = ffs.c;
   }

   protected boolean a(aru $$0, clr $$1) {
      return $$1.ec().a(cgy.X);
   }

   protected boolean a(aru $$0, clr $$1, long $$2) {
      return $$1.ec().a(cgy.X);
   }

   protected void b(aru $$0, clr $$1, long $$2) {
      iw $$3 = $$1.dv();
      byw<?> $$4 = $$1.ec();
      ffs $$5 = $$4.c(cgy.X).get();
      this.i = new ffs((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cgy.n, new chb($$5, this.g, 0));
   }

   protected void c(aru $$0, clr $$1, long $$2) {
      List<bxw> $$3 = $$0.a(bxw.class, this.f, $$1, $$1.cR());
      byw<?> $$4 = $$1.ec();
      if (!$$3.isEmpty()) {
         bxw $$5 = $$3.get(0);
         bvk $$6 = $$0.al().c((bxw)$$1);
         float $$7 = (float)$$1.h(bzc.c);
         if ($$5.a($$0, $$6, $$7)) {
            dgp.a($$0, (bwv)$$5, $$6);
         }

         int $$8 = $$1.b(bwb.a) ? $$1.c(bwb.a).e() + 1 : 0;
         int $$9 = $$1.b(bwb.b) ? $$1.c(bwb.b).e() + 1 : 0;
         float $$10 = 0.25F * (float)($$8 - $$9);
         float $$11 = azq.a($$1.fo() * 1.65F, 0.2F, 3.0F) + $$10;
         bvk $$12 = $$0.al().b((bxw)$$1);
         float $$13 = $$5.b($$0, $$12, $$7);
         float $$14 = $$13 > 0.0F ? 0.5F : 1.0F;
         $$5.p((double)($$14 * $$11) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aws.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aws.g, 1.0F, 1.0F);
         boolean $$15 = $$1.gw();
         if ($$15) {
            $$0.a(null, $$1, this.k.apply($$1), aws.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<chb> $$16 = $$4.c(cgy.n);
         Optional<ffs> $$17 = $$4.c(cgy.X);
         boolean $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a($$17.get(), 0.25);
         if ($$18) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aru $$0, clr $$1) {
      ffs $$2 = $$1.dy().d(1.0, 0.0, 1.0).d();
      iw $$3 = iw.a((jq)$$1.dt().e($$2));
      return $$0.a_($$3).a(axg.cs) || $$0.a_($$3.d()).a(axg.cs);
   }

   protected void b(aru $$0, clr $$1) {
      $$0.a($$1, (byte)59);
      $$1.ec().a(cgy.W, this.e.apply($$1).a($$0.A));
      $$1.ec().b(cgy.X);
   }
}
