import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyz(jr<djm> b, Optional<ef> c) implements eza {
   public static final MapCodec<eyz> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mb.e.r().fieldOf("block").forGetter(eyz::c), ef.a.optionalFieldOf("properties").forGetter(eyz::d)).apply($$0, eyz::new)
      )
      .validate(eyz::a);

   private static DataResult<eyz> a(eyz $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ezb b() {
      return ezc.i;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.g);
   }

   public boolean a(evr $$0) {
      dwx $$1 = $$0.c(eyl.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eyz.a a(djm $$0) {
      return new eyz.a($$0);
   }

   public jr<djm> c() {
      return this.b;
   }

   public Optional<ef> d() {
      return this.c;
   }

   public static class a implements eza.a {
      private final jr<djm> a;
      private Optional<ef> b = Optional.empty();

      public a(djm $$0) {
         this.a = $$0.p();
      }

      public eyz.a a(ef.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eza build() {
         return new eyz(this.a, this.b);
      }
   }
}
