import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends dla {
   public static final MapCodec<dlv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dsq.a.fieldOf("wood_type").forGetter(dla::d), u()).apply($$0, dlv::new));
   public static final dsd b = drt.ba;

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(dsq $$0, drc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(dsj.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == emx.c));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !this.a($$0, $$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drd $$0) {
      return dsj.b($$0.c(b));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, f);
   }
}
