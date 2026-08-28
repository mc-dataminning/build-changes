import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dit extends deu {
   public static final MapCodec<dit> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(dit::b), u()).apply($$0, dit::new));
   private final deu b;
   private static final Map<deu, deu> c = Maps.newIdentityHashMap();
   private static final Map<drx, drx> d = Maps.newIdentityHashMap();
   private static final Map<drx, drx> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dit> a() {
      return a;
   }

   public dit(deu $$0, drw.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public deu b() {
      return this.b;
   }

   public static boolean m(drx $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arb $$0, iz $$1) {
      ckf $$2 = bsv.aM.a((dbt)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, cuk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbp.h) && czw.a(czy.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static drx n(drx $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public drx o(drx $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static drx a(Map<drx, drx> $$0, drx $$1, Supplier<drx> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         drx $$2x = $$2.get();

         for (dta $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
