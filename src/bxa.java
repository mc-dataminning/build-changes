import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bxa extends bvk<chh> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<chh, bqh> e;
   private final cei f;
   private final float g;
   private final ToDoubleFunction<chh> h;
   private evt i;
   private final Function<chh, avz> j;
   private final Function<chh, avz> k;

   public bxa(Function<chh, bqh> $$0, cei $$1, float $$2, ToDoubleFunction<chh> $$3, Function<chh, avz> $$4, Function<chh, avz> $$5) {
      super(ImmutableMap.of(ccv.V, ccw.b, ccv.W, ccw.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = evt.b;
   }

   protected boolean a(arf $$0, chh $$1) {
      return $$1.dS().a(ccv.W);
   }

   protected boolean a(arf $$0, chh $$1, long $$2) {
      return $$1.dS().a(ccv.W);
   }

   protected void b(arf $$0, chh $$1, long $$2) {
      iz $$3 = $$1.dp();
      but<?> $$4 = $$1.dS();
      evt $$5 = $$4.c(ccv.W).get();
      this.i = new evt((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccv.m, new ccy($$5, this.g, 0));
   }

   protected void c(arf $$0, chh $$1, long $$2) {
      List<btr> $$3 = $$0.a(btr.class, this.f, $$1, $$1.cK());
      but<?> $$4 = $$1.dS();
      if (!$$3.isEmpty()) {
         btr $$5 = $$3.get(0);
         $$5.a($$0.aj().c((btr)$$1), (float)$$1.g(buz.c));
         int $$6 = $$1.b(bsg.a) ? $$1.c(bsg.a).e() + 1 : 0;
         int $$7 = $$1.b(bsg.b) ? $$1.c(bsg.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ayz.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.aj().b((btr)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gx();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), awb.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ccy> $$12 = $$4.c(ccv.m);
         Optional<evt> $$13 = $$4.c(ccv.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arf $$0, chh $$1) {
      evt $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      iz $$3 = iz.a($$1.dn().e($$2));
      return $$0.a_($$3).a(awp.cm) || $$0.a_($$3.c()).a(awp.cm);
   }

   protected void b(arf $$0, chh $$1) {
      $$0.a($$1, (byte)59);
      $$1.dS().a(ccv.V, this.e.apply($$1).a($$0.z));
      $$1.dS().b(ccv.W);
   }
}
