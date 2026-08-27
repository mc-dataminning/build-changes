import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eod(Optional<Boolean> b, Optional<Boolean> c) implements ent {
   public static final Codec<eod> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a(Codec.BOOL, "raining").forGetter(eod::d), awe.a(Codec.BOOL, "thundering").forGetter(eod::e)).apply($$0, eod::new)
   );

   @Override
   public enu b() {
      return env.p;
   }

   public boolean a(eku $$0) {
      apf $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static eod.a c() {
      return new eod.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ent.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eod.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eod.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eod a() {
         return new eod(this.a, this.b);
      }
   }
}
