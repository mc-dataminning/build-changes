import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ezl(Optional<Boolean> b, Optional<Boolean> c) implements ezb {
   public static final MapCodec<ezl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(ezl::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(ezl::e))
            .apply($$0, ezl::new)
   );

   @Override
   public ezc b() {
      return ezd.o;
   }

   public boolean a(evs $$0) {
      ard $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ag() ? false : !this.c.isPresent() || this.c.get() == $$1.af();
   }

   public static ezl.a c() {
      return new ezl.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ezb.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ezl.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezl.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ezl a() {
         return new ezl(this.a, this.b);
      }
   }
}
