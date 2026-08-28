import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eem(eeo b, eel c) {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeo.a.forGetter(eem::a), eel.a.forGetter(eem::b)).apply($$0, $$0.stable(eem::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eeo $$1, eel $$2) {
      return a.encodeStart($$0, new eem($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eeo $$1, ke $$2) {
      return a($$0, $$1, new eel($$2.e(mb.bf)));
   }

   public eeo a() {
      return this.b;
   }

   public eel b() {
      return this.c;
   }
}
