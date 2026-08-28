import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dku extends dgv {
   public static final MapCodec<dku> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lu.e.q().fieldOf("host").forGetter(dku::b), u()).apply($$0, dku::new));
   private final dgv b;
   private static final Map<dgv, dgv> c = Maps.newIdentityHashMap();
   private static final Map<dua, dua> d = Maps.newIdentityHashMap();
   private static final Map<dua, dua> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dku> a() {
      return a;
   }

   public dku(dgv $$0, dtz.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dgv b() {
      return this.b;
   }

   public static boolean o(dua $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arg $$0, je $$1) {
      clc $$2 = btq.aM.a($$0, btp.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ac().b(ddo.h) && !day.a($$3, awv.t)) {
         this.a($$1, $$2);
      }
   }

   public static dua p(dua $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dua q(dua $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dua a(Map<dua, dua> $$0, dua $$1, Supplier<dua> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dua $$2x = $$2.get();

         for (dvd $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
