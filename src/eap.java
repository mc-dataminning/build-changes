import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eap(alj<fao> d, double e, double f, daa g, Optional<alj<fao>> h, eag i, eag.a j) {
   static final String a = "config";
   static eap b = new eap();
   static Codec<eap> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  fao.a.lenientOptionalFieldOf("loot_table", b.b()).forGetter(eap::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(eap::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(eap::d),
                  daa.a("key_item").forGetter(eap::e),
                  fao.a.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(eap::f)
               )
               .apply($$0, eap::new)
      )
      .validate(eap::h);

   private eap() {
      this(faf.R, 4.0, 4.5, new daa(dae.zO), Optional.empty(), eag.b, eag.a.a);
   }

   public eap(alj<fao> $$0, double $$1, double $$2, daa $$3, Optional<alj<fao>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public eag a() {
      return this.i;
   }

   private DataResult<eap> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alj<fao> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public daa e() {
      return this.g;
   }

   public Optional<alj<fao>> f() {
      return this.h;
   }

   public eag.a g() {
      return this.j;
   }
}
