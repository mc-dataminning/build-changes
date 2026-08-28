import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djz extends djl {
   public static final MapCodec<djz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwv.q.fieldOf("color").forGetter(djl::b), t()).apply($$0, djz::new));
   public static final dzm b = dzc.bd;
   private static final Map<cwv, dku> c = Maps.newHashMap();
   private static final fdo d = dku.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(cwv $$0, dyl.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d;
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, Integer.valueOf(dzs.a($$0.i() + 180.0F)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   public static dku a(cwv $$0) {
      return c.getOrDefault($$0, dkw.jh);
   }
}
