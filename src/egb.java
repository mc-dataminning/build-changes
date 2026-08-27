import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record egb(Optional<Boolean> b, Optional<Boolean> c) implements efr {
   public static final Codec<egb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arh.a(Codec.BOOL, "raining").forGetter(egb::d), arh.a(Codec.BOOL, "thundering").forGetter(egb::e)).apply($$0, egb::new)
   );

   @Override
   public efs b() {
      return eft.p;
   }

   public boolean a(ecs $$0) {
      aks $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static egb.a c() {
      return new egb.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements efr.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public egb.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public egb.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public egb a() {
         return new egb(this.a, this.b);
      }
   }
}
