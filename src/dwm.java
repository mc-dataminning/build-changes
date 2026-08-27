import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwm(dwo b, dwl c) {
   public static final Codec<dwm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwo.a.forGetter(dwm::a), dwl.a.forGetter(dwm::b)).apply($$0, $$0.stable(dwm::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dwo $$1, dwl $$2) {
      return a.encodeStart($$0, new dwm($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dwo $$1, jj $$2) {
      return a($$0, $$1, new dwl($$2.d(ld.aS)));
   }

   public dwo a() {
      return this.b;
   }

   public dwl b() {
      return this.c;
   }
}
