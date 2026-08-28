import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dek extends deh {
   public static final MapCodec<dek> b = b(dek::new);
   public static final dsw c = div.aE;
   private static final Map<je, ewk> e = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dez.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         je.d,
         dez.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         je.e,
         dez.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         je.f,
         dez.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dek> a() {
      return b;
   }

   protected dek(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfb.a.o() : $$0;
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      je $$3 = $$0.c(c);
      iz $$4 = $$2.a($$3.g());
      dsc $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = super.a($$0);
      dcb $$2 = $$0.q();
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
