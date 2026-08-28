import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class diw extends dex {
   public static final MapCodec<diw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(diw::b), u()).apply($$0, diw::new));
   private final dex b;
   private static final Map<dex, dex> c = Maps.newIdentityHashMap();
   private static final Map<dsa, dsa> d = Maps.newIdentityHashMap();
   private static final Map<dsa, dsa> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends diw> a() {
      return a;
   }

   public diw(dex $$0, drz.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dex b() {
      return this.b;
   }

   public static boolean m(dsa $$0) {
      return c.containsKey($$0.b());
   }

   private void a(are $$0, iz $$1) {
      cki $$2 = bsy.aM.a((dbw)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, cun $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbs.h) && czz.a(dab.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dsa n(dsa $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dsa o(dsa $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dsa a(Map<dsa, dsa> $$0, dsa $$1, Supplier<dsa> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dsa $$2x = $$2.get();

         for (dtd $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
