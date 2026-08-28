import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezg(Optional<Long> b, evo c) implements eyy {
   public static final MapCodec<ezg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(ezg::c), evo.a.fieldOf("value").forGetter(ezg::d)).apply($$0, ezg::new)
   );

   @Override
   public eyz b() {
      return eza.q;
   }

   @Override
   public Set<bah<?>> a() {
      return this.c.a();
   }

   public boolean a(evp $$0) {
      arc $$1 = $$0.d();
      long $$2 = $$1.ae();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ezg.a a(evo $$0) {
      return new ezg.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public evo d() {
      return this.c;
   }

   public static class a implements eyy.a {
      private Optional<Long> a = Optional.empty();
      private final evo b;

      public a(evo $$0) {
         this.b = $$0;
      }

      public ezg.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezg a() {
         return new ezg(this.a, this.b);
      }
   }
}
