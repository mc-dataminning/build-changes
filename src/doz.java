import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doz extends doh {
   public static final MapCodec<doz> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, doz::new));
   public static final dtu g = djs.aE;
   protected static final float h = 2.5F;
   private static final Map<ji, exp> i = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfw.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ji.d,
         dfw.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ji.e,
         dfw.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ji.f,
         dfw.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<doz> a() {
      return f;
   }

   protected doz(lq $$0, dsz.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ji.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return m($$0);
   }

   public static exp m(dta $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dcx $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2.g());
      dta $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = this.o();
      dcx $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dfy.a.o() : $$0;
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      ji $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ji $$10 = $$4.g();
      $$1.a(lm.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(g);
   }
}
