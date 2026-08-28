import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcy(Optional<Long> b, ezg c) implements fcq {
   public static final MapCodec<fcy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fcy::c), ezg.a.fieldOf("value").forGetter(fcy::d)).apply($$0, fcy::new)
   );

   @Override
   public fcr b() {
      return fcs.q;
   }

   @Override
   public Set<bax<?>> a() {
      return this.c.a();
   }

   public boolean a(ezh $$0) {
      arq $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fcy.a a(ezg $$0) {
      return new fcy.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public ezg d() {
      return this.c;
   }

   public static class a implements fcq.a {
      private Optional<Long> a = Optional.empty();
      private final ezg b;

      public a(ezg $$0) {
         this.b = $$0;
      }

      public fcy.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fcy a() {
         return new fcy(this.a, this.b);
      }
   }
}
