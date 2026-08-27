import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dou(dow b, dot c) {
   public static final Codec<dou> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dow.a.forGetter(dou::a), dot.a.forGetter(dou::b)).apply($$0, $$0.stable(dou::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dow $$1, dot $$2) {
      return a.encodeStart($$0, new dou($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dow $$1, is $$2) {
      return a($$0, $$1, new dot($$2.d(kc.aM)));
   }

   public dow a() {
      return this.b;
   }

   public dot b() {
      return this.c;
   }
}
