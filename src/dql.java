import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dql(akl<epk> d, double e, double f, cto g, Optional<akl<epk>> h, dqd i, dqd.a j) {
   static final String a = "config";
   static dql b = new dql();
   static Codec<dql> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akl.a(lf.aU).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dql::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dql::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dql::d),
                  cto.a("key_item").forGetter(dql::e),
                  akl.a(lf.aU).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dql::f)
               )
               .apply($$0, dql::new)
      )
      .validate(dql::h);

   private dql() {
      this(epd.S, 4.0, 4.5, new cto(ctr.yz), Optional.empty(), dqd.b, dqd.a.a);
   }

   public dql(akl<epk> $$0, double $$1, double $$2, cto $$3, Optional<akl<epk>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dqd a() {
      return this.i;
   }

   private DataResult<dql> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akl<epk> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cto e() {
      return this.g;
   }

   public Optional<akl<epk>> f() {
      return this.h;
   }

   public dqd.a g() {
      return this.j;
   }
}
