import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record egr(Optional<Boolean> b, Optional<Boolean> c) implements egh {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.a(Codec.BOOL, "raining").forGetter(egr::d), asg.a(Codec.BOOL, "thundering").forGetter(egr::e)).apply($$0, egr::new)
   );

   @Override
   public egi b() {
      return egj.p;
   }

   public boolean a(edi $$0) {
      alq $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static egr.a c() {
      return new egr.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements egh.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public egr.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public egr.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public egr a() {
         return new egr(this.a, this.b);
      }
   }
}
