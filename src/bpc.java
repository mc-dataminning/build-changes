import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bpc extends bnm<bzd> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bzd, biw> e;
   private final bwj f;
   private final float g;
   private final ToDoubleFunction<bzd> h;
   private elb i;
   private final Function<bzd, arb> j;
   private final Function<bzd, arb> k;

   public bpc(Function<bzd, biw> $$0, bwj $$1, float $$2, ToDoubleFunction<bzd> $$3, Function<bzd, arb> $$4, Function<bzd, arb> $$5) {
      super(ImmutableMap.of(bux.U, buy.b, bux.V, buy.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = elb.b;
   }

   protected boolean a(amp $$0, bzd $$1) {
      return $$1.dO().a(bux.V);
   }

   protected boolean a(amp $$0, bzd $$1, long $$2) {
      return $$1.dO().a(bux.V);
   }

   protected void b(amp $$0, bzd $$1, long $$2) {
      hv $$3 = $$1.dm();
      bmv<?> $$4 = $$1.dO();
      elb $$5 = $$4.c(bux.V).get();
      this.i = new elb((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bux.m, new bva($$5, this.g, 0));
   }

   protected void c(amp $$0, bzd $$1, long $$2) {
      List<blv> $$3 = $$0.a(blv.class, this.f, $$1, $$1.cH());
      bmv<?> $$4 = $$1.dO();
      if (!$$3.isEmpty()) {
         blv $$5 = $$3.get(0);
         $$5.a($$0.ah().c((blv)$$1), (float)$$1.b(bnb.c));
         int $$6 = $$1.a(bku.a) ? $$1.b(bku.a).e() + 1 : 0;
         int $$7 = $$1.a(bku.b) ? $$1.b(bku.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = aty.a($$1.ff() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ah().b((blv)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), ard.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), ard.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gl();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), ard.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bva> $$12 = $$4.c(bux.m);
         Optional<elb> $$13 = $$4.c(bux.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(amp $$0, bzd $$1) {
      elb $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      hv $$3 = hv.a($$1.dk().e($$2));
      return $$0.a_($$3).a(arr.ce) || $$0.a_($$3.c()).a(arr.ce);
   }

   protected void b(amp $$0, bzd $$1) {
      $$0.a($$1, (byte)59);
      $$1.dO().a(bux.U, this.e.apply($$1).a($$0.z));
      $$1.dO().b(bux.V);
   }
}
