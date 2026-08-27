import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class ddy extends daa {
   public static final MapCodec<ddy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ki.e.q().fieldOf("host").forGetter(ddy::b), u()).apply($$0, ddy::new));
   private final daa b;
   private static final Map<daa, daa> c = Maps.newIdentityHashMap();
   private static final Map<dmz, dmz> d = Maps.newIdentityHashMap();
   private static final Map<dmz, dmz> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends ddy> a() {
      return a;
   }

   public ddy(daa $$0, dmy.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public daa b() {
      return this.b;
   }

   public static boolean m(dmz $$0) {
      return c.containsKey($$0.b());
   }

   private void a(apf $$0, ib $$1) {
      cgf $$2 = bpc.aL.a((cwz)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, cqk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(cwv.h) && cuv.a(cux.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dmz n(dmz $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dmz o(dmz $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dmz a(Map<dmz, dmz> $$0, dmz $$1, Supplier<dmz> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dmz $$2x = $$2.get();

         for (doc $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
