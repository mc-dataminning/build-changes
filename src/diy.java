import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class diy extends dez {
   public static final MapCodec<diy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(diy::b), u()).apply($$0, diy::new));
   private final dez b;
   private static final Map<dez, dez> c = Maps.newIdentityHashMap();
   private static final Map<dsc, dsc> d = Maps.newIdentityHashMap();
   private static final Map<dsc, dsc> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends diy> a() {
      return a;
   }

   public diy(dez $$0, dsb.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dez b() {
      return this.b;
   }

   public static boolean m(dsc $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arf $$0, iz $$1) {
      ckk $$2 = bta.aM.a((dby)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, cup $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbu.h) && dab.a(dad.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dsc n(dsc $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dsc o(dsc $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dsc a(Map<dsc, dsc> $$0, dsc $$1, Supplier<dsc> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dsc $$2x = $$2.get();

         for (dtf $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
