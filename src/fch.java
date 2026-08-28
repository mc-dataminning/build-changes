import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fch(je<dma> b, Optional<dq> c) implements fci {
   public static final MapCodec<fch> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mf.e.r().fieldOf("block").forGetter(fch::c), dq.a.optionalFieldOf("properties").forGetter(fch::d)).apply($$0, fch::new)
      )
      .validate(fch::a);

   private static DataResult<fch> a(fch $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fcj b() {
      return fck.i;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.g);
   }

   public boolean a(eyz $$0) {
      dzz $$1 = $$0.c(fbt.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fch.a a(dma $$0) {
      return new fch.a($$0);
   }

   public je<dma> c() {
      return this.b;
   }

   public Optional<dq> d() {
      return this.c;
   }

   public static class a implements fci.a {
      private final je<dma> a;
      private Optional<dq> b = Optional.empty();

      public a(dma $$0) {
         this.a = $$0.p();
      }

      public fch.a a(dq.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fci build() {
         return new fch(this.a, this.b);
      }
   }
}
