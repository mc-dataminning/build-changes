import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhn extends cxk {
   public static final MapCodec<dhn> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfp.a.b.fieldOf("kind").forGetter(cxk::b), u()).apply($$0, dhn::new));
   public static final dlz d = dcj.aE;
   private static final Map<ie, eol> b = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cyo.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ie.d,
         cyo.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ie.f,
         cyo.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ie.e,
         cyo.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dhn> a() {
      return c;
   }

   protected dhn(dfp.a $$0, dle.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ie.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = super.a($$0);
      cut $$2 = $$0.q();
      hz $$3 = $$0.a();
      ie[] $$4 = $$0.f();

      for (ie $$5 : $$4) {
         if ($$5.o().d()) {
            ie $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
