import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class des extends dep {
   public static final MapCodec<des> b = b(des::new);
   public static final dte c = djd.aE;
   private static final Map<jf, ewy> e = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfh.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jf.d,
         dfh.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jf.e,
         dfh.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jf.f,
         dfh.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends des> a() {
      return b;
   }

   protected des(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, jf.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfj.a.o() : $$0;
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      jf $$3 = $$0.c(c);
      ja $$4 = $$2.a($$3.g());
      dsk $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = super.a($$0);
      dci $$2 = $$0.q();
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
