import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnv extends ddp {
   public static final MapCodec<dnv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cth.q.fieldOf("color").forGetter(ddp::b), u()).apply($$0, dnv::new));
   public static final dsv b = diu.aE;
   private static final Map<je, ewj> c = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dey.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dey.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         je.e,
         dey.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         je.f,
         dey.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(cth $$0, dsa.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = this.o();
      dca $$2 = $$0.q();
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
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }
}
