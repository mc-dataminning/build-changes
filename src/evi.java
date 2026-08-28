import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evi(Optional<Long> b, ero c) implements eva {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(evi::c), ero.a.fieldOf("value").forGetter(evi::d)).apply($$0, evi::new)
   );

   @Override
   public evb b() {
      return evc.q;
   }

   @Override
   public Set<eui<?>> a() {
      return this.c.a();
   }

   public boolean a(erp $$0) {
      aqu $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static evi.a a(ero $$0) {
      return new evi.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ero d() {
      return this.c;
   }

   public static class a implements eva.a {
      private Optional<Long> a = Optional.empty();
      private final ero b;

      public a(ero $$0) {
         this.b = $$0;
      }

      public evi.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evi a() {
         return new evi(this.a, this.b);
      }
   }
}
