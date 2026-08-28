import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drl extends dqq {
   public static final MapCodec<drl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyi.a.fieldOf("wood_type").forGetter(dqq::d), t()).apply($$0, drl::new));
   public static final dxv b = dxm.bd;

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   public drl(dyi $$0, dwv.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dyb.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == esz.c));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !this.a($$0, $$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dww $$0) {
      return dyb.b($$0.c(b));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, f);
   }
}
