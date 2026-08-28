import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class djj extends div {
   public static final MapCodec<djj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwe.q.fieldOf("color").forGetter(div::b), t()).apply($$0, djj::new));
   public static final dyq b = dyg.bd;
   private static final Map<cwe, dke> c = Maps.newHashMap();
   private static final fcr d = dke.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(cwe $$0, dxp.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d;
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, Integer.valueOf(dyw.a($$0.i() + 180.0F)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   public static dke a(cwe $$0) {
      return c.getOrDefault($$0, dkg.jh);
   }
}
