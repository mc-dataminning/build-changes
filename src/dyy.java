import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dyy(ald<eys> d, double e, double f, cys g, Optional<ald<eys>> h, dyp i, dyp.a j) {
   static final String a = "config";
   static dyy b = new dyy();
   static Codec<dyy> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a(mg.bo).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dyy::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dyy::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dyy::d),
                  cys.a("key_item").forGetter(dyy::e),
                  ald.a(mg.bo).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dyy::f)
               )
               .apply($$0, dyy::new)
      )
      .validate(dyy::h);

   private dyy() {
      this(eyj.R, 4.0, 4.5, new cys(cyw.zH), Optional.empty(), dyp.b, dyp.a.a);
   }

   public dyy(ald<eys> $$0, double $$1, double $$2, cys $$3, Optional<ald<eys>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dyp a() {
      return this.i;
   }

   private DataResult<dyy> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public ald<eys> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cys e() {
      return this.g;
   }

   public Optional<ald<eys>> f() {
      return this.h;
   }

   public dyp.a g() {
      return this.j;
   }
}
