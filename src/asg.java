import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record asg<T>(ags<? extends ir<T>> a, agt b) {
   private static final Interner<asg<?>> c = Interners.newWeakInterner();

   @Deprecated
   public asg(ags<? extends ir<T>> a, agt b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<asg<T>> a(ags<? extends ir<T>> $$0) {
      return agt.a.xmap($$1 -> a($$0, $$1), asg::b);
   }

   public static <T> Codec<asg<T>> b(ags<? extends ir<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? agt.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> asg<T> a(ags<? extends ir<T>> $$0, agt $$1) {
      return (asg<T>)c.intern(new asg<>($$0, $$1));
   }

   public boolean c(ags<? extends ir<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<asg<E>> d(ags<? extends ir<E>> $$0) {
      return this.c($$0) ? Optional.of((asg<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
