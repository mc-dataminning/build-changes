import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bug<T> {
   private final T a;
   private long b;

   public bug(T $$0, long $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a() {
      if (this.e()) {
         this.b--;
      }
   }

   public static <T> bug<T> a(T $$0) {
      return new bug<>($$0, Long.MAX_VALUE);
   }

   public static <T> bug<T> a(T $$0, long $$1) {
      return new bug<>($$0, $$1);
   }

   public long b() {
      return this.b;
   }

   public T c() {
      return this.a;
   }

   public boolean d() {
      return this.b <= 0L;
   }

   @Override
   public String toString() {
      return this.a + (this.e() ? " (ttl: " + this.b + ")" : "");
   }

   @aup
   public boolean e() {
      return this.b != Long.MAX_VALUE;
   }

   public static <T> Codec<bug<T>> a(Codec<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  $$0.fieldOf("value").forGetter($$0xx -> $$0xx.a),
                  Codec.LONG.optionalFieldOf("ttl").forGetter($$0xx -> $$0xx.e() ? Optional.of($$0xx.b) : Optional.empty())
               )
               .apply($$1, ($$0xx, $$1x) -> new bug<>($$0xx, $$1x.orElse(Long.MAX_VALUE)))
      );
   }
}
