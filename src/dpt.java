import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpt extends doy {
   public static final MapCodec<dpt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwq.a.fieldOf("wood_type").forGetter(doy::d), t()).apply($$0, dpt::new));
   public static final dwd b = dvt.ba;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dwq $$0, dvc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dwj.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == erf.c));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.a && !this.a($$0, $$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvd $$0) {
      return dwj.b($$0.c(b));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, f);
   }
}
