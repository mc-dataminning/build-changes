import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dfh extends dfe {
   public static final MapCodec<dfh> b = b(dfh::new);
   public static final dtu c = djs.aE;
   private static final Map<ji, exp> e = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfw.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ji.d,
         dfw.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ji.e,
         dfw.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ji.f,
         dfw.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dfh> a() {
      return b;
   }

   protected dfh(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ji.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfy.a.o() : $$0;
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      ji $$3 = $$0.c(c);
      jd $$4 = $$2.a($$3.g());
      dta $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = super.a($$0);
      dcx $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
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
