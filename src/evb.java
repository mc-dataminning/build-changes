import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evb(jm<dfy> b, Optional<eb> c) implements evc {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lt.e.s().fieldOf("block").forGetter(evb::c), eb.a.optionalFieldOf("properties").forGetter(evb::d)).apply($$0, evb::new)
      )
      .validate(evb::a);

   private static DataResult<evb> a(evb $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public evd b() {
      return eve.i;
   }

   @Override
   public Set<euk<?>> a() {
      return Set.of(eun.g);
   }

   public boolean a(err $$0) {
      dtc $$1 = $$0.c(eun.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static evb.a a(dfy $$0) {
      return new evb.a($$0);
   }

   public jm<dfy> c() {
      return this.b;
   }

   public Optional<eb> d() {
      return this.c;
   }

   public static class a implements evc.a {
      private final jm<dfy> a;
      private Optional<eb> b = Optional.empty();

      public a(dfy $$0) {
         this.a = $$0.s();
      }

      public evb.a a(eb.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public evc build() {
         return new evb(this.a, this.b);
      }
   }
}
