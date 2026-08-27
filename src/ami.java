import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record ami(List<ami.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<ami> d = RecordCodecBuilder.create($$0 -> $$0.group(ami.a.c.listOf().fieldOf("entries").forGetter(ami::a)).apply($$0, ami::new));
   public static final amw<ami> a = amw.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(ami.a::b).toList();
   }

   public List<ami.a> a() {
      return this.b;
   }

   public static record a(arr<Integer> a, String b) {
      static final Codec<ami.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(arr.a(Codec.INT).fieldOf("formats").forGetter(ami.a::a), arh.<String>a(Codec.STRING, ami::a).fieldOf("directory").forGetter(ami.a::b))
               .apply($$0, ami.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
