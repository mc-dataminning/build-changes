import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnw extends ddq {
   public static final MapCodec<dnw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(ddq::b), u()).apply($$0, dnw::new));
   public static final dsw b = div.aE;
   private static final Map<je, ewk> c = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dez.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dez.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         je.e,
         dez.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         je.f,
         dez.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(cti $$0, dsb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dsc a(cya $$0) {
      dsc $$1 = this.o();
      dcb $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
