import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dom extends dkl {
   public static final MapCodec<dom> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(dom::b), t()).apply($$0, dom::new));
   private final dkl b;
   private static final Map<dkl, dkl> c = Maps.newIdentityHashMap();
   private static final Map<dxu, dxu> d = Maps.newIdentityHashMap();
   private static final Map<dxu, dxu> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dom> a() {
      return a;
   }

   public dom(dkl $$0, dxt.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dkl b() {
      return this.b;
   }

   public static boolean o(dxu $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ash $$0, jh $$1) {
      cnd $$2 = bvq.be.a($$0, bvp.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, cxo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.N().b(dhd.h) && !dea.a($$3, axx.t)) {
         this.a($$1, $$2);
      }
   }

   public static dxu p(dxu $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dxu q(dxu $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dxu a(Map<dxu, dxu> $$0, dxu $$1, Supplier<dxu> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dxu $$2x = $$2.get();

         for (dyw $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
