import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dnb(dnd b, dna c) {
   public static final Codec<dnb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnd.a.forGetter(dnb::a), dna.a.forGetter(dnb::b)).apply($$0, $$0.stable(dnb::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dnd $$1, dna $$2) {
      return a.encodeStart($$0, new dnb($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dnd $$1, ip $$2) {
      return a($$0, $$1, new dna($$2.d(jz.aK)));
   }

   public dnd a() {
      return this.b;
   }

   public dna b() {
      return this.c;
   }
}
