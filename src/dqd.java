import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dqd extends dma {
   public static final MapCodec<dqd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mf.e.q().fieldOf("host").forGetter(dqd::b), t()).apply($$0, dqd::new));
   private final dma b;
   private static final Map<dma, dma> c = Maps.newIdentityHashMap();
   private static final Map<dzz, dzz> d = Maps.newIdentityHashMap();
   private static final Map<dzz, dzz> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dqd> a() {
      return a;
   }

   public dqd(dma $$0, dzy.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dma b() {
      return this.b;
   }

   public static boolean o(dzz $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arq $$0, iu $$1) {
      cog $$2 = bwm.be.a($$0, bwl.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(dir.h) && !dfn.a($$3, axe.t)) {
         this.a($$1, $$2);
      }
   }

   public static dzz p(dzz $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dzz q(dzz $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dzz a(Map<dzz, dzz> $$0, dzz $$1, Supplier<dzz> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dzz $$2x = $$2.get();

         for (ebc $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
