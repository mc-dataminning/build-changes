import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dbm extends day {
   public static final MapCodec<dbm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cql.q.fieldOf("color").forGetter(day::b), u()).apply($$0, dbm::new));
   public static final dqi b = dpy.ba;
   private static final Map<cql, dch> c = Maps.newHashMap();
   private static final etc d = dch.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   public dbm(cql $$0, dph.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d;
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, Integer.valueOf(dqo.a($$0.i() + 180.0F)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   public static dch a(cql $$0) {
      return c.getOrDefault($$0, dcj.iJ);
   }
}
