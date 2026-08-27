import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bps extends boc<bzt> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bzt, bjm> e;
   private final bwz f;
   private final float g;
   private final ToDoubleFunction<bzt> h;
   private elt i;
   private final Function<bzt, arr> j;
   private final Function<bzt, arr> k;

   public bps(Function<bzt, bjm> $$0, bwz $$1, float $$2, ToDoubleFunction<bzt> $$3, Function<bzt, arr> $$4, Function<bzt, arr> $$5) {
      super(ImmutableMap.of(bvn.U, bvo.b, bvn.V, bvo.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = elt.b;
   }

   protected boolean a(and $$0, bzt $$1) {
      return $$1.dO().a(bvn.V);
   }

   protected boolean a(and $$0, bzt $$1, long $$2) {
      return $$1.dO().a(bvn.V);
   }

   protected void b(and $$0, bzt $$1, long $$2) {
      hx $$3 = $$1.dm();
      bnl<?> $$4 = $$1.dO();
      elt $$5 = $$4.c(bvn.V).get();
      this.i = new elt((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bvn.m, new bvq($$5, this.g, 0));
   }

   protected void c(and $$0, bzt $$1, long $$2) {
      List<bml> $$3 = $$0.a(bml.class, this.f, $$1, $$1.cH());
      bnl<?> $$4 = $$1.dO();
      if (!$$3.isEmpty()) {
         bml $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bml)$$1), (float)$$1.b(bnr.c));
         int $$6 = $$1.a(blk.a) ? $$1.b(blk.a).e() + 1 : 0;
         int $$7 = $$1.a(blk.b) ? $$1.b(blk.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = auo.a($$1.ff() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bml)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), art.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), art.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gl();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), art.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bvq> $$12 = $$4.c(bvn.m);
         Optional<elt> $$13 = $$4.c(bvn.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(and $$0, bzt $$1) {
      elt $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      hx $$3 = hx.a($$1.dk().e($$2));
      return $$0.a_($$3).a(ash.ce) || $$0.a_($$3.c()).a(ash.ce);
   }

   protected void b(and $$0, bzt $$1) {
      $$0.a($$1, (byte)59);
      $$1.dO().a(bvn.U, this.e.apply($$1).a($$0.z));
      $$1.dO().b(bvn.V);
   }
}
