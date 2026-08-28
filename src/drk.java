import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drk extends dqp {
   public static final MapCodec<drk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyh.a.fieldOf("wood_type").forGetter(dqp::d), t()).apply($$0, drk::new));
   public static final dxu b = dxl.bd;

   @Override
   public MapCodec<drk> a() {
      return a;
   }

   public drk(dyh $$0, dwu.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dya.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == esy.c));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwv $$0) {
      return dya.b($$0.c(b));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, f);
   }
}
