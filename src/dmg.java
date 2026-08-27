import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmg(dmi b, dmf c) {
   public static final Codec<dmg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmi.a.forGetter(dmg::a), dmf.a.forGetter(dmg::b)).apply($$0, $$0.stable(dmg::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dmi $$1, dmf $$2) {
      return a.encodeStart($$0, new dmg($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dmi $$1, ip $$2) {
      return a($$0, $$1, new dmf($$2.d(jz.aJ)));
   }

   public dmi a() {
      return this.b;
   }

   public dmf b() {
      return this.c;
   }
}
