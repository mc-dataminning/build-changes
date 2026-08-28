import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dek extends ddw {
   public static final MapCodec<dek> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cst.q.fieldOf("color").forGetter(ddw::b), u()).apply($$0, dek::new));
   public static final dth b = dsx.ba;
   private static final Map<cst, dff> c = Maps.newHashMap();
   private static final ews d = dff.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   public dek(cst $$0, dsg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return d;
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, Integer.valueOf(dtn.a($$0.i() + 180.0F)));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   public static dff a(cst $$0) {
      return c.getOrDefault($$0, dfh.iJ);
   }
}
