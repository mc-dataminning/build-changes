import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efr(Optional<Long> b, ecj c) implements efj {
   public static final Codec<efr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arj.a(Codec.LONG, "period").forGetter(efr::c), ecj.a.fieldOf("value").forGetter(efr::d)).apply($$0, efr::new)
   );

   @Override
   public efk b() {
      return efl.r;
   }

   @Override
   public Set<ees<?>> a() {
      return this.c.a();
   }

   public boolean a(eck $$0) {
      akt $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static efr.a a(ecj $$0) {
      return new efr.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ecj d() {
      return this.c;
   }

   public static class a implements efj.a {
      private Optional<Long> a = Optional.empty();
      private final ecj b;

      public a(ecj $$0) {
         this.b = $$0;
      }

      public efr.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efr a() {
         return new efr(this.a, this.b);
      }
   }
}
