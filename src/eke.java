import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eke(Optional<Boolean> b, Optional<Boolean> c) implements eju {
   public static final Codec<eke> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atv.a(Codec.BOOL, "raining").forGetter(eke::d), atv.a(Codec.BOOL, "thundering").forGetter(eke::e)).apply($$0, eke::new)
   );

   @Override
   public ejv b() {
      return ejw.p;
   }

   public boolean a(egv $$0) {
      and $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static eke.a c() {
      return new eke.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eju.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eke.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eke.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eke a() {
         return new eke(this.a, this.b);
      }
   }
}
