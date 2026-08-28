import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewm(Optional<Long> b, ess c) implements ewe {
   public static final MapCodec<ewm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(ewm::c), ess.a.fieldOf("value").forGetter(ewm::d)).apply($$0, ewm::new)
   );

   @Override
   public ewf b() {
      return ewg.q;
   }

   @Override
   public Set<evm<?>> a() {
      return this.c.a();
   }

   public boolean a(est $$0) {
      arg $$1 = $$0.d();
      long $$2 = $$1.ab();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ewm.a a(ess $$0) {
      return new ewm.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ess d() {
      return this.c;
   }

   public static class a implements ewe.a {
      private Optional<Long> a = Optional.empty();
      private final ess b;

      public a(ess $$0) {
         this.b = $$0;
      }

      public ewm.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewm a() {
         return new ewm(this.a, this.b);
      }
   }
}
