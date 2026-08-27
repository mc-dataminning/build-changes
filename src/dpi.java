import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dpi(akf d, double e, double f, csd g, Optional<akf> h, dpa i, dpa.a j) {
   static final String a = "config";
   static dpi b = new dpi();
   static Codec<dpi> c = axe.b(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akf.a.optionalFieldOf("loot_table", b.b()).forGetter(dpi::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(dpi::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(dpi::d),
                  csd.a("key_item").forGetter(dpi::e),
                  akf.a.optionalFieldOf("override_loot_table_to_display").forGetter(dpi::f)
               )
               .apply($$0, dpi::new)
      ),
      dpi::h
   );

   private dpi() {
      this(eny.S, 4.0, 4.5, new csd(csg.yz), Optional.empty(), dpa.b, dpa.a.a);
   }

   public dpi(akf $$0, double $$1, double $$2, csd $$3, Optional<akf> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dpa a() {
      return this.i;
   }

   private DataResult<dpi> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akf b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public csd e() {
      return this.g;
   }

   public Optional<akf> f() {
      return this.h;
   }

   public dpa.a g() {
      return this.j;
   }
}
