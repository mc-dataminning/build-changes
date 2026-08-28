import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record drv(akj<erb> d, double e, double f, cud g, Optional<akj<erb>> h, drn i, drn.a j) {
   static final String a = "config";
   static drv b = new drv();
   static Codec<drv> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akj.a(lr.bb).lenientOptionalFieldOf("loot_table", b.b()).forGetter(drv::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(drv::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(drv::d),
                  cud.a("key_item").forGetter(drv::e),
                  akj.a(lr.bb).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(drv::f)
               )
               .apply($$0, drv::new)
      )
      .validate(drv::h);

   private drv() {
      this(eqs.S, 4.0, 4.5, new cud(cug.yC), Optional.empty(), drn.b, drn.a.a);
   }

   public drv(akj<erb> $$0, double $$1, double $$2, cud $$3, Optional<akj<erb>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public drn a() {
      return this.i;
   }

   private DataResult<drv> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akj<erb> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cud e() {
      return this.g;
   }

   public Optional<akj<erb>> f() {
      return this.h;
   }

   public drn.a g() {
      return this.j;
   }
}
