import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dmo extends diq {
   public static final MapCodec<dmo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lz.e.q().fieldOf("host").forGetter(dmo::b), t()).apply($$0, dmo::new));
   private final diq b;
   private static final Map<diq, diq> c = Maps.newIdentityHashMap();
   private static final Map<dvv, dvv> d = Maps.newIdentityHashMap();
   private static final Map<dvv, dvv> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dmo> a() {
      return a;
   }

   public dmo(diq $$0, dvu.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public diq b() {
      return this.b;
   }

   public static boolean o(dvv $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arp $$0, jh $$1) {
      cmf $$2 = bus.ba.a($$0, bur.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.N().b(dfi.h) && !dcf.a($$3, axf.t)) {
         this.a($$1, $$2);
      }
   }

   public static dvv p(dvv $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dvv q(dvv $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dvv a(Map<dvv, dvv> $$0, dvv $$1, Supplier<dvv> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dvv $$2x = $$2.get();

         for (dwx $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
