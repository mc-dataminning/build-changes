import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnx extends ddr {
   public static final MapCodec<dnx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctj.q.fieldOf("color").forGetter(ddr::b), u()).apply($$0, dnx::new));
   public static final dsx b = diw.aE;
   private static final Map<je, ewl> c = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfa.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dfa.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         je.e,
         dfa.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         je.f,
         dfa.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(ctj $$0, dsc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = this.o();
      dcc $$2 = $$0.q();
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
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }
}
