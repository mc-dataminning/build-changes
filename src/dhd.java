import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dhd extends dde {
   public static final MapCodec<dhd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ld.e.q().fieldOf("host").forGetter(dhd::b), u()).apply($$0, dhd::new));
   private final dde b;
   private static final Map<dde, dde> c = Maps.newIdentityHashMap();
   private static final Map<dqh, dqh> d = Maps.newIdentityHashMap();
   private static final Map<dqh, dqh> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dhd> a() {
      return a;
   }

   public dhd(dde $$0, dqg.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dde b() {
      return this.b;
   }

   public static boolean m(dqh $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqh $$0, in $$1) {
      ciu $$2 = brn.aL.a((dad)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, csz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.aa().b(czz.h) && cyh.a(cyj.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dqh n(dqh $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public dqh o(dqh $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static dqh a(Map<dqh, dqh> $$0, dqh $$1, Supplier<dqh> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dqh $$2x = $$2.get();

         for (drk $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
