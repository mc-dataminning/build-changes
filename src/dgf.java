import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dgf extends dch {
   public static final MapCodec<dgf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kt.e.q().fieldOf("host").forGetter(dgf::b), u()).apply($$0, dgf::new));
   private final dch b;
   private static final Map<dch, dch> c = Maps.newIdentityHashMap();
   private static final Map<dpi, dpi> d = Maps.newIdentityHashMap();
   private static final Map<dpi, dpi> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dgf> a() {
      return a;
   }

   public dgf(dch $$0, dph.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dch b() {
      return this.b;
   }

   public static boolean m(dpi $$0) {
      return c.containsKey($$0.b());
   }

   private void a(apu $$0, id $$1) {
      chn $$2 = bqg.aL.a((czg)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.aa().b(czc.h) && cxa.a(cxc.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dpi n(dpi $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public dpi o(dpi $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static dpi a(Map<dpi, dpi> $$0, dpi $$1, Supplier<dpi> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dpi $$2x = $$2.get();

         for (dql $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
