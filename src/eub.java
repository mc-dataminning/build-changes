import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eub(Optional<Long> b, eqi c) implements ett {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(eub::c), eqi.a.fieldOf("value").forGetter(eub::d)).apply($$0, eub::new)
   );

   @Override
   public etu b() {
      return etv.s;
   }

   @Override
   public Set<etc<?>> a() {
      return this.c.a();
   }

   public boolean a(eqj $$0) {
      arf $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eub.a a(eqi $$0) {
      return new eub.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqi d() {
      return this.c;
   }

   public static class a implements ett.a {
      private Optional<Long> a = Optional.empty();
      private final eqi b;

      public a(eqi $$0) {
         this.b = $$0;
      }

      public eub.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eub a() {
         return new eub(this.a, this.b);
      }
   }
}
