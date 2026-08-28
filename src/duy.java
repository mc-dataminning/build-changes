import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record duy(alk<eul> d, double e, double f, cwf g, Optional<alk<eul>> h, dup i, dup.a j) {
   static final String a = "config";
   static duy b = new duy();
   static Codec<duy> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alk.a(ma.bd).lenientOptionalFieldOf("loot_table", b.b()).forGetter(duy::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(duy::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(duy::d),
                  cwf.a("key_item").forGetter(duy::e),
                  alk.a(ma.bd).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(duy::f)
               )
               .apply($$0, duy::new)
      )
      .validate(duy::h);

   private duy() {
      this(euc.R, 4.0, 4.5, new cwf(cwj.yV), Optional.empty(), dup.b, dup.a.a);
   }

   public duy(alk<eul> $$0, double $$1, double $$2, cwf $$3, Optional<alk<eul>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dup a() {
      return this.i;
   }

   private DataResult<duy> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alk<eul> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cwf e() {
      return this.g;
   }

   public Optional<alk<eul>> f() {
      return this.h;
   }

   public dup.a g() {
      return this.j;
   }
}
