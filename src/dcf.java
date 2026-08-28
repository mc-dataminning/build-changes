import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcf(dbz d, dbz e, jq<bsw> f) implements dcj {
   public static final MapCodec<dcf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbz.b.fieldOf("min_damage").forGetter(dcf::b), dbz.b.fieldOf("max_damage").forGetter(dcf::c), bsw.b.fieldOf("damage_type").forGetter(dcf::d)
            )
            .apply($$0, dcf::new)
   );

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      float $$5 = azk.b($$3.ea(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bsu(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   public dbz b() {
      return this.d;
   }

   public dbz c() {
      return this.e;
   }

   public jq<bsw> d() {
      return this.f;
   }
}
