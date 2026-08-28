import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmv extends dma {
   public static final MapCodec<dmv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtq.a.fieldOf("wood_type").forGetter(dma::d), u()).apply($$0, dmv::new));
   public static final dtd b = dst.ba;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dtq $$0, dsc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dtj.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == enx.c));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsd $$0) {
      return dtj.b($$0.c(b));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, f);
   }
}
