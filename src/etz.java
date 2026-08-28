import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etz(Optional<Long> b, eqg c) implements etr {
   public static final MapCodec<etz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(etz::c), eqg.a.fieldOf("value").forGetter(etz::d)).apply($$0, etz::new)
   );

   @Override
   public ets b() {
      return ett.s;
   }

   @Override
   public Set<eta<?>> a() {
      return this.c.a();
   }

   public boolean a(eqh $$0) {
      are $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static etz.a a(eqg $$0) {
      return new etz.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqg d() {
      return this.c;
   }

   public static class a implements etr.a {
      private Optional<Long> a = Optional.empty();
      private final eqg b;

      public a(eqg $$0) {
         this.b = $$0;
      }

      public etz.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public etz a() {
         return new etz(this.a, this.b);
      }
   }
}
