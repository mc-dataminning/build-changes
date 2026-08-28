import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe extends dpj {
   public static final MapCodec<dqe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxa.a.fieldOf("wood_type").forGetter(dpj::d), t()).apply($$0, dqe::new));
   public static final dwn b = dwe.ba;

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   public dqe(dxa $$0, dvn.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(dwt.a($$0.i() + 180.0F))).b(f, Boolean.valueOf($$1.a() == erp.c));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvo $$0) {
      return dwt.b($$0.c(b));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, f);
   }
}
