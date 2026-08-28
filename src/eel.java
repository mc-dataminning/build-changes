import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eel(een b, eek c) {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(een.a.forGetter(eel::a), eek.a.forGetter(eel::b)).apply($$0, $$0.stable(eel::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, een $$1, eek $$2) {
      return a.encodeStart($$0, new eel($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, een $$1, ke $$2) {
      return a($$0, $$1, new eek($$2.e(mb.bf)));
   }

   public een a() {
      return this.b;
   }

   public eek b() {
      return this.c;
   }
}
