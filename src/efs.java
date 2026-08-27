import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efs(Optional<Long> b, eck c) implements efk {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arb.a(Codec.LONG, "period").forGetter(efs::c), eck.a.fieldOf("value").forGetter(efs::d)).apply($$0, efs::new)
   );

   @Override
   public efl b() {
      return efm.r;
   }

   @Override
   public Set<eet<?>> a() {
      return this.c.a();
   }

   public boolean a(ecl $$0) {
      akn $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static efs.a a(eck $$0) {
      return new efs.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eck d() {
      return this.c;
   }

   public static class a implements efk.a {
      private Optional<Long> a = Optional.empty();
      private final eck b;

      public a(eck $$0) {
         this.b = $$0;
      }

      public efs.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efs a() {
         return new efs(this.a, this.b);
      }
   }
}
