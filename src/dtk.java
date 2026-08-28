import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dtk(ala<esy> d, double e, double f, cvl g, Optional<ala<esy>> h, dtc i, dtc.a j) {
   static final String a = "config";
   static dtk b = new dtk();
   static Codec<dtk> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ala.a(lv.bc).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dtk::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dtk::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dtk::d),
                  cvl.a("key_item").forGetter(dtk::e),
                  ala.a(lv.bc).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dtk::f)
               )
               .apply($$0, dtk::new)
      )
      .validate(dtk::h);

   private dtk() {
      this(esp.S, 4.0, 4.5, new cvl(cvo.yF), Optional.empty(), dtc.b, dtc.a.a);
   }

   public dtk(ala<esy> $$0, double $$1, double $$2, cvl $$3, Optional<ala<esy>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dtc a() {
      return this.i;
   }

   private DataResult<dtk> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ala<esy> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cvl e() {
      return this.g;
   }

   public Optional<ala<esy>> f() {
      return this.h;
   }

   public dtc.a g() {
      return this.j;
   }
}
