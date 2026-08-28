import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsf extends drk {
   public static final MapCodec<dsf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzd.a.fieldOf("wood_type").forGetter(drk::d), t()).apply($$0, dsf::new));
   public static final dyq b = dyg.bd;

   @Override
   public MapCodec<dsf> a() {
      return a;
   }

   public dsf(dzd $$0, dxp.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dyw.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == etx.c));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxq $$0) {
      return dyw.b($$0.c(b));
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
      $$0.a(b, d);
   }
}
