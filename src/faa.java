import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record faa(Optional<Long> b, ewg c) implements ezs {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(faa::c), ewg.a.fieldOf("value").forGetter(faa::d)).apply($$0, faa::new)
   );

   @Override
   public ezt b() {
      return ezu.q;
   }

   @Override
   public Set<eza<?>> a() {
      return this.c.a();
   }

   public boolean a(ewh $$0) {
      ash $$1 = $$0.d();
      long $$2 = $$1.ad();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static faa.a a(ewg $$0) {
      return new faa.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ewg d() {
      return this.c;
   }

   public static class a implements ezs.a {
      private Optional<Long> a = Optional.empty();
      private final ewg b;

      public a(ewg $$0) {
         this.b = $$0;
      }

      public faa.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public faa a() {
         return new faa(this.a, this.b);
      }
   }
}
