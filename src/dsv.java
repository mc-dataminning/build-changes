import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsv extends dsa {
   public static final MapCodec<dsv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eaa.a.fieldOf("wood_type").forGetter(dsa::d), t()).apply($$0, dsv::new));
   public static final dzm b = dzc.bd;

   @Override
   public MapCodec<dsv> a() {
      return a;
   }

   public dsv(eaa $$0, dyl.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dzs.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == euu.c));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !this.a($$0, $$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dym $$0) {
      return dzs.b($$0.c(b));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, d);
   }
}
