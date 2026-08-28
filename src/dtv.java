import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtv extends dta {
   public static final MapCodec<dtv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ebc.a.fieldOf("wood_type").forGetter(dta::d), t()).apply($$0, dtv::new));
   public static final eao b = eae.bd;

   @Override
   public MapCodec<dtv> a() {
      return a;
   }

   public dtv(ebc $$0, dzn.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(eau.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == evw.c));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dzo $$0) {
      return eau.b($$0.c(b));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, d);
   }
}
