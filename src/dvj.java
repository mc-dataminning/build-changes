import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvj extends duo {
   public static final MapCodec<dvj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecu.a.fieldOf("wood_type").forGetter(duo::d), t()).apply($$0, dvj::new));
   public static final ecg b = ebw.bd;

   @Override
   public MapCodec<dvj> a() {
      return a;
   }

   public dvj(ecu $$0, ebf.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(ecm.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == exr.c));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !this.a($$0, $$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebg $$0) {
      return ecm.b($$0.c(b));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, d);
   }
}
