import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eho(ehq b, ehn c) {
   public static final Codec<eho> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehq.a.forGetter(eho::a), ehn.a.forGetter(eho::b)).apply($$0, $$0.stable(eho::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ehq $$1, ehn $$2) {
      return a.encodeStart($$0, new eho($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ehq $$1, jt $$2) {
      return a($$0, $$1, new ehn($$2.f(mh.bq)));
   }

   public ehq a() {
      return this.b;
   }

   public ehn b() {
      return this.c;
   }
}
