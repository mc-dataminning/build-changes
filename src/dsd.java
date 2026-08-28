import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsd extends dri {
   public static final MapCodec<dsd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dza.a.fieldOf("wood_type").forGetter(dri::d), t()).apply($$0, dsd::new));
   public static final dyn b = dye.bd;

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(dza $$0, dxn.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dyt.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == etr.c));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxo $$0) {
      return dyt.b($$0.c(b));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, f);
   }
}
