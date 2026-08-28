import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djj extends div {
   public static final MapCodec<djj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwh.q.fieldOf("color").forGetter(div::b), t()).apply($$0, djj::new));
   public static final dym b = dyd.bb;
   private static final Map<cwh, dke> c = Maps.newHashMap();
   private static final fcm d = dke.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(cwh $$0, dxm.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return d;
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, Integer.valueOf(dys.a($$0.i() + 180.0F)));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   public static dke a(cwh $$0) {
      return c.getOrDefault($$0, dkg.ja);
   }
}
