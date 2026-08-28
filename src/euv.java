import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euv(jm<dfw> b, Optional<eb> c) implements euw {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lt.e.s().fieldOf("block").forGetter(euv::c), eb.a.optionalFieldOf("properties").forGetter(euv::d)).apply($$0, euv::new)
      )
      .validate(euv::a);

   private static DataResult<euv> a(euv $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eux b() {
      return euy.i;
   }

   @Override
   public Set<eue<?>> a() {
      return Set.of(euh.g);
   }

   public boolean a(erl $$0) {
      dta $$1 = $$0.c(euh.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static euv.a a(dfw $$0) {
      return new euv.a($$0);
   }

   public jm<dfw> c() {
      return this.b;
   }

   public Optional<eb> d() {
      return this.c;
   }

   public static class a implements euw.a {
      private final jm<dfw> a;
      private Optional<eb> b = Optional.empty();

      public a(dfw $$0) {
         this.a = $$0.s();
      }

      public euv.a a(eb.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public euw build() {
         return new euv(this.a, this.b);
      }
   }
}
