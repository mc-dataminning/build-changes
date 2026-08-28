import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eve(Optional<Long> b, erk c) implements euw {
   public static final MapCodec<eve> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(eve::c), erk.a.fieldOf("value").forGetter(eve::d)).apply($$0, eve::new)
   );

   @Override
   public eux b() {
      return euy.q;
   }

   @Override
   public Set<eue<?>> a() {
      return this.c.a();
   }

   public boolean a(erl $$0) {
      aqt $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eve.a a(erk $$0) {
      return new eve.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public erk d() {
      return this.c;
   }

   public static class a implements euw.a {
      private Optional<Long> a = Optional.empty();
      private final erk b;

      public a(erk $$0) {
         this.b = $$0;
      }

      public eve.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eve a() {
         return new eve(this.a, this.b);
      }
   }
}
