import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class det extends deq {
   public static final MapCodec<det> b = b(det::new);
   public static final dtf c = dje.aE;
   private static final Map<jf, exa> e = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfi.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jf.d,
         dfi.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jf.e,
         dfi.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jf.f,
         dfi.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends det> a() {
      return b;
   }

   protected det(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, jf.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfk.a.o() : $$0;
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      jf $$3 = $$0.c(c);
      ja $$4 = $$2.a($$3.g());
      dsl $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = super.a($$0);
      dcj $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
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
