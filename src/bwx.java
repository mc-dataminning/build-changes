import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwx extends bvh<che> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<che, bqe> e;
   private final cef f;
   private final float g;
   private final ToDoubleFunction<che> h;
   private evq i;
   private final Function<che, avy> j;
   private final Function<che, avy> k;

   public bwx(Function<che, bqe> $$0, cef $$1, float $$2, ToDoubleFunction<che> $$3, Function<che, avy> $$4, Function<che, avy> $$5) {
      super(ImmutableMap.of(ccs.V, cct.b, ccs.W, cct.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = evq.b;
   }

   protected boolean a(are $$0, che $$1) {
      return $$1.dS().a(ccs.W);
   }

   protected boolean a(are $$0, che $$1, long $$2) {
      return $$1.dS().a(ccs.W);
   }

   protected void b(are $$0, che $$1, long $$2) {
      iz $$3 = $$1.dp();
      buq<?> $$4 = $$1.dS();
      evq $$5 = $$4.c(ccs.W).get();
      this.i = new evq((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccs.m, new ccv($$5, this.g, 0));
   }

   protected void c(are $$0, che $$1, long $$2) {
      List<bto> $$3 = $$0.a(bto.class, this.f, $$1, $$1.cK());
      buq<?> $$4 = $$1.dS();
      if (!$$3.isEmpty()) {
         bto $$5 = $$3.get(0);
         $$5.a($$0.aj().c((bto)$$1), (float)$$1.g(buw.c));
         int $$6 = $$1.b(bsd.a) ? $$1.c(bsd.a).e() + 1 : 0;
         int $$7 = $$1.b(bsd.b) ? $$1.c(bsd.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ayy.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.aj().b((bto)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), awa.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), awa.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gx();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), awa.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ccv> $$12 = $$4.c(ccs.m);
         Optional<evq> $$13 = $$4.c(ccs.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(are $$0, che $$1) {
      evq $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      iz $$3 = iz.a($$1.dn().e($$2));
      return $$0.a_($$3).a(awo.cm) || $$0.a_($$3.c()).a(awo.cm);
   }

   protected void b(are $$0, che $$1) {
      $$0.a($$1, (byte)59);
      $$1.dS().a(ccs.V, this.e.apply($$1).a($$0.z));
      $$1.dS().b(ccs.W);
   }
}
