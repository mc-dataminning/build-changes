import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eun(Optional<Long> b, eqt c) implements euf {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(eun::c), eqt.a.fieldOf("value").forGetter(eun::d)).apply($$0, eun::new)
   );

   @Override
   public eug b() {
      return euh.q;
   }

   @Override
   public Set<etn<?>> a() {
      return this.c.a();
   }

   public boolean a(equ $$0) {
      aqm $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eun.a a(eqt $$0) {
      return new eun.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqt d() {
      return this.c;
   }

   public static class a implements euf.a {
      private Optional<Long> a = Optional.empty();
      private final eqt b;

      public a(eqt $$0) {
         this.b = $$0;
      }

      public eun.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eun a() {
         return new eun(this.a, this.b);
      }
   }
}
