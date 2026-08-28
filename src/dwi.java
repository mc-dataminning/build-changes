import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwi(aku<evx> d, double e, double f, cwq g, Optional<aku<evx>> h, dvz i, dvz.a j) {
   static final String a = "config";
   static dwi b = new dwi();
   static Codec<dwi> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a(mc.bg).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dwi::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dwi::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dwi::d),
                  cwq.a("key_item").forGetter(dwi::e),
                  aku.a(mc.bg).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dwi::f)
               )
               .apply($$0, dwi::new)
      )
      .validate(dwi::h);

   private dwi() {
      this(evo.R, 4.0, 4.5, new cwq(cwu.zD), Optional.empty(), dvz.b, dvz.a.a);
   }

   public dwi(aku<evx> $$0, double $$1, double $$2, cwq $$3, Optional<aku<evx>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dvz a() {
      return this.i;
   }

   private DataResult<dwi> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public aku<evx> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cwq e() {
      return this.g;
   }

   public Optional<aku<evx>> f() {
      return this.h;
   }

   public dvz.a g() {
      return this.j;
   }
}
