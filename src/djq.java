import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djq extends djc {
   public static final MapCodec<djq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwl.q.fieldOf("color").forGetter(djc::b), t()).apply($$0, djq::new));
   public static final dyt b = dyk.bb;
   private static final Map<cwl, dkl> c = Maps.newHashMap();
   private static final fcr d = dkl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(cwl $$0, dxt.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return d;
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, Integer.valueOf(dyz.a($$0.i() + 180.0F)));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   public static dkl a(cwl $$0) {
      return c.getOrDefault($$0, dkn.ja);
   }
}
