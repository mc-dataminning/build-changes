import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dea extends dac {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ki.e.q().fieldOf("host").forGetter(dea::b), u()).apply($$0, dea::new));
   private final dac b;
   private static final Map<dac, dac> c = Maps.newIdentityHashMap();
   private static final Map<dnb, dnb> d = Maps.newIdentityHashMap();
   private static final Map<dnb, dnb> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dea> a() {
      return a;
   }

   public dea(dac $$0, dna.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dac b() {
      return this.b;
   }

   public static boolean m(dnb $$0) {
      return c.containsKey($$0.b());
   }

   private void a(apf $$0, ib $$1) {
      cgh $$2 = bpd.aM.a((cxb)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, cqm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(cwx.h) && cux.a(cuz.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dnb n(dnb $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dnb o(dnb $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dnb a(Map<dnb, dnb> $$0, dnb $$1, Supplier<dnb> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dnb $$2x = $$2.get();

         for (doe $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
