import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doy extends des {
   public static final MapCodec<doy> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmz.a.b.fieldOf("kind").forGetter(des::b), u()).apply($$0, doy::new));
   public static final dtu d = djs.aE;
   private static final Map<ji, exp> b = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfw.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ji.d,
         dfw.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ji.f,
         dfw.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ji.e,
         dfw.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends doy> a() {
      return c;
   }

   protected doy(dmz.a $$0, dsz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ji.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dta a(cyb $$0) {
      dta $$1 = super.a($$0);
      dca $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
