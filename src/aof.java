import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aof(List<aof.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aof> d = RecordCodecBuilder.create($$0 -> $$0.group(aof.a.c.listOf().fieldOf("entries").forGetter(aof::a)).apply($$0, aof::new));
   public static final aot<aof> a = aot.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aof.a::b).toList();
   }

   public List<aof.a> a() {
      return this.b;
   }

   public static record a(atq<Integer> a, String b) {
      static final Codec<aof.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(Codec.INT).fieldOf("formats").forGetter(aof.a::a), atg.<String>a(Codec.STRING, aof::a).fieldOf("directory").forGetter(aof.a::b))
               .apply($$0, aof.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
