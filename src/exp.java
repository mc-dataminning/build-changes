import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exp(Optional<Long> b, etv c) implements exh {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(exp::c), etv.a.fieldOf("value").forGetter(exp::d)).apply($$0, exp::new)
   );

   @Override
   public exi b() {
      return exj.q;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.c.a();
   }

   public boolean a(etw $$0) {
      arm $$1 = $$0.d();
      long $$2 = $$1.ab();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static exp.a a(etv $$0) {
      return new exp.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public etv d() {
      return this.c;
   }

   public static class a implements exh.a {
      private Optional<Long> a = Optional.empty();
      private final etv b;

      public a(etv $$0) {
         this.b = $$0;
      }

      public exp.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exp a() {
         return new exp(this.a, this.b);
      }
   }
}
