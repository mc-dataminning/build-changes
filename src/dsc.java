import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsc extends drh {
   public static final MapCodec<dsc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyz.a.fieldOf("wood_type").forGetter(drh::d), t()).apply($$0, dsc::new));
   public static final dym b = dyd.bb;

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   public dsc(dyz $$0, dxm.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dys.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == etq.c));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxn $$0) {
      return dys.b($$0.c(b));
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
      $$0.a(b, f);
   }
}
