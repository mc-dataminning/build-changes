import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dow extends dku {
   public static final MapCodec<dow> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(md.e.q().fieldOf("host").forGetter(dow::b), t()).apply($$0, dow::new));
   private final dku b;
   private static final Map<dku, dku> c = Maps.newIdentityHashMap();
   private static final Map<dym, dym> d = Maps.newIdentityHashMap();
   private static final Map<dym, dym> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dow> a() {
      return a;
   }

   public dow(dku $$0, dyl.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dku b() {
      return this.b;
   }

   public static boolean o(dym $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arn $$0, jj $$1) {
      cnq $$2 = bwb.bd.a($$0, bwa.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(dhl.h) && !dej.a($$3, axc.t)) {
         this.a($$1, $$2);
      }
   }

   public static dym p(dym $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dym q(dym $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dym a(Map<dym, dym> $$0, dym $$1, Supplier<dym> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dym $$2x = $$2.get();

         for (dzp $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
