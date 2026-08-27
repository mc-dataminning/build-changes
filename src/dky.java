import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dky extends dau {
   public static final MapCodec<dky> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(diz.a.b.fieldOf("kind").forGetter(dau::b), u()).apply($$0, dky::new));
   public static final dpt d = dft.aE;
   private static final Map<ih, est> b = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dby.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ih.d,
         dby.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ih.f,
         dby.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ih.e,
         dby.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dky> a() {
      return c;
   }

   protected dky(diz.a $$0, doy.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, ih.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = super.a($$0);
      cyd $$2 = $$0.q();
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
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
