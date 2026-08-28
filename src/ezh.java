import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezh(Optional<Long> b, evp c) implements eyz {
   public static final MapCodec<ezh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(ezh::c), evp.a.fieldOf("value").forGetter(ezh::d)).apply($$0, ezh::new)
   );

   @Override
   public eza b() {
      return ezb.q;
   }

   @Override
   public Set<bai<?>> a() {
      return this.c.a();
   }

   public boolean a(evq $$0) {
      ard $$1 = $$0.d();
      long $$2 = $$1.ae();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ezh.a a(evp $$0) {
      return new ezh.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public evp d() {
      return this.c;
   }

   public static class a implements eyz.a {
      private Optional<Long> a = Optional.empty();
      private final evp b;

      public a(evp $$0) {
         this.b = $$0;
      }

      public ezh.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezh a() {
         return new ezh(this.a, this.b);
      }
   }
}
