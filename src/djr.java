import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djr extends djd {
   public static final MapCodec<djr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwm.q.fieldOf("color").forGetter(djd::b), t()).apply($$0, djr::new));
   public static final dyu b = dyl.bb;
   private static final Map<cwm, dkm> c = Maps.newHashMap();
   private static final fcs d = dkm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   public djr(cwm $$0, dxu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return d;
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, Integer.valueOf(dza.a($$0.i() + 180.0F)));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   public static dkm a(cwm $$0) {
      return c.getOrDefault($$0, dko.ja);
   }
}
