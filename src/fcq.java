import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcq(Optional<Long> b, eyy c) implements fci {
   public static final MapCodec<fcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fcq::c), eyy.a.fieldOf("value").forGetter(fcq::d)).apply($$0, fcq::new)
   );

   @Override
   public fcj b() {
      return fck.q;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.a();
   }

   public boolean a(eyz $$0) {
      arq $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fcq.a a(eyy $$0) {
      return new fcq.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eyy d() {
      return this.c;
   }

   public static class a implements fci.a {
      private Optional<Long> a = Optional.empty();
      private final eyy b;

      public a(eyy $$0) {
         this.b = $$0;
      }

      public fcq.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fcq a() {
         return new fcq(this.a, this.b);
      }
   }
}
