import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record db<T>(asx<T> a, boolean b) {
   public static <T> Codec<db<T>> a(ahg<? extends it<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(asx.a($$0).fieldOf("id").forGetter(db::a), Codec.BOOL.fieldOf("expected").forGetter(db::b)).apply($$1, db::new)
      );
   }

   public static <T> db<T> a(asx<T> $$0) {
      return new db<>($$0, true);
   }

   public static <T> db<T> b(asx<T> $$0) {
      return new db<>($$0, false);
   }

   public boolean a(ih<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
