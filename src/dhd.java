import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhd extends dgp {
   public static final MapCodec<dhd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuu.q.fieldOf("color").forGetter(dgp::b), t()).apply($$0, dhd::new));
   public static final dwd b = dvt.ba;
   private static final Map<cuu, dhy> c = Maps.newHashMap();
   private static final fab d = dhy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public dhd(cuu $$0, dvc.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d;
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, Integer.valueOf(dwj.a($$0.i() + 180.0F)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.a && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   public static dhy a(cuu $$0) {
      return c.getOrDefault($$0, dia.iJ);
   }
}
