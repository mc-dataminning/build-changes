import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dvf(ali<eus> d, double e, double f, cwm g, Optional<ali<eus>> h, duw i, duw.a j) {
   static final String a = "config";
   static dvf b = new dvf();
   static Codec<dvf> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a(ma.bd).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dvf::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dvf::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dvf::d),
                  cwm.a("key_item").forGetter(dvf::e),
                  ali.a(ma.bd).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dvf::f)
               )
               .apply($$0, dvf::new)
      )
      .validate(dvf::h);

   private dvf() {
      this(euj.R, 4.0, 4.5, new cwm(cwq.yV), Optional.empty(), duw.b, duw.a.a);
   }

   public dvf(ali<eus> $$0, double $$1, double $$2, cwm $$3, Optional<ali<eus>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public duw a() {
      return this.i;
   }

   private DataResult<dvf> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ali<eus> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cwm e() {
      return this.g;
   }

   public Optional<ali<eus>> f() {
      return this.h;
   }

   public duw.a g() {
      return this.j;
   }
}
