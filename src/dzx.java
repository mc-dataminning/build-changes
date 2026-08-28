import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dzx(alf<ezt> d, double e, double f, czk g, Optional<alf<ezt>> h, dzo i, dzo.a j) {
   static final String a = "config";
   static dzx b = new dzx();
   static Codec<dzx> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ezt.a.lenientOptionalFieldOf("loot_table", b.b()).forGetter(dzx::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dzx::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dzx::d),
                  czk.a("key_item").forGetter(dzx::e),
                  ezt.a.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dzx::f)
               )
               .apply($$0, dzx::new)
      )
      .validate(dzx::h);

   private dzx() {
      this(ezk.R, 4.0, 4.5, new czk(czo.zO), Optional.empty(), dzo.b, dzo.a.a);
   }

   public dzx(alf<ezt> $$0, double $$1, double $$2, czk $$3, Optional<alf<ezt>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dzo a() {
      return this.i;
   }

   private DataResult<dzx> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alf<ezt> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public czk e() {
      return this.g;
   }

   public Optional<alf<ezt>> f() {
      return this.h;
   }

   public dzo.a g() {
      return this.j;
   }
}
