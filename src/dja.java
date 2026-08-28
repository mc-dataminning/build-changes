import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dja extends dfb {
   public static final MapCodec<dja> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(dja::b), u()).apply($$0, dja::new));
   private final dfb b;
   private static final Map<dfb, dfb> c = Maps.newIdentityHashMap();
   private static final Map<dse, dse> d = Maps.newIdentityHashMap();
   private static final Map<dse, dse> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dja> a() {
      return a;
   }

   public dja(dfb $$0, dsd.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dfb b() {
      return this.b;
   }

   public static boolean m(dse $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arf $$0, iz $$1) {
      ckm $$2 = btc.aM.a((dca)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, cur $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbw.h) && dad.a(daf.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dse n(dse $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dse o(dse $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dse a(Map<dse, dse> $$0, dse $$1, Supplier<dse> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dse $$2x = $$2.get();

         for (dth $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
