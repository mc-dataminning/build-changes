import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcn extends dbs {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dij.a.fieldOf("wood_type").forGetter(dbs::d), t()).apply($$0, dcn::new));
   public static final dhw b = dhm.ba;

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public dcn(dij $$0, dgv.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dic.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == ech.c));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.a($$0, $$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgw $$0) {
      return dic.b($$0.c(b));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, f);
   }
}
