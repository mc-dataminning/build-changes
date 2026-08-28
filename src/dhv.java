import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhv extends dhh {
   public static final MapCodec<dhv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvj.q.fieldOf("color").forGetter(dhh::b), t()).apply($$0, dhv::new));
   public static final dwu b = dwl.ba;
   private static final Map<cvj, diq> c = Maps.newHashMap();
   private static final fas d = diq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   public dhv(cvj $$0, dvu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d;
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, Integer.valueOf(dxa.a($$0.i() + 180.0F)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   public static diq a(cvj $$0) {
      return c.getOrDefault($$0, dis.iJ);
   }
}
