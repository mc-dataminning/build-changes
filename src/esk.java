import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record esk(ix<ddy> b, Optional<dl> c) implements esl {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(le.e.r().fieldOf("block").forGetter(esk::c), dl.a.optionalFieldOf("properties").forGetter(esk::d)).apply($$0, esk::new)
      )
      .validate(esk::a);

   private static DataResult<esk> a(esk $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().m()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public esm b() {
      return esn.k;
   }

   @Override
   public Set<eru<?>> a() {
      return Set.of(erx.g);
   }

   public boolean a(epf $$0) {
      drb $$1 = $$0.c(erx.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static esk.a a(ddy $$0) {
      return new esk.a($$0);
   }

   public ix<ddy> c() {
      return this.b;
   }

   public Optional<dl> d() {
      return this.c;
   }

   public static class a implements esl.a {
      private final ix<ddy> a;
      private Optional<dl> b = Optional.empty();

      public a(ddy $$0) {
         this.a = $$0.r();
      }

      public esk.a a(dl.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public esl build() {
         return new esk(this.a, this.b);
      }
   }
}
