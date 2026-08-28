import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ett(ji<dfb> b, Optional<dx> c) implements etu {
   public static final MapCodec<ett> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lp.e.r().fieldOf("block").forGetter(ett::c), dx.a.optionalFieldOf("properties").forGetter(ett::d)).apply($$0, ett::new)
      )
      .validate(ett::a);

   private static DataResult<ett> a(ett $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public etv b() {
      return etw.k;
   }

   @Override
   public Set<etd<?>> a() {
      return Set.of(etg.g);
   }

   public boolean a(eqk $$0) {
      dse $$1 = $$0.c(etg.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ett.a a(dfb $$0) {
      return new ett.a($$0);
   }

   public ji<dfb> c() {
      return this.b;
   }

   public Optional<dx> d() {
      return this.c;
   }

   public static class a implements etu.a {
      private final ji<dfb> a;
      private Optional<dx> b = Optional.empty();

      public a(dfb $$0) {
         this.a = $$0.s();
      }

      public ett.a a(dx.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public etu build() {
         return new ett(this.a, this.b);
      }
   }
}
