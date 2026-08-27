import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dfw extends dby {
   public static final MapCodec<dfw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kr.e.q().fieldOf("host").forGetter(dfw::b), u()).apply($$0, dfw::new));
   private final dby b;
   private static final Map<dby, dby> c = Maps.newIdentityHashMap();
   private static final Map<doz, doz> d = Maps.newIdentityHashMap();
   private static final Map<doz, doz> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dfw> a() {
      return a;
   }

   public dfw(dby $$0, doy.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dby b() {
      return this.b;
   }

   public static boolean m(doz $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aps $$0, ib $$1) {
      chg $$2 = bqb.aL.a((cyx)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.aa().b(cyt.h) && cwr.a(cwt.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static doz n(doz $$0) {
      return a(d, $$0, () -> c.get($$0.b()).n());
   }

   public doz o(doz $$0) {
      return a(e, $$0, () -> this.b().n());
   }

   private static doz a(Map<doz, doz> $$0, doz $$1, Supplier<doz> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         doz $$2x = $$2.get();

         for (dqc $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
