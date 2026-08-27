import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djs extends dix {
   public static final MapCodec<djs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqm.a.fieldOf("wood_type").forGetter(dix::d), u()).apply($$0, djs::new));
   public static final dpz b = dpp.ba;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dqm $$0, doy.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(dqf.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == ekt.c));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !this.a($$0, $$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(doz $$0) {
      return dqf.b($$0.c(b));
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, f);
   }
}
