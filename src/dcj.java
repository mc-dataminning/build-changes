import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dcj extends dbv {
   public static final MapCodec<dcj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(crs.q.fieldOf("color").forGetter(dbv::b), u()).apply($$0, dcj::new));
   public static final drh b = dqx.ba;
   private static final Map<crs, dde> c = Maps.newHashMap();
   private static final eui d = dde.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public dcj(crs $$0, dqg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d;
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, Integer.valueOf(drn.a($$0.i() + 180.0F)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   public static dde a(crs $$0) {
      return c.getOrDefault($$0, ddg.iJ);
   }
}
