import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmu extends dlz {
   public static final MapCodec<dmu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtp.a.fieldOf("wood_type").forGetter(dlz::d), u()).apply($$0, dmu::new));
   public static final dtc b = dss.ba;

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(dtp $$0, dsb.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dti.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == enw.c));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsc $$0) {
      return dti.b($$0.c(b));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, f);
   }
}
