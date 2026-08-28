import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eac(alf<ezy> d, double e, double f, czn g, Optional<alf<ezy>> h, dzt i, dzt.a j) {
   static final String a = "config";
   static eac b = new eac();
   static Codec<eac> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ezy.a.lenientOptionalFieldOf("loot_table", b.b()).forGetter(eac::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(eac::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(eac::d),
                  czn.a("key_item").forGetter(eac::e),
                  ezy.a.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(eac::f)
               )
               .apply($$0, eac::new)
      )
      .validate(eac::h);

   private eac() {
      this(ezp.R, 4.0, 4.5, new czn(czr.zO), Optional.empty(), dzt.b, dzt.a.a);
   }

   public eac(alf<ezy> $$0, double $$1, double $$2, czn $$3, Optional<alf<ezy>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dzt a() {
      return this.i;
   }

   private DataResult<eac> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alf<ezy> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public czn e() {
      return this.g;
   }

   public Optional<alf<ezy>> f() {
      return this.h;
   }

   public dzt.a g() {
      return this.j;
   }
}
