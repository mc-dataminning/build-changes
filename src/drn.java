import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record drn(ale<eqo> d, double e, double f, cuq g, Optional<ale<eqo>> h, drf i, drf.a j) {
   static final String a = "config";
   static drn b = new drn();
   static Codec<drn> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a(lq.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(drn::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(drn::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(drn::d),
                  cuq.a("key_item").forGetter(drn::e),
                  ale.a(lq.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(drn::f)
               )
               .apply($$0, drn::new)
      )
      .validate(drn::h);

   private drn() {
      this(eqf.S, 4.0, 4.5, new cuq(cut.yz), Optional.empty(), drf.b, drf.a.a);
   }

   public drn(ale<eqo> $$0, double $$1, double $$2, cuq $$3, Optional<ale<eqo>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public drf a() {
      return this.i;
   }

   private DataResult<drn> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ale<eqo> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cuq e() {
      return this.g;
   }

   public Optional<ale<eqo>> f() {
      return this.h;
   }

   public drf.a g() {
      return this.j;
   }
}
