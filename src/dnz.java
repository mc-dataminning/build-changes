import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnz extends ddu {
   public static final MapCodec<dnz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dma.a.b.fieldOf("kind").forGetter(ddu::b), u()).apply($$0, dnz::new));
   public static final dsv d = diu.aE;
   private static final Map<je, ewj> b = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dey.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         je.d,
         dey.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         je.f,
         dey.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         je.e,
         dey.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dnz> a() {
      return c;
   }

   protected dnz(dma.a $$0, dsa.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = super.a($$0);
      dbd $$2 = $$0.q();
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
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
