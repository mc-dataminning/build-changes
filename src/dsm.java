import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dsm(aks<eru> d, double e, double f, cuh g, Optional<aks<eru>> h, dse i, dse.a j) {
   static final String a = "config";
   static dsm b = new dsm();
   static Codec<dsm> c = axu.b(
      RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aks.a(li.aU).optionalFieldOf("loot_table", b.b()).forGetter(dsm::b),
                  Codec.DOUBLE.optionalFieldOf("activation_range", b.c()).forGetter(dsm::c),
                  Codec.DOUBLE.optionalFieldOf("deactivation_range", b.d()).forGetter(dsm::d),
                  cuh.a("key_item").forGetter(dsm::e),
                  aks.a(li.aU).optionalFieldOf("override_loot_table_to_display").forGetter(dsm::f)
               )
               .apply($$0, dsm::new)
      ),
      dsm::h
   );

   private dsm() {
      this(ern.V, 4.0, 4.5, new cuh(cuk.Am), Optional.empty(), dse.b, dse.a.a);
   }

   public dsm(aks<eru> $$0, double $$1, double $$2, cuh $$3, Optional<aks<eru>> $$4) {
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

   public aks<eru> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cuh e() {
      return this.g;
   }

   public Optional<aks<eru>> f() {
      return this.h;
   }

   public dse.a g() {
      return this.j;
   }
}
