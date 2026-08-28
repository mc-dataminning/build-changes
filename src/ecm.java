import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecm(eco b, ecl c) {
   public static final Codec<ecm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eco.a.forGetter(ecm::a), ecl.a.forGetter(ecm::b)).apply($$0, $$0.stable(ecm::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eco $$1, ecl $$2) {
      return a.encodeStart($$0, new ecm($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eco $$1, ke $$2) {
      return a($$0, $$1, new ecl($$2.e(ma.bc)));
   }

   public eco a() {
      return this.b;
   }

   public ecl b() {
      return this.c;
   }
}
