import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dql extends dpq {
   public static final MapCodec<dql> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxh.a.fieldOf("wood_type").forGetter(dpq::d), t()).apply($$0, dql::new));
   public static final dwu b = dwl.ba;

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(dxh $$0, dvu.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dxa.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == erw.c));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvv $$0) {
      return dxa.b($$0.c(b));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, f);
   }
}
