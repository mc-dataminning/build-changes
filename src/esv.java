import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record esv(Optional<Long> b, epg c) implements esn {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(esv::c), epg.a.fieldOf("value").forGetter(esv::d)).apply($$0, esv::new)
   );

   @Override
   public eso b() {
      return esp.s;
   }

   @Override
   public Set<erw<?>> a() {
      return this.c.a();
   }

   public boolean a(eph $$0) {
      aqn $$1 = $$0.d();
      long $$2 = $$1.Z();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static esv.a a(epg $$0) {
      return new esv.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public epg d() {
      return this.c;
   }

   public static class a implements esn.a {
      private Optional<Long> a = Optional.empty();
      private final epg b;

      public a(epg $$0) {
         this.b = $$0;
      }

      public esv.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esv a() {
         return new esv(this.a, this.b);
      }
   }
}
