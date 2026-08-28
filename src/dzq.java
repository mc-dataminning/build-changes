import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dzq(alf<ezm> d, double e, double f, czd g, Optional<alf<ezm>> h, dzh i, dzh.a j) {
   static final String a = "config";
   static dzq b = new dzq();
   static Codec<dzq> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alf.a(mg.bq).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dzq::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dzq::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dzq::d),
                  czd.a("key_item").forGetter(dzq::e),
                  alf.a(mg.bq).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dzq::f)
               )
               .apply($$0, dzq::new)
      )
      .validate(dzq::h);

   private dzq() {
      this(ezd.R, 4.0, 4.5, new czd(czh.zO), Optional.empty(), dzh.b, dzh.a.a);
   }

   public dzq(alf<ezm> $$0, double $$1, double $$2, czd $$3, Optional<alf<ezm>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dzh a() {
      return this.i;
   }

   private DataResult<dzq> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alf<ezm> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public czd e() {
      return this.g;
   }

   public Optional<alf<ezm>> f() {
      return this.h;
   }

   public dzh.a g() {
      return this.j;
   }
}
