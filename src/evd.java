import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evd(Optional<Long> b, ero c) implements euu {
   public static final Codec<evd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(Codec.LONG, "period").forGetter(evd::c), ero.a.fieldOf("value").forGetter(evd::d)).apply($$0, evd::new)
   );

   @Override
   public euv b() {
      return euw.s;
   }

   @Override
   public Set<eud<?>> a() {
      return this.c.a();
   }

   public boolean a(erp $$0) {
      aqt $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static evd.a a(ero $$0) {
      return new evd.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ero d() {
      return this.c;
   }

   public static class a implements euu.a {
      private Optional<Long> a = Optional.empty();
      private final ero b;

      public a(ero $$0) {
         this.b = $$0;
      }

      public evd.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evd a() {
         return new evd(this.a, this.b);
      }
   }
}
