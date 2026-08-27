import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class djf extends dfc {
   public static final MapCodec<djf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lh.e.q().fieldOf("host").forGetter(djf::b), u()).apply($$0, djf::new));
   private final dfc b;
   private static final Map<dfc, dfc> c = Maps.newIdentityHashMap();
   private static final Map<dtc, dtc> d = Maps.newIdentityHashMap();
   private static final Map<dtc, dtc> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends djf> a() {
      return a;
   }

   public djf(dfc $$0, dtb.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dfc b() {
      return this.b;
   }

   public static boolean m(dtc $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqt $$0, ir $$1) {
      cjl $$2 = bsb.aO.a((dca)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, cuh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbw.h) && dae.a(dag.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dtc n(dtc $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public dtc o(dtc $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static dtc a(Map<dtc, dtc> $$0, dtc $$1, Supplier<dtc> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dtc $$2x = $$2.get();

         for (duf $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
