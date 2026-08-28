import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwg(aku<evv> d, double e, double f, cwo g, Optional<aku<evv>> h, dvx i, dvx.a j) {
   static final String a = "config";
   static dwg b = new dwg();
   static Codec<dwg> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a(mc.bg).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dwg::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dwg::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dwg::d),
                  cwo.a("key_item").forGetter(dwg::e),
                  aku.a(mc.bg).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dwg::f)
               )
               .apply($$0, dwg::new)
      )
      .validate(dwg::h);

   private dwg() {
      this(evm.R, 4.0, 4.5, new cwo(cws.zD), Optional.empty(), dvx.b, dvx.a.a);
   }

   public dwg(aku<evv> $$0, double $$1, double $$2, cwo $$3, Optional<aku<evv>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dvx a() {
      return this.i;
   }

   private DataResult<dwg> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public aku<evv> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cwo e() {
      return this.g;
   }

   public Optional<aku<evv>> f() {
      return this.h;
   }

   public dvx.a g() {
      return this.j;
   }
}
