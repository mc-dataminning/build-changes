import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyv(dyx b, dyu c) {
   public static final Codec<dyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyx.a.forGetter(dyv::a), dyu.a.forGetter(dyv::b)).apply($$0, $$0.stable(dyv::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyx $$1, dyu $$2) {
      return a.encodeStart($$0, new dyv($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dyx $$1, jx $$2) {
      return a($$0, $$1, new dyu($$2.d(lr.ba)));
   }

   public dyx a() {
      return this.b;
   }

   public dyu b() {
      return this.c;
   }
}
