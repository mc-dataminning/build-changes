import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class bww extends bvg<chd> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<chd, bqd> e;
   private final cee f;
   private final float g;
   private final ToDoubleFunction<chd> h;
   private evp i;
   private final Function<chd, avy> j;
   private final Function<chd, avy> k;

   public bww(Function<chd, bqd> $$0, cee $$1, float $$2, ToDoubleFunction<chd> $$3, Function<chd, avy> $$4, Function<chd, avy> $$5) {
      super(ImmutableMap.of(ccr.V, ccs.b, ccr.W, ccs.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = evp.b;
   }

   protected boolean a(are $$0, chd $$1) {
      return $$1.dS().a(ccr.W);
   }

   protected boolean a(are $$0, chd $$1, long $$2) {
      return $$1.dS().a(ccr.W);
   }

   protected void b(are $$0, chd $$1, long $$2) {
      iz $$3 = $$1.dp();
      bup<?> $$4 = $$1.dS();
      evp $$5 = $$4.c(ccr.W).get();
      this.i = new evp((double)$$3.u() - $$5.a(), 0.0, (double)$$3.w() - $$5.c()).d();
      $$4.a(ccr.m, new ccu($$5, this.g, 0));
   }

   protected void c(are $$0, chd $$1, long $$2) {
      List<btn> $$3 = $$0.a(btn.class, this.f, $$1, $$1.cK());
      bup<?> $$4 = $$1.dS();
      if (!$$3.isEmpty()) {
         btn $$5 = $$3.get(0);
         $$5.a($$0.aj().c((btn)$$1), (float)$$1.g(buv.c));
         int $$6 = $$1.b(bsc.a) ? $$1.c(bsc.a).e() + 1 : 0;
         int $$7 = $$1.b(bsc.b) ? $$1.c(bsc.b).e() + 1 : 0;
         float $$8 = 0.25F * (float)($$6 - $$7);
         float $$9 = ayx.a($$1.fn() * 1.65F, 0.2F, 3.0F) + $$8;
         float $$10 = $$5.f($$0.aj().b((btn)$$1)) ? 0.5F : 1.0F;
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
         Optional<ccu> $$12 = $$4.c(ccr.m);
         Optional<evp> $$13 = $$4.c(ccr.W);
         boolean $$14 = $$12.isEmpty() || $$13.isEmpty() || $$12.get().a().a().a($$13.get(), 0.25);
         if ($$14) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(are $$0, chd $$1) {
      evp $$2 = $$1.ds().d(1.0, 0.0, 1.0).d();
      iz $$3 = iz.a($$1.dn().e($$2));
      return $$0.a_($$3).a(awo.cm) || $$0.a_($$3.c()).a(awo.cm);
   }

   protected void b(are $$0, chd $$1) {
      $$0.a($$1, (byte)59);
      $$1.dS().a(ccr.V, this.e.apply($$1).a($$0.z));
      $$1.dS().b(ccr.W);
   }
}
