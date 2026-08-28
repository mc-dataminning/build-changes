import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwy(alo<ewn> d, double e, double f, cxg g, Optional<alo<ewn>> h, dwp i, dwp.a j) {
   static final String a = "config";
   static dwy b = new dwy();
   static Codec<dwy> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alo.a(mb.bg).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dwy::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dwy::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dwy::d),
                  cxg.a("key_item").forGetter(dwy::e),
                  alo.a(mb.bg).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dwy::f)
               )
               .apply($$0, dwy::new)
      )
      .validate(dwy::h);

   private dwy() {
      this(ewe.R, 4.0, 4.5, new cxg(cxk.zD), Optional.empty(), dwp.b, dwp.a.a);
   }

   public dwy(alo<ewn> $$0, double $$1, double $$2, cxg $$3, Optional<alo<ewn>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dwp a() {
      return this.i;
   }

   private DataResult<dwy> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alo<ewn> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cxg e() {
      return this.g;
   }

   public Optional<alo<ewn>> f() {
      return this.h;
   }

   public dwp.a g() {
      return this.j;
   }
}
