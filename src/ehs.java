import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehs(Optional<Long> b, eek c) implements ehk {
   public static final Codec<ehs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asq.a(Codec.LONG, "period").forGetter(ehs::c), eek.a.fieldOf("value").forGetter(ehs::d)).apply($$0, ehs::new)
   );

   @Override
   public ehl b() {
      return ehm.r;
   }

   @Override
   public Set<egt<?>> a() {
      return this.c.a();
   }

   public boolean a(eel $$0) {
      ama $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ehs.a a(eek $$0) {
      return new ehs.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eek d() {
      return this.c;
   }

   public static class a implements ehk.a {
      private Optional<Long> a = Optional.empty();
      private final eek b;

      public a(eek $$0) {
         this.b = $$0;
      }

      public ehs.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ehs a() {
         return new ehs(this.a, this.b);
      }
   }
}
