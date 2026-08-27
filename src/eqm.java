import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eqm(Optional<Boolean> b, Optional<Boolean> c) implements eqc {
   public static final Codec<eqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(Codec.BOOL, "raining").forGetter(eqm::d), aws.a(Codec.BOOL, "thundering").forGetter(eqm::e)).apply($$0, eqm::new)
   );

   @Override
   public eqd b() {
      return eqe.p;
   }

   public boolean a(enb $$0) {
      aps $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ac() ? false : !this.c.isPresent() || this.c.get() == $$1.ab();
   }

   public static eqm.a c() {
      return new eqm.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eqc.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eqm.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eqm.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eqm a() {
         return new eqm(this.a, this.b);
      }
   }
}
