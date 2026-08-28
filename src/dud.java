import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dud extends dti {
   public static final MapCodec<dud> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebn.a.fieldOf("wood_type").forGetter(dti::d), t()).apply($$0, dud::new));
   public static final eaz b = eap.bd;

   @Override
   public MapCodec<dud> a() {
      return a;
   }

   public dud(ebn $$0, dzy.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(ebf.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == ewh.c));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzz $$0) {
      return ebf.b($$0.c(b));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, d);
   }
}
