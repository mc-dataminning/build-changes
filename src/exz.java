import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exz(Optional<Long> b, euf c) implements exr {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(exz::c), euf.a.fieldOf("value").forGetter(exz::d)).apply($$0, exz::new)
   );

   @Override
   public exs b() {
      return ext.q;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.c.a();
   }

   public boolean a(eug $$0) {
      arq $$1 = $$0.d();
      long $$2 = $$1.ab();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static exz.a a(euf $$0) {
      return new exz.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public euf d() {
      return this.c;
   }

   public static class a implements exr.a {
      private Optional<Long> a = Optional.empty();
      private final euf b;

      public a(euf $$0) {
         this.b = $$0;
      }

      public exz.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exz a() {
         return new exz(this.a, this.b);
      }
   }
}
