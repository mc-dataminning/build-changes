import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dei extends def {
   public static final MapCodec<dei> b = b(dei::new);
   public static final dsu c = dit.aE;
   private static final Map<je, ewi> e = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dex.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         je.d,
         dex.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         je.e,
         dex.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         je.f,
         dex.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dei> a() {
      return b;
   }

   protected dei(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dez.a.o() : $$0;
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      je $$3 = $$0.c(c);
      iz $$4 = $$2.a($$3.g());
      dsa $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = super.a($$0);
      dbz $$2 = $$0.q();
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
