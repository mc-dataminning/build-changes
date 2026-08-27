import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dlj(dll b, dli c) {
   public static final Codec<dlj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dll.a.forGetter(dlj::a), dli.a.forGetter(dlj::b)).apply($$0, $$0.stable(dlj::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dll $$1, dli $$2) {
      return a.encodeStart($$0, new dlj($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dll $$1, hu $$2) {
      return a($$0, $$1, new dli($$2.d(je.aI)));
   }

   public dll a() {
      return this.b;
   }

   public dli b() {
      return this.c;
   }
}
