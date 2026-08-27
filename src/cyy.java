import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class cyy extends cva {
   public static final MapCodec<cyy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jy.f.q().fieldOf("host").forGetter(cyy::b), u()).apply($$0, cyy::new));
   private final cva b;
   private static final Map<cva, cva> c = Maps.newIdentityHashMap();
   private static final Map<dhi, dhi> d = Maps.newIdentityHashMap();
   private static final Map<dhi, dhi> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends cyy> a() {
      return a;
   }

   public cyy(cva $$0, dhh.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cva b() {
      return this.b;
   }

   public static boolean h(dhi $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ame $$0, ht $$1) {
      cbp $$2 = bku.aI.a((csa)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Y().b(crw.h) && cpw.a(cpy.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dhi n(dhi $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dhi o(dhi $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dhi a(Map<dhi, dhi> $$0, dhi $$1, Supplier<dhi> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dhi $$2x = $$2.get();

         for (dil $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
