import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dqn(akm<epm> d, double e, double f, ctq g, Optional<akm<epm>> h, dqf i, dqf.a j) {
   static final String a = "config";
   static dqn b = new dqn();
   static Codec<dqn> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akm.a(lf.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dqn::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dqn::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dqn::d),
                  ctq.a("key_item").forGetter(dqn::e),
                  akm.a(lf.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dqn::f)
               )
               .apply($$0, dqn::new)
      )
      .validate(dqn::h);

   private dqn() {
      this(epf.S, 4.0, 4.5, new ctq(ctt.yz), Optional.empty(), dqf.b, dqf.a.a);
   }

   public dqn(akm<epm> $$0, double $$1, double $$2, ctq $$3, Optional<akm<epm>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dqf a() {
      return this.i;
   }

   private DataResult<dqn> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akm<epm> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public ctq e() {
      return this.g;
   }

   public Optional<akm<epm>> f() {
      return this.h;
   }

   public dqf.a g() {
      return this.j;
   }
}
