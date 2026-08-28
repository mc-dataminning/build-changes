import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eaz(alq<fay> d, double e, double f, dak g, Optional<alq<fay>> h, eaq i, eaq.a j) {
   static final String a = "config";
   static eaz b = new eaz();
   static Codec<eaz> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  fay.a.lenientOptionalFieldOf("loot_table", b.b()).forGetter(eaz::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(eaz::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(eaz::d),
                  dak.a("key_item").forGetter(eaz::e),
                  fay.a.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(eaz::f)
               )
               .apply($$0, eaz::new)
      )
      .validate(eaz::h);

   private eaz() {
      this(fap.R, 4.0, 4.5, new dak(dao.zO), Optional.empty(), eaq.b, eaq.a.a);
   }

   public eaz(alq<fay> $$0, double $$1, double $$2, dak $$3, Optional<alq<fay>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public eaq a() {
      return this.i;
   }

   private DataResult<eaz> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alq<fay> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public dak e() {
      return this.g;
   }

   public Optional<alq<fay>> f() {
      return this.h;
   }

   public eaq.a g() {
      return this.j;
   }
}
