import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dns(dnu b, dnr c) {
   public static final Codec<dns> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dnu.a.forGetter(dns::a), dnr.a.forGetter(dns::b)).apply($$0, $$0.stable(dns::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dnu $$1, dnr $$2) {
      return a.encodeStart($$0, new dns($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dnu $$1, it $$2) {
      return a($$0, $$1, new dnr($$2.d(kd.aK)));
   }

   public dnu a() {
      return this.b;
   }

   public dnr b() {
      return this.c;
   }
}
