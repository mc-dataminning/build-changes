import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dbj extends dbg {
   public static final MapCodec<dbj> b = b(dbj::new);
   public static final dpt c = dft.aE;
   private static final Map<ih, est> e = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dby.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ih.d,
         dby.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ih.e,
         dby.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ih.f,
         dby.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dbj> a() {
      return b;
   }

   protected dbj(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ih.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dca.a.n() : $$0;
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ih $$3 = $$0.c(c);
      ib $$4 = $$2.a($$3.g());
      doz $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = super.a($$0);
      cza $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
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
