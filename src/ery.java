import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ery(Optional<Long> b, eok c) implements erq {
   public static final Codec<ery> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(Codec.LONG, "period").forGetter(ery::c), eok.a.fieldOf("value").forGetter(ery::d)).apply($$0, ery::new)
   );

   @Override
   public err b() {
      return ers.s;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.c.a();
   }

   public boolean a(eol $$0) {
      aqh $$1 = $$0.d();
      long $$2 = $$1.Z();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ery.a a(eok $$0) {
      return new ery.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eok d() {
      return this.c;
   }

   public static class a implements erq.a {
      private Optional<Long> a = Optional.empty();
      private final eok b;

      public a(eok $$0) {
         this.b = $$0;
      }

      public ery.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ery a() {
         return new ery(this.a, this.b);
      }
   }
}
