import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsm(dso b, dsl c) {
   public static final Codec<dsm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dso.a.forGetter(dsm::a), dsl.a.forGetter(dsm::b)).apply($$0, $$0.stable(dsm::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dso $$1, dsl $$2) {
      return a.encodeStart($$0, new dsm($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, dso $$1, iy $$2) {
      return a($$0, $$1, new dsl($$2.d(ki.aO)));
   }

   public dso a() {
      return this.b;
   }

   public dsl b() {
      return this.c;
   }
}
