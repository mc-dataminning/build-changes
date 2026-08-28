import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record drr(akj<eqt> d, double e, double f, cua g, Optional<akj<eqt>> h, drj i, drj.a j) {
   static final String a = "config";
   static drr b = new drr();
   static Codec<drr> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akj.a(lr.bb).lenientOptionalFieldOf("loot_table", b.b()).forGetter(drr::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(drr::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(drr::d),
                  cua.a("key_item").forGetter(drr::e),
                  akj.a(lr.bb).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(drr::f)
               )
               .apply($$0, drr::new)
      )
      .validate(drr::h);

   private drr() {
      this(eqk.S, 4.0, 4.5, new cua(cud.yC), Optional.empty(), drj.b, drj.a.a);
   }

   public drr(akj<eqt> $$0, double $$1, double $$2, cua $$3, Optional<akj<eqt>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public drj a() {
      return this.i;
   }

   private DataResult<drr> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akj<eqt> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cua e() {
      return this.g;
   }

   public Optional<akj<eqt>> f() {
      return this.h;
   }

   public drj.a g() {
      return this.j;
   }
}
