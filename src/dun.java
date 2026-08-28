import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dun(alg<eub> d, double e, double f, cvx g, Optional<alg<eub>> h, due i, due.a j) {
   static final String a = "config";
   static dun b = new dun();
   static Codec<dun> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a(ly.bd).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dun::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dun::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dun::d),
                  cvx.a("key_item").forGetter(dun::e),
                  alg.a(ly.bd).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dun::f)
               )
               .apply($$0, dun::new)
      )
      .validate(dun::h);

   private dun() {
      this(ets.R, 4.0, 4.5, new cvx(cwb.yF), Optional.empty(), due.b, due.a.a);
   }

   public dun(alg<eub> $$0, double $$1, double $$2, cvx $$3, Optional<alg<eub>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public due a() {
      return this.i;
   }

   private DataResult<dun> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public alg<eub> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cvx e() {
      return this.g;
   }

   public Optional<alg<eub>> f() {
      return this.h;
   }

   public due.a g() {
      return this.j;
   }
}
