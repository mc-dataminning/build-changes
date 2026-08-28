import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dna extends dmf {
   public static final MapCodec<dna> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtu.a.fieldOf("wood_type").forGetter(dmf::d), u()).apply($$0, dna::new));
   public static final dth b = dsx.ba;

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   public dna(dtu $$0, dsg.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dtn.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eoc.c));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !this.a($$0, $$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsh $$0) {
      return dtn.b($$0.c(b));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, f);
   }
}
