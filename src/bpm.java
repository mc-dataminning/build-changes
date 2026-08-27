import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bpm extends bnw<bzn> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<bzn, bjg> e;
   private final bwt f;
   private final float g;
   private final ToDoubleFunction<bzn> h;
   private elm i;
   private final Function<bzn, arl> j;
   private final Function<bzn, arl> k;

   public bpm(Function<bzn, bjg> $$0, bwt $$1, float $$2, ToDoubleFunction<bzn> $$3, Function<bzn, arl> $$4, Function<bzn, arl> $$5) {
      super(ImmutableMap.of(bvh.U, bvi.b, bvh.V, bvi.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = elm.b;
   }

   protected boolean a(amz $$0, bzn $$1) {
      return $$1.dO().a(bvh.V);
   }

   protected boolean a(amz $$0, bzn $$1, long $$2) {
      return $$1.dO().a(bvh.V);
   }

   protected void b(amz $$0, bzn $$1, long $$2) {
      hx $$3 = $$1.dm();
      bnf<?> $$4 = $$1.dO();
      elm $$5 = $$4.c(bvh.V).get();
      this.i = new elm((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(bvh.m, new bvk($$5, this.g, 0));
   }

   protected void c(amz $$0, bzn $$1, long $$2) {
      List<bmf> $$3 = $$0.a(bmf.class, this.f, $$1, $$1.cH());
      bnf<?> $$4 = $$1.dO();
      if (!$$3.isEmpty()) {
         bmf $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bmf)$$1), (float)$$1.b(bnl.c));
         int $$6 = $$1.a(ble.a) ? $$1.b(ble.a).e() + 1 : 0;
         int $$7 = $$1.a(ble.b) ? $$1.b(ble.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = aui.a($$1.ff() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bmf)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), arn.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), arn.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gl();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), arn.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<bvk> $$12 = $$4.c(bvh.m);
         Optional<elm> $$13 = $$4.c(bvh.V);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(amz $$0, bzn $$1) {
      elm $$2 = $$1.dp().d(1.0, 0.0, 1.0).d();
      hx $$3 = hx.a($$1.dk().e($$2));
      return $$0.a_($$3).a(asb.ce) || $$0.a_($$3.c()).a(asb.ce);
   }

   protected void b(amz $$0, bzn $$1) {
      $$0.a($$1, (byte)59);
      $$1.dO().a(bvh.U, this.e.apply($$1).a($$0.z));
      $$1.dO().b(bvh.V);
   }
}
