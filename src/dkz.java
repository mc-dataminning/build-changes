import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkz extends dke {
   public static final MapCodec<dkz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dru.a.fieldOf("wood_type").forGetter(dke::d), u()).apply($$0, dkz::new));
   public static final drh b = dqx.ba;

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(dru $$0, dqg.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(drn.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == emb.c));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !this.a($$0, $$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dqh $$0) {
      return drn.b($$0.c(b));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, f);
   }
}
