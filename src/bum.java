import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bum extends bsw<cet> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cet, bob> e;
   private final cbu f;
   private final float g;
   private final ToDoubleFunction<cet> h;
   private etf i;
   private final Function<cet, auy> j;
   private final Function<cet, auy> k;

   public bum(Function<cet, bob> $$0, cbu $$1, float $$2, ToDoubleFunction<cet> $$3, Function<cet, auy> $$4, Function<cet, auy> $$5) {
      super(ImmutableMap.of(cah.V, cai.b, cah.W, cai.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = etf.b;
   }

   protected boolean a(aqe $$0, cet $$1) {
      return $$1.dQ().a(cah.W);
   }

   protected boolean a(aqe $$0, cet $$1, long $$2) {
      return $$1.dQ().a(cah.W);
   }

   protected void b(aqe $$0, cet $$1, long $$2) {
      im $$3 = $$1.dn();
      bsf<?> $$4 = $$1.dQ();
      etf $$5 = $$4.c(cah.W).get();
      this.i = new etf((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(cah.m, new cak($$5, this.g, 0));
   }

   protected void c(aqe $$0, cet $$1, long $$2) {
      List<bre> $$3 = $$0.a(bre.class, this.f, $$1, $$1.cI());
      bsf<?> $$4 = $$1.dQ();
      if (!$$3.isEmpty()) {
         bre $$5 = $$3.get(0);
         $$5.a($$0.ai().c((bre)$$1), (float)$$1.g(bsl.c));
         int $$6 = $$1.b(bpz.a) ? $$1.c(bpz.a).e() + 1 : 0;
         int $$7 = $$1.b(bpz.b) ? $$1.c(bpz.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = axw.a($$1.fl() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.ai().b((bre)$$1)) ? 0.5F : 1.0F;
         $$5.q((double)($$10 * $$9) * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), ava.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), ava.g, 1.0F, 1.0F);
         boolean $$11 = $$1.gw();
         if ($$11) {
            $$0.a(null, $$1, this.k.apply($$1), ava.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cak> $$12 = $$4.c(cah.m);
         Optional<etf> $$13 = $$4.c(cah.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aqe $$0, cet $$1) {
      etf $$2 = $$1.dq().d(1.0, 0.0, 1.0).d();
      im $$3 = im.a($$1.dl().e($$2));
      return $$0.a_($$3).a(avo.cg) || $$0.a_($$3.c()).a(avo.cg);
   }

   protected void b(aqe $$0, cet $$1) {
      $$0.a($$1, (byte)59);
      $$1.dQ().a(cah.V, this.e.apply($$1).a($$0.z));
      $$1.dQ().b(cah.W);
   }
}
