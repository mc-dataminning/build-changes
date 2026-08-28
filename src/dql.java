import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dql extends dgf {
   public static final MapCodec<dql> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dom.a.b.fieldOf("kind").forGetter(dgf::b), u()).apply($$0, dql::new));
   public static final dvi d = dlf.aF;
   private static final Map<jj, ezm> b = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dhj.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jj.d,
         dhj.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jj.f,
         dhj.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jj.e,
         dhj.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dql> a() {
      return c;
   }

   protected dql(dom.a $$0, dun.d $$1) {
      super($$0, $$1);
      this.l(this.o().b(d, jj.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = super.a($$0);
      ddl $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
         if ($$5.o().d()) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
