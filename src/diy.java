import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class diy extends cyt {
   public static final MapCodec<diy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpd.q.fieldOf("color").forGetter(cyt::b), u()).apply($$0, diy::new));
   public static final dnv b = ddx.aE;
   private static final Map<ih, eqm> c = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dac.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         dac.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ih.e,
         dac.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ih.f,
         dac.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(cpd $$0, dna.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = this.o();
      cxe $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
         if ($$5.o().d()) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }
}
