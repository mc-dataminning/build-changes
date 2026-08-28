import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dny extends dly {
   public static final MapCodec<dny> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dto.a.fieldOf("wood_type").forGetter(dly::d), u()).apply($$0, dny::new));
   public static final dsv b = diu.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<je, ewj> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dey.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dey.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         je.f,
         dey.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         je.e,
         dey.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dto $$0, dsa.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = this.o();
      enu $$2 = $$0.q().b_($$0.a());
      dca $$3 = $$0.q();
      iz $$4 = $$0.a();
      je[] $$5 = $$0.f();

      for (je $$6 : $$5) {
         if ($$6.o().d()) {
            je $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == env.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsb $$0) {
      return $$0.c(b).p();
   }

   @Override
   public evq m(dsb $$0) {
      ewj $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, f);
   }
}
