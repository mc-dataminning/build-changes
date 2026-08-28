import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezi(Optional<Long> b, evq c) implements eza {
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(ezi::c), evq.a.fieldOf("value").forGetter(ezi::d)).apply($$0, ezi::new)
   );

   @Override
   public ezb b() {
      return ezc.q;
   }

   @Override
   public Set<bai<?>> a() {
      return this.c.a();
   }

   public boolean a(evr $$0) {
      ard $$1 = $$0.d();
      long $$2 = $$1.ae();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ezi.a a(evq $$0) {
      return new ezi.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public evq d() {
      return this.c;
   }

   public static class a implements eza.a {
      private Optional<Long> a = Optional.empty();
      private final evq b;

      public a(evq $$0) {
         this.b = $$0;
      }

      public ezi.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezi a() {
         return new ezi(this.a, this.b);
      }
   }
}
