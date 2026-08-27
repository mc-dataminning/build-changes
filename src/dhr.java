import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhr extends cxo {
   public static final MapCodec<dhr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dft.a.b.fieldOf("kind").forGetter(cxo::b), u()).apply($$0, dhr::new));
   public static final dmd d = dcn.aE;
   private static final Map<ie, eos> b = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cys.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ie.d,
         cys.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ie.f,
         cys.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ie.e,
         cys.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dhr> a() {
      return c;
   }

   protected dhr(dft.a $$0, dli.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ie.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dlj a(crk $$0) {
      dlj $$1 = super.a($$0);
      cux $$2 = $$0.q();
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
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
