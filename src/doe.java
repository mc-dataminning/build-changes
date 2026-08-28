import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class doe extends dkd {
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(doe::b), t()).apply($$0, doe::new));
   private final dkd b;
   private static final Map<dkd, dkd> c = Maps.newIdentityHashMap();
   private static final Map<dxo, dxo> d = Maps.newIdentityHashMap();
   private static final Map<dxo, dxo> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends doe> a() {
      return a;
   }

   public doe(dkd $$0, dxn.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dkd b() {
      return this.b;
   }

   public static boolean o(dxo $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arx $$0, jh $$1) {
      cmv $$2 = bvi.be.a($$0, bvh.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().b(dgv.h) && !dds.a($$3, axn.t)) {
         this.a($$1, $$2);
      }
   }

   public static dxo p(dxo $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dxo q(dxo $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dxo a(Map<dxo, dxo> $$0, dxo $$1, Supplier<dxo> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dxo $$2x = $$2.get();

         for (dyq $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
