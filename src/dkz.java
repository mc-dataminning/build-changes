import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dkz extends dkl {
   public static final MapCodec<dkz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxq.q.fieldOf("color").forGetter(dkl::b), t()).apply($$0, dkz::new));
   public static final eao b = eae.bd;
   private static final Map<cxq, dlu> c = Maps.newHashMap();
   private static final feq d = dlu.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(cxq $$0, dzn.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d;
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, Integer.valueOf(eau.a($$0.i() + 180.0F)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   public static dlu a(cxq $$0) {
      return c.getOrDefault($$0, dlw.jh);
   }
}
