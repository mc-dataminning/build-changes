import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fce(Optional<Long> b, eym c) implements fbw {
   public static final MapCodec<fce> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fce::c), eym.a.fieldOf("value").forGetter(fce::d)).apply($$0, fce::new)
   );

   @Override
   public fbx b() {
      return fby.q;
   }

   @Override
   public Set<bav<?>> a() {
      return this.c.a();
   }

   public boolean a(eyn $$0) {
      aro $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fce.a a(eym $$0) {
      return new fce.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eym d() {
      return this.c;
   }

   public static class a implements fbw.a {
      private Optional<Long> a = Optional.empty();
      private final eym b;

      public a(eym $$0) {
         this.b = $$0;
      }

      public fce.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fce a() {
         return new fce(this.a, this.b);
      }
   }
}
