import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnz extends dlz {
   public static final MapCodec<dnz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtp.a.fieldOf("wood_type").forGetter(dlz::d), u()).apply($$0, dnz::new));
   public static final dsw b = div.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<je, ewk> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dez.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dez.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         je.f,
         dez.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         je.e,
         dez.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dtp $$0, dsb.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = this.o();
      env $$2 = $$0.q().b_($$0.a());
      dcb $$3 = $$0.q();
      iz $$4 = $$0.a();
      je[] $$5 = $$0.f();

      for (je $$6 : $$5) {
         if ($$6.o().d()) {
            je $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsc $$0) {
      return $$0.c(b).p();
   }

   @Override
   public evr m(dsc $$0) {
      ewk $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, f);
   }
}
