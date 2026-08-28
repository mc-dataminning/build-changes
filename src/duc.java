import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record duc(ald<etq> d, double e, double f, cvs g, Optional<ald<etq>> h, dtt i, dtt.a j) {
   static final String a = "config";
   static duc b = new duc();
   static Codec<duc> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a(lw.be).lenientOptionalFieldOf("loot_table", b.b()).forGetter(duc::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(duc::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(duc::d),
                  cvs.a("key_item").forGetter(duc::e),
                  ald.a(lw.be).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(duc::f)
               )
               .apply($$0, duc::new)
      )
      .validate(duc::h);

   private duc() {
      this(eth.R, 4.0, 4.5, new cvs(cvw.yF), Optional.empty(), dtt.b, dtt.a.a);
   }

   public duc(ald<etq> $$0, double $$1, double $$2, cvs $$3, Optional<ald<etq>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dtt a() {
      return this.i;
   }

   private DataResult<duc> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ald<etq> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cvs e() {
      return this.g;
   }

   public Optional<ald<etq>> f() {
      return this.h;
   }

   public dtt.a g() {
      return this.j;
   }
}
