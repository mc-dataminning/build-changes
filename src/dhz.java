import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dhz extends dea {
   public static final MapCodec<dhz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(le.e.q().fieldOf("host").forGetter(dhz::b), u()).apply($$0, dhz::new));
   private final dea b;
   private static final Map<dea, dea> c = Maps.newIdentityHashMap();
   private static final Map<drd, drd> d = Maps.newIdentityHashMap();
   private static final Map<drd, drd> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dhz> a() {
      return a;
   }

   public dhz(dea $$0, drc.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dea b() {
      return this.b;
   }

   public static boolean m(drd $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqn $$0, io $$1) {
      cjl $$2 = bsc.aM.a((daz)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.aa().b(dav.h) && czc.a(cze.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static drd n(drd $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public drd o(drd $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static drd a(Map<drd, drd> $$0, drd $$1, Supplier<drd> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         drd $$2x = $$2.get();

         for (dsg $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
