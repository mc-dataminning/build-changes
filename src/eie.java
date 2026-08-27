import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eie(Optional<Long> b, eew c) implements ehw {
   public static final Codec<eie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asu.a(Codec.LONG, "period").forGetter(eie::c), eew.a.fieldOf("value").forGetter(eie::d)).apply($$0, eie::new)
   );

   @Override
   public ehx b() {
      return ehy.r;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.c.a();
   }

   public boolean a(eex $$0) {
      ame $$1 = $$0.d();
      long $$2 = $$1.X();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eie.a a(eew $$0) {
      return new eie.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eew d() {
      return this.c;
   }

   public static class a implements ehw.a {
      private Optional<Long> a = Optional.empty();
      private final eew b;

      public a(eew $$0) {
         this.b = $$0;
      }

      public eie.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eie a() {
         return new eie(this.a, this.b);
      }
   }
}
