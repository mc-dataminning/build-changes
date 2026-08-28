import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehz(eib b, ehy c) {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eib.a.forGetter(ehz::a), ehy.a.forGetter(ehz::b)).apply($$0, $$0.stable(ehz::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eib $$1, ehy $$2) {
      return a.encodeStart($$0, new ehz($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eib $$1, jt $$2) {
      return a($$0, $$1, new ehy($$2.f(mh.bq)));
   }

   public eib a() {
      return this.b;
   }

   public ehy b() {
      return this.c;
   }
}
