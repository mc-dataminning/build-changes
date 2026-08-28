import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aue(List<aue.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aue> d = RecordCodecBuilder.create($$0 -> $$0.group(aue.a.c.listOf().fieldOf("entries").forGetter(aue::a)).apply($$0, aue::new));
   public static final auu<aue> a = auu.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aue.a::b).toList();
   }

   public List<aue.a> a() {
      return this.b;
   }

   public static record a(azw<Integer> a, String b) {
      static final Codec<aue.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azw.a(Codec.INT).fieldOf("formats").forGetter(aue.a::a), Codec.STRING.validate(aue::a).fieldOf("directory").forGetter(aue.a::b))
               .apply($$0, aue.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
