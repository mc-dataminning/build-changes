import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dou extends den {
   public static final MapCodec<dou> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(den::b), u()).apply($$0, dou::new));
   public static final dtu b = djs.aE;
   private static final Map<ji, exp> c = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfw.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ji.d,
         dfw.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ji.e,
         dfw.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ji.f,
         dfw.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(ctg $$0, dsz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dta a(cyb $$0) {
      dta $$1 = this.o();
      dcx $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }
}
