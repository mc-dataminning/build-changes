import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record enf(Optional<Long> b, ejx c) implements emx {
   public static final Codec<enf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.a(Codec.LONG, "period").forGetter(enf::c), ejx.a.fieldOf("value").forGetter(enf::d)).apply($$0, enf::new)
   );

   @Override
   public emy b() {
      return emz.r;
   }

   @Override
   public Set<emg<?>> a() {
      return this.c.a();
   }

   public boolean a(ejy $$0) {
      apa $$1 = $$0.d();
      long $$2 = $$1.Y();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static enf.a a(ejx $$0) {
      return new enf.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ejx d() {
      return this.c;
   }

   public static class a implements emx.a {
      private Optional<Long> a = Optional.empty();
      private final ejx b;

      public a(ejx $$0) {
         this.b = $$0;
      }

      public enf.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public enf a() {
         return new enf(this.a, this.b);
      }
   }
}
