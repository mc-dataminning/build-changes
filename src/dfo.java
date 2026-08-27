import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfo extends cvl {
   public static final MapCodec<dfo> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddq.a.b.fieldOf("kind").forGetter(cvl::b), u()).apply($$0, dfo::new));
   public static final dka d = dak.aE;
   private static final Map<ic, eml> b = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwp.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ic.d,
         cwp.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ic.f,
         cwp.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ic.e,
         cwp.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dfo> a() {
      return c;
   }

   protected dfo(ddq.a $$0, djf.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ic.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = super.a($$0);
      csu $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
