import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmw extends dmb {
   public static final MapCodec<dmw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtr.a.fieldOf("wood_type").forGetter(dmb::d), u()).apply($$0, dmw::new));
   public static final dte b = dsu.ba;

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dtr $$0, dsd.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dtk.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eny.c));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dse $$0) {
      return dtk.b($$0.c(b));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, f);
   }
}
