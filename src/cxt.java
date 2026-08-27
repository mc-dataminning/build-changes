import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cxt extends cxf {
   public static final MapCodec<cxt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnn.q.fieldOf("color").forGetter(cxf::b), u()).apply($$0, cxt::new));
   public static final dmf b = dlv.ba;
   private static final Map<cnn, cyo> c = Maps.newHashMap();
   private static final eol d = cyo.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cxt> a() {
      return a;
   }

   public cxt(cnn $$0, dle.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return d;
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, Integer.valueOf(dml.a($$0.i() + 180.0F)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   public static cyo a(cnn $$0) {
      return c.getOrDefault($$0, cyq.iJ);
   }
}
