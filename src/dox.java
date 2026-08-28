import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dox extends dmx {
   public static final MapCodec<dox> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dun.a.fieldOf("wood_type").forGetter(dmx::d), u()).apply($$0, dox::new));
   public static final dtu b = djs.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ji, exp> i = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfw.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ji.d,
         dfw.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ji.f,
         dfw.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ji.e,
         dfw.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   public dox(dun $$0, dsz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ji.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = this.o();
      eoy $$2 = $$0.q().b_($$0.a());
      dcx $$3 = $$0.q();
      jd $$4 = $$0.a();
      ji[] $$5 = $$0.f();

      for (ji $$6 : $$5) {
         if ($$6.o().d()) {
            ji $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eoz.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dta $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eww m(dta $$0) {
      exp $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
      $$0.a(b, f);
   }
}
