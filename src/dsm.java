import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dsm(akq<eru> d, double e, double f, cuq g, Optional<akq<eru>> h, dse i, dse.a j) {
   static final String a = "config";
   static dsm b = new dsm();
   static Codec<dsm> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akq.a(lu.bc).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dsm::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dsm::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dsm::d),
                  cuq.a("key_item").forGetter(dsm::e),
                  akq.a(lu.bc).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dsm::f)
               )
               .apply($$0, dsm::new)
      )
      .validate(dsm::h);

   private dsm() {
      this(erl.S, 4.0, 4.5, new cuq(cut.yC), Optional.empty(), dse.b, dse.a.a);
   }

   public dsm(akq<eru> $$0, double $$1, double $$2, cuq $$3, Optional<akq<eru>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dse a() {
      return this.i;
   }

   private DataResult<dsm> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public akq<eru> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cuq e() {
      return this.g;
   }

   public Optional<akq<eru>> f() {
      return this.h;
   }

   public dse.a g() {
      return this.j;
   }
}
