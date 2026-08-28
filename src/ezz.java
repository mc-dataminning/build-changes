import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezz(Optional<Long> b, ewh c) implements ezr {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(ezz::c), ewh.a.fieldOf("value").forGetter(ezz::d)).apply($$0, ezz::new)
   );

   @Override
   public ezs b() {
      return ezt.q;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.c.a();
   }

   public boolean a(ewi $$0) {
      arx $$1 = $$0.d();
      long $$2 = $$1.ae();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ezz.a a(ewh $$0) {
      return new ezz.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ewh d() {
      return this.c;
   }

   public static class a implements ezr.a {
      private Optional<Long> a = Optional.empty();
      private final ewh b;

      public a(ewh $$0) {
         this.b = $$0;
      }

      public ezz.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezz a() {
         return new ezz(this.a, this.b);
      }
   }
}
