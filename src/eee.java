import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eee(eeg b, eed c) {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeg.a.forGetter(eee::a), eed.a.forGetter(eee::b)).apply($$0, $$0.stable(eee::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eeg $$1, eed $$2) {
      return a.encodeStart($$0, new eee($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eeg $$1, ke $$2) {
      return a($$0, $$1, new eed($$2.e(mb.be)));
   }

   public eeg a() {
      return this.b;
   }

   public eed b() {
      return this.c;
   }
}
