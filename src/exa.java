import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exa(Optional<Long> b, etg c) implements ews {
   public static final MapCodec<exa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(exa::c), etg.a.fieldOf("value").forGetter(exa::d)).apply($$0, exa::new)
   );

   @Override
   public ewt b() {
      return ewu.q;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.c.a();
   }

   public boolean a(eth $$0) {
      arh $$1 = $$0.d();
      long $$2 = $$1.ab();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static exa.a a(etg $$0) {
      return new exa.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public etg d() {
      return this.c;
   }

   public static class a implements ews.a {
      private Optional<Long> a = Optional.empty();
      private final etg b;

      public a(etg $$0) {
         this.b = $$0;
      }

      public exa.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exa a() {
         return new exa(this.a, this.b);
      }
   }
}
