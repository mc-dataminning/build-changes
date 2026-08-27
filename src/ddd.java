import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class ddd extends czf {
   public static final MapCodec<ddd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kh.e.q().fieldOf("host").forGetter(ddd::b), u()).apply($$0, ddd::new));
   private final czf b;
   private static final Map<czf, czf> c = Maps.newIdentityHashMap();
   private static final Map<dme, dme> d = Maps.newIdentityHashMap();
   private static final Map<dme, dme> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends ddd> a() {
      return a;
   }

   public ddd(czf $$0, dmd.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public czf b() {
      return this.b;
   }

   public static boolean m(dme $$0) {
      return c.containsKey($$0.b());
   }

   private void a(apa $$0, ib $$1) {
      cfn $$2 = bol.aK.a((cwe)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(cwa.h) && cua.a(cuc.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dme n(dme $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dme o(dme $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dme a(Map<dme, dme> $$0, dme $$1, Supplier<dme> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dme $$2x = $$2.get();

         for (dnh $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
