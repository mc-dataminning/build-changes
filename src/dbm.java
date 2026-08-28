import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import javax.annotation.Nullable;

public record dbm(List<Float> d, List<Boolean> e, List<String> f, List<Integer> g) {
   public static final dbm a = new dbm(List.of(), List.of(), List.of(), List.of());
   public static final Codec<dbm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(dbm::a),
               Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(dbm::b),
               Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(dbm::c),
               ayu.i.listOf().optionalFieldOf("colors", List.of()).forGetter(dbm::d)
            )
            .apply($$0, dbm::new)
   );
   public static final yw<ByteBuf, dbm> c = yw.a(yu.l.a(yu.a()), dbm::a, yu.b.a(yu.a()), dbm::b, yu.o.a(yu.a()), dbm::c, yu.g.a(yu.a()), dbm::d, dbm::new);

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
