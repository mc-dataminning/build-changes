import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doi extends ded {
   public static final MapCodec<doi> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmj.a.b.fieldOf("kind").forGetter(ded::b), u()).apply($$0, doi::new));
   public static final dte d = djd.aE;
   private static final Map<jf, ewy> b = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfh.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jf.d,
         dfh.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jf.f,
         dfh.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jf.e,
         dfh.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends doi> a() {
      return c;
   }

   protected doi(dmj.a $$0, dsj.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = super.a($$0);
      dbl $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
