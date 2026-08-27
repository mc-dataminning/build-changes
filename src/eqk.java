import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqk(Optional<Long> b, ena c) implements eqc {
   public static final Codec<eqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(Codec.LONG, "period").forGetter(eqk::c), ena.a.fieldOf("value").forGetter(eqk::d)).apply($$0, eqk::new)
   );

   @Override
   public eqd b() {
      return eqe.r;
   }

   @Override
   public Set<epl<?>> a() {
      return this.c.a();
   }

   public boolean a(enb $$0) {
      aps $$1 = $$0.d();
      long $$2 = $$1.Z();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eqk.a a(ena $$0) {
      return new eqk.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ena d() {
      return this.c;
   }

   public static class a implements eqc.a {
      private Optional<Long> a = Optional.empty();
      private final ena b;

      public a(ena $$0) {
         this.b = $$0;
      }

      public eqk.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eqk a() {
         return new eqk(this.a, this.b);
      }
   }
}
