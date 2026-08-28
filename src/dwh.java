import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwh(akt<evw> d, double e, double f, cwp g, Optional<akt<evw>> h, dvy i, dvy.a j) {
   static final String a = "config";
   static dwh b = new dwh();
   static Codec<dwh> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akt.a(mc.bg).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dwh::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dwh::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dwh::d),
                  cwp.a("key_item").forGetter(dwh::e),
                  akt.a(mc.bg).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dwh::f)
               )
               .apply($$0, dwh::new)
      )
      .validate(dwh::h);

   private dwh() {
      this(evn.R, 4.0, 4.5, new cwp(cwt.zD), Optional.empty(), dvy.b, dvy.a.a);
   }

   public dwh(akt<evw> $$0, double $$1, double $$2, cwp $$3, Optional<akt<evw>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dvy a() {
      return this.i;
   }

   private DataResult<dwh> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akt<evw> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cwp e() {
      return this.g;
   }

   public Optional<akt<evw>> f() {
      return this.h;
   }

   public dvy.a g() {
      return this.j;
   }
}
