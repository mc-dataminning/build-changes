import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddf extends dcr {
   public static final MapCodec<ddf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csj.q.fieldOf("color").forGetter(dcr::b), u()).apply($$0, ddf::new));
   public static final dsd b = drt.ba;
   private static final Map<csj, dea> c = Maps.newHashMap();
   private static final evf d = dea.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   public ddf(csj $$0, drc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return d;
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, Integer.valueOf(dsj.a($$0.i() + 180.0F)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   public static dea a(csj $$0) {
      return c.getOrDefault($$0, dec.iJ);
   }
}
