import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dqh extends dga {
   public static final MapCodec<dqh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuj.q.fieldOf("color").forGetter(dga::b), u()).apply($$0, dqh::new));
   public static final dvi b = dlf.aF;
   private static final Map<jj, ezm> c = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dhj.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jj.d,
         dhj.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jj.e,
         dhj.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jj.f,
         dhj.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(cuj $$0, dun.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jj.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = this.o();
      dej $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
         if ($$5.o().d()) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }
}
