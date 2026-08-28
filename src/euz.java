import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euz(jm<dfy> b, Optional<eb> c) implements eva {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lt.e.s().fieldOf("block").forGetter(euz::c), eb.a.optionalFieldOf("properties").forGetter(euz::d)).apply($$0, euz::new)
      )
      .validate(euz::a);

   private static DataResult<euz> a(euz $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public evb b() {
      return evc.i;
   }

   @Override
   public Set<eui<?>> a() {
      return Set.of(eul.g);
   }

   public boolean a(erp $$0) {
      dtc $$1 = $$0.c(eul.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static euz.a a(dfy $$0) {
      return new euz.a($$0);
   }

   public jm<dfy> c() {
      return this.b;
   }

   public Optional<eb> d() {
      return this.c;
   }

   public static class a implements eva.a {
      private final jm<dfy> a;
      private Optional<eb> b = Optional.empty();

      public a(dfy $$0) {
         this.a = $$0.s();
      }

      public euz.a a(eb.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eva build() {
         return new euz(this.a, this.b);
      }
   }
}
