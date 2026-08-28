import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doe extends ddy {
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csv.q.fieldOf("color").forGetter(ddy::b), u()).apply($$0, doe::new));
   public static final dte b = djd.aE;
   private static final Map<jf, ewy> c = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfh.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jf.d,
         dfh.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jf.e,
         dfh.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jf.f,
         dfh.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(csv $$0, dsj.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = this.o();
      dci $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }
}
