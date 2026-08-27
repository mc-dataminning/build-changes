import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbt extends day {
   public static final MapCodec<dbt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dho.a.fieldOf("wood_type").forGetter(day::d), t()).apply($$0, dbt::new));
   public static final dhb b = dgr.ba;

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   public dbt(dho $$0, dga.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dhh.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == ebf.c));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.a($$0, $$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgb $$0) {
      return dhh.b($$0.c(b));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, f);
   }
}
