import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bz(Optional<ja<elz>> b, Optional<dk> c) {
   public static final Codec<bz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(jl.a(le.z), "fluids").forGetter(bz::a), axh.a(dk.a, "state").forGetter(bz::b)).apply($$0, bz::new)
   );

   public boolean a(aqh $$0, in $$1) {
      if (!$$0.p($$1)) {
         return false;
      } else {
         ema $$2 = $$0.b_($$1);
         return this.b.isPresent() && !$$2.a(this.b.get()) ? false : !this.c.isPresent() || this.c.get().a($$2);
      }
   }

   public Optional<ja<elz>> a() {
      return this.b;
   }

   public Optional<dk> b() {
      return this.c;
   }

   public static class a {
      private Optional<ja<elz>> a = Optional.empty();
      private Optional<dk> b = Optional.empty();

      private a() {
      }

      public static bz.a a() {
         return new bz.a();
      }

      public bz.a a(elz $$0) {
         this.a = Optional.of(ja.a($$0.k()));
         return this;
      }

      public bz.a a(ja<elz> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bz.a a(dk $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bz b() {
         return new bz(this.a, this.b);
      }
   }
}
