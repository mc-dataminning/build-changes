import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dif extends cyb {
   public static final MapCodec<dif> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgg.a.b.fieldOf("kind").forGetter(cyb::b), u()).apply($$0, dif::new));
   public static final dmy d = dda.aE;
   private static final Map<ih, epo> b = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         czf.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ih.d,
         czf.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ih.f,
         czf.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ih.e,
         czf.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dif> a() {
      return c;
   }

   protected dif(dgg.a $$0, dmd.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ih.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = super.a($$0);
      cvk $$2 = $$0.q();
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
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
