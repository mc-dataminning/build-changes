import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dn<T>(awm<T> a, boolean b) {
   public static <T> Codec<dn<T>> a(akm<? extends jk<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awm.a($$0).fieldOf("id").forGetter(dn::a), Codec.BOOL.fieldOf("expected").forGetter(dn::b)).apply($$1, dn::new)
      );
   }

   public static <T> dn<T> a(awm<T> $$0) {
      return new dn<>($$0, true);
   }

   public static <T> dn<T> b(awm<T> $$0) {
      return new dn<>($$0, false);
   }

   public boolean a(ix<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
