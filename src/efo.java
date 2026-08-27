import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efo(Optional<Long> b, ecg c) implements efg {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(Codec.LONG, "period").forGetter(efo::c), ecg.a.fieldOf("value").forGetter(efo::d)).apply($$0, efo::new)
   );

   @Override
   public efh b() {
      return efi.r;
   }

   @Override
   public Set<eep<?>> a() {
      return this.c.a();
   }

   public boolean a(ech $$0) {
      akk $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static efo.a a(ecg $$0) {
      return new efo.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ecg d() {
      return this.c;
   }

   public static class a implements efg.a {
      private Optional<Long> a = Optional.empty();
      private final ecg b;

      public a(ecg $$0) {
         this.b = $$0;
      }

      public efo.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efo a() {
         return new efo(this.a, this.b);
      }
   }
}
