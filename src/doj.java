import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record doj(ajt d, double e, double f, crj g, Optional<ajt> h, dob i, dob.a j) {
   static final String a = "config";
   static doj b = new doj();
   static Codec<doj> c = aws.b(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajt.a.optionalFieldOf("loot_table", b.b()).forGetter(doj::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(doj::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(doj::d),
                  crj.a("key_item").forGetter(doj::e),
                  ajt.a.optionalFieldOf("override_loot_table_to_display").forGetter(doj::f)
               )
               .apply($$0, doj::new)
      ),
      doj::h
   );

   private doj() {
      this(emz.S, 4.0, 4.5, new crj(crm.yq), Optional.empty(), dob.b, dob.a.a);
   }

   public doj(ajt $$0, double $$1, double $$2, crj $$3, Optional<ajt> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dob a() {
      return this.i;
   }

   private DataResult<doj> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ajt b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public crj e() {
      return this.g;
   }

   public Optional<ajt> f() {
      return this.h;
   }

   public dob.a g() {
      return this.j;
   }
}
