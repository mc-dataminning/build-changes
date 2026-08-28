import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dur extends dtw {
   public static final MapCodec<dur> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecc.a.fieldOf("wood_type").forGetter(dtw::d), t()).apply($$0, dur::new));
   public static final ebo b = ebe.bd;

   @Override
   public MapCodec<dur> a() {
      return a;
   }

   public dur(ecc $$0, ean.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public eao a(ddd $$0) {
      ewv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(ebu.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == eww.c));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eao $$0) {
      return ebu.b($$0.c(b));
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, d);
   }
}
