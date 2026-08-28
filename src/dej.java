import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dej extends deg {
   public static final MapCodec<dej> b = b(dej::new);
   public static final dsv c = diu.aE;
   private static final Map<je, ewj> e = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dey.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         je.d,
         dey.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         je.e,
         dey.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         je.f,
         dey.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dej> a() {
      return b;
   }

   protected dej(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfa.a.o() : $$0;
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      je $$3 = $$0.c(c);
      iz $$4 = $$2.a($$3.g());
      dsb $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = super.a($$0);
      dca $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
