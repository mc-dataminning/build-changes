import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsj extends dro {
   public static final MapCodec<dsj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzg.a.fieldOf("wood_type").forGetter(dro::d), t()).apply($$0, dsj::new));
   public static final dyt b = dyk.bb;

   @Override
   public MapCodec<dsj> a() {
      return a;
   }

   public dsj(dzg $$0, dxt.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dyz.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == etx.c));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxu $$0) {
      return dyz.b($$0.c(b));
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
      $$0.a(b, f);
   }
}
