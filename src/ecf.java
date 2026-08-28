import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecf(ech b, ece c) {
   public static final Codec<ecf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ech.a.forGetter(ecf::a), ece.a.forGetter(ecf::b)).apply($$0, $$0.stable(ecf::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ech $$1, ece $$2) {
      return a.encodeStart($$0, new ecf($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, ech $$1, ke $$2) {
      return a($$0, $$1, new ece($$2.e(ma.bc)));
   }

   public ech a() {
      return this.b;
   }

   public ece b() {
      return this.c;
   }
}
