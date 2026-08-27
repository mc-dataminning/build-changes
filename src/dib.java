import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dib extends cxw {
   public static final MapCodec<dib> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cog.q.fieldOf("color").forGetter(cxw::b), u()).apply($$0, dib::new));
   public static final dmy b = dda.aE;
   private static final Map<ih, epo> c = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         czf.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         czf.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ih.e,
         czf.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ih.f,
         czf.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   public dib(cog $$0, dmd.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = this.o();
      cwh $$2 = $$0.q();
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
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }
}
