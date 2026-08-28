import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import javax.annotation.Nullable;

public record cyx(List<Float> d, List<Boolean> e, List<String> f, List<Integer> g) {
   public static final cyx a = new cyx(List.of(), List.of(), List.of(), List.of());
   public static final Codec<cyx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(cyx::a),
               Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(cyx::b),
               Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(cyx::c),
               ayh.i.listOf().optionalFieldOf("colors", List.of()).forGetter(cyx::d)
            )
            .apply($$0, cyx::new)
   );
   public static final ym<ByteBuf, cyx> c = ym.a(yk.l.a(yk.a()), cyx::a, yk.b.a(yk.a()), cyx::b, yk.o.a(yk.a()), cyx::c, yk.g.a(yk.a()), cyx::d, cyx::new);

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
