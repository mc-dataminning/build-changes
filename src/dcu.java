import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcu extends dbz {
   public static final MapCodec<dcu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(div.a.fieldOf("wood_type").forGetter(dbz::d), u()).apply($$0, dcu::new));
   public static final dii b = dhy.ba;

   @Override
   public MapCodec<dcu> a() {
      return a;
   }

   public dcu(div $$0, dhh.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dio.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == ect.c));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.a($$0, $$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhi $$0) {
      return dio.b($$0.c(b));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, f);
   }
}
