import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvt extends duy {
   public static final MapCodec<dvt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ede.a.fieldOf("wood_type").forGetter(duy::d), t()).apply($$0, dvt::new));
   public static final ecq b = ecg.bd;

   @Override
   public MapCodec<dvt> a() {
      return a;
   }

   public dvt(ede $$0, ebp.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(ecw.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == eyb.c));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !this.a($$0, $$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebq $$0) {
      return ecw.b($$0.c(b));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, d);
   }
}
