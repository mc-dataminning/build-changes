import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dmh extends dij {
   public static final MapCodec<dmh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lz.e.q().fieldOf("host").forGetter(dmh::b), t()).apply($$0, dmh::new));
   private final dij b;
   private static final Map<dij, dij> c = Maps.newIdentityHashMap();
   private static final Map<dvo, dvo> d = Maps.newIdentityHashMap();
   private static final Map<dvo, dvo> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dmh> a() {
      return a;
   }

   public dmh(dij $$0, dvn.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dij b() {
      return this.b;
   }

   public static boolean o(dvo $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arq $$0, jh $$1) {
      cmc $$2 = bup.aM.a($$0, buo.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, cwf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ac().b(dfb.h) && !dby.a($$3, axg.t)) {
         this.a($$1, $$2);
      }
   }

   public static dvo p(dvo $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dvo q(dvo $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dvo a(Map<dvo, dvo> $$0, dvo $$1, Supplier<dvo> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dvo $$2x = $$2.get();

         for (dwq $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
