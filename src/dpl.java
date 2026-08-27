import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpl(dpn b, dpk c) {
   public static final Codec<dpl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dpn.a.forGetter(dpl::a), dpk.a.forGetter(dpl::b)).apply($$0, $$0.stable(dpl::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dpn $$1, dpk $$2) {
      return a.encodeStart($$0, new dpl($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dpn $$1, iu $$2) {
      return a($$0, $$1, new dpk($$2.d(ke.aN)));
   }

   public dpn a() {
      return this.b;
   }

   public dpk b() {
      return this.c;
   }
}
