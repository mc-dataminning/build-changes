import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dku extends dap {
   public static final MapCodec<dku> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqc.q.fieldOf("color").forGetter(dap::b), u()).apply($$0, dku::new));
   public static final dpt b = dft.aE;
   private static final Map<ih, est> c = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dby.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         dby.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ih.e,
         dby.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ih.f,
         dby.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(cqc $$0, doy.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = this.n();
      cza $$2 = $$0.q();
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
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }
}
