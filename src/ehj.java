import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehj(ehl b, ehi c) {
   public static final Codec<ehj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehl.a.forGetter(ehj::a), ehi.a.forGetter(ehj::b)).apply($$0, $$0.stable(ehj::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ehl $$1, ehi $$2) {
      return a.encodeStart($$0, new ehj($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ehl $$1, jt $$2) {
      return a($$0, $$1, new ehi($$2.f(mh.bp)));
   }

   public ehl a() {
      return this.b;
   }

   public ehi b() {
      return this.c;
   }
}
