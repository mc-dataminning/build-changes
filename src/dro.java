import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dro(ale<eqp> d, double e, double f, cur g, Optional<ale<eqp>> h, drg i, drg.a j) {
   static final String a = "config";
   static dro b = new dro();
   static Codec<dro> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a(lq.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dro::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dro::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dro::d),
                  cur.a("key_item").forGetter(dro::e),
                  ale.a(lq.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dro::f)
               )
               .apply($$0, dro::new)
      )
      .validate(dro::h);

   private dro() {
      this(eqg.S, 4.0, 4.5, new cur(cuu.yz), Optional.empty(), drg.b, drg.a.a);
   }

   public dro(ale<eqp> $$0, double $$1, double $$2, cur $$3, Optional<ale<eqp>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public drg a() {
      return this.i;
   }

   private DataResult<dro> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ale<eqp> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cur e() {
      return this.g;
   }

   public Optional<ale<eqp>> f() {
      return this.h;
   }

   public drg.a g() {
      return this.j;
   }
}
