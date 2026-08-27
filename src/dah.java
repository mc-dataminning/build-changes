import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dah extends cwj {
   public static final MapCodec<dah> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(dah::b), u()).apply($$0, dah::new));
   private final cwj b;
   private static final Map<cwj, cwj> c = Maps.newIdentityHashMap();
   private static final Map<dja, dja> d = Maps.newIdentityHashMap();
   private static final Map<dja, dja> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dah> a() {
      return a;
   }

   public dah(cwj $$0, diz.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cwj b() {
      return this.b;
   }

   public static boolean h(dja $$0) {
      return c.containsKey($$0.b());
   }

   private void a(amz $$0, hx $$1) {
      ccq $$2 = blt.aJ.a((cti)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(cte.h) && cre.a(crg.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dja n(dja $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dja o(dja $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dja a(Map<dja, dja> $$0, dja $$1, Supplier<dja> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dja $$2x = $$2.get();

         for (dkd $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
