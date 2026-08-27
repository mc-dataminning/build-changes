import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cyk extends cxw {
   public static final MapCodec<cyk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cog.q.fieldOf("color").forGetter(cxw::b), u()).apply($$0, cyk::new));
   public static final dne b = dmu.ba;
   private static final Map<cog, czf> c = Maps.newHashMap();
   private static final epo d = czf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cyk> a() {
      return a;
   }

   public cyk(cog $$0, dmd.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d;
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, Integer.valueOf(dnk.a($$0.i() + 180.0F)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   public static czf a(cog $$0) {
      return c.getOrDefault($$0, czh.iJ);
   }
}
