import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ean(alh<fam> d, double e, double f, czy g, Optional<alh<fam>> h, eae i, eae.a j) {
   static final String a = "config";
   static ean b = new ean();
   static Codec<ean> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  fam.a.lenientOptionalFieldOf("loot_table", b.b()).forGetter(ean::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(ean::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(ean::d),
                  czy.a("key_item").forGetter(ean::e),
                  fam.a.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(ean::f)
               )
               .apply($$0, ean::new)
      )
      .validate(ean::h);

   private ean() {
      this(fad.R, 4.0, 4.5, new czy(dac.zO), Optional.empty(), eae.b, eae.a.a);
   }

   public ean(alh<fam> $$0, double $$1, double $$2, czy $$3, Optional<alh<fam>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public eae a() {
      return this.i;
   }

   private DataResult<ean> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alh<fam> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public czy e() {
      return this.g;
   }

   public Optional<alh<fam>> f() {
      return this.h;
   }

   public eae.a g() {
      return this.j;
   }
}
