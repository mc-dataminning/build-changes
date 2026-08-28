import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import javax.annotation.Nullable;

public record czp(List<Float> d, List<Boolean> e, List<String> f, List<Integer> g) {
   public static final czp a = new czp(List.of(), List.of(), List.of(), List.of());
   public static final Codec<czp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(czp::a),
               Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(czp::b),
               Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(czp::c),
               ayi.i.listOf().optionalFieldOf("colors", List.of()).forGetter(czp::d)
            )
            .apply($$0, czp::new)
   );
   public static final yn<ByteBuf, czp> c = yn.a(yl.l.a(yl.a()), czp::a, yl.b.a(yl.a()), czp::b, yl.o.a(yl.a()), czp::c, yl.g.a(yl.a()), czp::d, czp::new);

   @Nullable
   private static <T> T a(List<T> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.get($$1) : null;
   }

   @Nullable
   public Float a(int $$0) {
      return a(this.d, $$0);
   }

   @Nullable
   public Boolean b(int $$0) {
      return a(this.e, $$0);
   }

   @Nullable
   public String c(int $$0) {
      return a(this.f, $$0);
   }

   @Nullable
   public Integer d(int $$0) {
      return a(this.g, $$0);
   }

   public List<Float> a() {
      return this.d;
   }

   public List<Boolean> b() {
      return this.e;
   }

   public List<String> c() {
      return this.f;
   }

   public List<Integer> d() {
      return this.g;
   }
}
