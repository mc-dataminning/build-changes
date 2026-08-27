import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekm(Optional<Long> b, ehe c) implements eke {
   public static final Codec<ekm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atx.a(Codec.LONG, "period").forGetter(ekm::c), ehe.a.fieldOf("value").forGetter(ekm::d)).apply($$0, ekm::new)
   );

   @Override
   public ekf b() {
      return ekg.r;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.c.a();
   }

   public boolean a(ehf $$0) {
      ane $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ekm.a a(ehe $$0) {
      return new ekm.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ehe d() {
      return this.c;
   }

   public static class a implements eke.a {
      private Optional<Long> a = Optional.empty();
      private final ehe b;

      public a(ehe $$0) {
         this.b = $$0;
      }

      public ekm.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ekm a() {
         return new ekm(this.a, this.b);
      }
   }
}
