import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record drk(ald<eql> d, double e, double f, cun g, Optional<ald<eql>> h, drc i, drc.a j) {
   static final String a = "config";
   static drk b = new drk();
   static Codec<drk> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a(lq.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(drk::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(drk::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(drk::d),
                  cun.a("key_item").forGetter(drk::e),
                  ald.a(lq.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(drk::f)
               )
               .apply($$0, drk::new)
      )
      .validate(drk::h);

   private drk() {
      this(eqc.S, 4.0, 4.5, new cun(cuq.yz), Optional.empty(), drc.b, drc.a.a);
   }

   public drk(ald<eql> $$0, double $$1, double $$2, cun $$3, Optional<ald<eql>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public drc a() {
      return this.i;
   }

   private DataResult<drk> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ald<eql> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cun e() {
      return this.g;
   }

   public Optional<ald<eql>> f() {
      return this.h;
   }

   public drc.a g() {
      return this.j;
   }
}
