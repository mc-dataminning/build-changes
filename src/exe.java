import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exe(Optional<Long> b, etk c) implements eww {
   public static final MapCodec<exe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(exe::c), etk.a.fieldOf("value").forGetter(exe::d)).apply($$0, exe::new)
   );

   @Override
   public ewx b() {
      return ewy.q;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.c.a();
   }

   public boolean a(etl $$0) {
      arj $$1 = $$0.d();
      long $$2 = $$1.ab();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static exe.a a(etk $$0) {
      return new exe.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public etk d() {
      return this.c;
   }

   public static class a implements eww.a {
      private Optional<Long> a = Optional.empty();
      private final etk b;

      public a(etk $$0) {
         this.b = $$0;
      }

      public exe.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exe a() {
         return new exe(this.a, this.b);
      }
   }
}
