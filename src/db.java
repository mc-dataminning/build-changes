import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record db<T>(asg<T> a, boolean b) {
   public static <T> Codec<db<T>> a(ags<? extends ir<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(asg.a($$0).fieldOf("id").forGetter(db::a), Codec.BOOL.fieldOf("expected").forGetter(db::b)).apply($$1, db::new)
      );
   }

   public static <T> db<T> a(asg<T> $$0) {
      return new db<>($$0, true);
   }

   public static <T> db<T> b(asg<T> $$0) {
      return new db<>($$0, false);
   }

   public boolean a(ie<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
