import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fat(js<dku> b, Optional<ef> c) implements fau {
   public static final MapCodec<fat> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(md.e.r().fieldOf("block").forGetter(fat::c), ef.a.optionalFieldOf("properties").forGetter(fat::d)).apply($$0, fat::new)
      )
      .validate(fat::a);

   private static DataResult<fat> a(fat $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fav b() {
      return faw.i;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.g);
   }

   public boolean a(exl $$0) {
      dym $$1 = $$0.c(faf.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fat.a a(dku $$0) {
      return new fat.a($$0);
   }

   public js<dku> c() {
      return this.b;
   }

   public Optional<ef> d() {
      return this.c;
   }

   public static class a implements fau.a {
      private final js<dku> a;
      private Optional<ef> b = Optional.empty();

      public a(dku $$0) {
         this.a = $$0.p();
      }

      public fat.a a(ef.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fau build() {
         return new fat(this.a, this.b);
      }
   }
}
