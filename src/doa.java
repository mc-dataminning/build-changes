import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doa extends ddv {
   public static final MapCodec<doa> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmb.a.b.fieldOf("kind").forGetter(ddv::b), u()).apply($$0, doa::new));
   public static final dsw d = div.aE;
   private static final Map<je, ewk> b = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dez.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         je.d,
         dez.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         je.f,
         dez.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         je.e,
         dez.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends doa> a() {
      return c;
   }

   protected doa(dmb.a $$0, dsb.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dsc a(cya $$0) {
      dsc $$1 = super.a($$0);
      dbe $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
