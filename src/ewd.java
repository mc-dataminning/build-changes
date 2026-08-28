import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewd(jn<dgv> b, Optional<eb> c) implements ewe {
   public static final MapCodec<ewd> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lu.e.r().fieldOf("block").forGetter(ewd::c), eb.a.optionalFieldOf("properties").forGetter(ewd::d)).apply($$0, ewd::new)
      )
      .validate(ewd::a);

   private static DataResult<ewd> a(ewd $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ewf b() {
      return ewg.i;
   }

   @Override
   public Set<evm<?>> a() {
      return Set.of(evp.g);
   }

   public boolean a(est $$0) {
      dua $$1 = $$0.c(evp.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ewd.a a(dgv $$0) {
      return new ewd.a($$0);
   }

   public jn<dgv> c() {
      return this.b;
   }

   public Optional<eb> d() {
      return this.c;
   }

   public static class a implements ewe.a {
      private final jn<dgv> a;
      private Optional<eb> b = Optional.empty();

      public a(dgv $$0) {
         this.a = $$0.s();
      }

      public ewd.a a(eb.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ewe build() {
         return new ewd(this.a, this.b);
      }
   }
}
