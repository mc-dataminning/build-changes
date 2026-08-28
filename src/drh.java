import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record drh(ala<eqi> d, double e, double f, cuk g, Optional<ala<eqi>> h, dqz i, dqz.a j) {
   static final String a = "config";
   static drh b = new drh();
   static Codec<drh> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ala.a(lq.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(drh::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(drh::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(drh::d),
                  cuk.a("key_item").forGetter(drh::e),
                  ala.a(lq.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(drh::f)
               )
               .apply($$0, drh::new)
      )
      .validate(drh::h);

   private drh() {
      this(epz.S, 4.0, 4.5, new cuk(cun.yz), Optional.empty(), dqz.b, dqz.a.a);
   }

   public drh(ala<eqi> $$0, double $$1, double $$2, cuk $$3, Optional<ala<eqi>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dqz a() {
      return this.i;
   }

   private DataResult<drh> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ala<eqi> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cuk e() {
      return this.g;
   }

   public Optional<ala<eqi>> f() {
      return this.h;
   }

   public dqz.a g() {
      return this.j;
   }
}
