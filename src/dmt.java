import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmt extends dly {
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dto.a.fieldOf("wood_type").forGetter(dly::d), u()).apply($$0, dmt::new));
   public static final dtb b = dsr.ba;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(dto $$0, dsa.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dth.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == env.c));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsb $$0) {
      return dth.b($$0.c(b));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, f);
   }
}
