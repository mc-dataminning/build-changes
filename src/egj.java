import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egj(egl b, egi c) {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egl.a.forGetter(egj::a), egi.a.forGetter(egj::b)).apply($$0, $$0.stable(egj::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, egl $$1, egi $$2) {
      return a.encodeStart($$0, new egj($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, egl $$1, js $$2) {
      return a($$0, $$1, new egi($$2.f(mg.bn)));
   }

   public egl a() {
      return this.b;
   }

   public egi b() {
      return this.c;
   }
}
