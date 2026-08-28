import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dru(akj<eqz> d, double e, double f, cuc g, Optional<akj<eqz>> h, drm i, drm.a j) {
   static final String a = "config";
   static dru b = new dru();
   static Codec<dru> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akj.a(lr.bb).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dru::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dru::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dru::d),
                  cuc.a("key_item").forGetter(dru::e),
                  akj.a(lr.bb).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dru::f)
               )
               .apply($$0, dru::new)
      )
      .validate(dru::h);

   private dru() {
      this(eqq.S, 4.0, 4.5, new cuc(cuf.yC), Optional.empty(), drm.b, drm.a.a);
   }

   public dru(akj<eqz> $$0, double $$1, double $$2, cuc $$3, Optional<akj<eqz>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public drm a() {
      return this.i;
   }

   private DataResult<dru> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akj<eqz> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cuc e() {
      return this.g;
   }

   public Optional<akj<eqz>> f() {
      return this.h;
   }

   public drm.a g() {
      return this.j;
   }
}
