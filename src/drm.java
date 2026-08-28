import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record drm(ale<eqn> d, double e, double f, cup g, Optional<ale<eqn>> h, dre i, dre.a j) {
   static final String a = "config";
   static drm b = new drm();
   static Codec<drm> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a(lq.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(drm::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(drm::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(drm::d),
                  cup.a("key_item").forGetter(drm::e),
                  ale.a(lq.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(drm::f)
               )
               .apply($$0, drm::new)
      )
      .validate(drm::h);

   private drm() {
      this(eqe.S, 4.0, 4.5, new cup(cus.yz), Optional.empty(), dre.b, dre.a.a);
   }

   public drm(ale<eqn> $$0, double $$1, double $$2, cup $$3, Optional<ale<eqn>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dre a() {
      return this.i;
   }

   private DataResult<drm> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ale<eqn> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cup e() {
      return this.g;
   }

   public Optional<ale<eqn>> f() {
      return this.h;
   }

   public dre.a g() {
      return this.j;
   }
}
