import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dem extends ddy {
   public static final MapCodec<dem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csv.q.fieldOf("color").forGetter(ddy::b), u()).apply($$0, dem::new));
   public static final dtk b = dta.ba;
   private static final Map<csv, dfh> c = Maps.newHashMap();
   private static final ewy d = dfh.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public dem(csv $$0, dsj.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return d;
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, Integer.valueOf(dtq.a($$0.i() + 180.0F)));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   public static dfh a(csv $$0) {
      return c.getOrDefault($$0, dfj.iJ);
   }
}
