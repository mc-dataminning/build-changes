import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class don extends dkm {
   public static final MapCodec<don> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(don::b), t()).apply($$0, don::new));
   private final dkm b;
   private static final Map<dkm, dkm> c = Maps.newIdentityHashMap();
   private static final Map<dxv, dxv> d = Maps.newIdentityHashMap();
   private static final Map<dxv, dxv> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends don> a() {
      return a;
   }

   public don(dkm $$0, dxu.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dkm b() {
      return this.b;
   }

   public static boolean o(dxv $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ash $$0, jh $$1) {
      cne $$2 = bvr.be.a($$0, bvq.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, cxp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.N().b(dhe.h) && !deb.a($$3, axx.t)) {
         this.a($$1, $$2);
      }
   }

   public static dxv p(dxv $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dxv q(dxv $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dxv a(Map<dxv, dxv> $$0, dxv $$1, Supplier<dxv> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dxv $$2x = $$2.get();

         for (dyx $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
