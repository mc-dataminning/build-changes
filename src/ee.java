import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ee<T>(axl<T> a, boolean b) {
   public static <T> Codec<ee<T>> a(ald<? extends kb<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axl.a($$0).fieldOf("id").forGetter(ee::a), Codec.BOOL.fieldOf("expected").forGetter(ee::b)).apply($$1, ee::new)
      );
   }

   public static <T> ee<T> a(axl<T> $$0) {
      return new ee<>($$0, true);
   }

   public static <T> ee<T> b(axl<T> $$0) {
      return new ee<>($$0, false);
   }

   public boolean a(jo<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
