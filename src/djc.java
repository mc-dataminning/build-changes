import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djc extends cyy {
   public static final MapCodec<djc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhd.a.b.fieldOf("kind").forGetter(cyy::b), u()).apply($$0, djc::new));
   public static final dnv d = ddx.aE;
   private static final Map<ih, eqm> b = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dac.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ih.d,
         dac.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ih.f,
         dac.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ih.e,
         dac.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends djc> a() {
      return c;
   }

   protected djc(dhd.a $$0, dna.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ih.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = super.a($$0);
      cwh $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
         if ($$5.o().d()) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
