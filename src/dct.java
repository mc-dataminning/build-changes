import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import javax.annotation.Nullable;

public record dct(List<Float> d, List<Boolean> e, List<String> f, List<Integer> g) {
   public static final dct a = new dct(List.of(), List.of(), List.of(), List.of());
   public static final Codec<dct> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(dct::a),
               Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(dct::b),
               Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(dct::c),
               azg.i.listOf().optionalFieldOf("colors", List.of()).forGetter(dct::d)
            )
            .apply($$0, dct::new)
   );
   public static final ze<ByteBuf, dct> c = ze.a(zc.l.a(zc.a()), dct::a, zc.b.a(zc.a()), dct::b, zc.p.a(zc.a()), dct::c, zc.g.a(zc.a()), dct::d, dct::new);

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
