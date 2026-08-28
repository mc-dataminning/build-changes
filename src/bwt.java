import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bwt extends bvd<cha> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cha, bqa> e;
   private final ceb f;
   private final float g;
   private final ToDoubleFunction<cha> h;
   private evm i;
   private final Function<cha, avv> j;
   private final Function<cha, avv> k;

   public bwt(Function<cha, bqa> $$0, ceb $$1, float $$2, ToDoubleFunction<cha> $$3, Function<cha, avv> $$4, Function<cha, avv> $$5) {
      super(ImmutableMap.of(cco.V, ccp.b, cco.W, ccp.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = evm.b;
   }

   protected boolean a(arb $$0, cha $$1) {
      return $$1.dS().a(cco.W);
   }

   protected boolean a(arb $$0, cha $$1, long $$2) {
      return $$1.dS().a(cco.W);
   }

   protected void b(arb $$0, cha $$1, long $$2) {
      iz $$3 = $$1.dp();
      bum<?> $$4 = $$1.dS();
      evm $$5 = $$4.c(cco.W).get();
      this.i = new evm((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cco.m, new ccr($$5, this.g, 0));
   }

   protected void c(arb $$0, cha $$1, long $$2) {
      List<btk> $$3 = $$0.a(btk.class, this.f, $$1, $$1.cK());
      bum<?> $$4 = $$1.dS();
      if (!$$3.isEmpty()) {
         btk $$5 = $$3.get(0);
         $$5.a($$0.aj().c((btk)$$1), (float)$$1.g(bus.c));
         int $$6 = $$1.b(brz.a) ? $$1.c(brz.a).e() + 1 : 0;
         int $$7 = $$1.b(brz.b) ? $$1.c(brz.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ayu.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.aj().b((btk)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), avx.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), avx.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gx();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), avx.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<ccr> $$12 = $$4.c(cco.m);
         Optional<evm> $$13 = $$4.c(cco.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(arb $$0, cha $$1) {
      evm $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      iz $$3 = iz.a($$1.dn().e($$2));
      return $$0.a_($$3).a(awl.cm) || $$0.a_($$3.c()).a(awl.cm);
   }

   protected void b(arb $$0, cha $$1) {
      $$0.a($$1, (byte)59);
      $$1.dS().a(cco.V, this.e.apply($$1).a($$0.z));
      $$1.dS().b(cco.W);
   }
}
