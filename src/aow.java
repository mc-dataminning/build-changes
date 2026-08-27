import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aow(List<aow.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aow> d = RecordCodecBuilder.create($$0 -> $$0.group(aow.a.c.listOf().fieldOf("entries").forGetter(aow::a)).apply($$0, aow::new));
   public static final apk<aow> a = apk.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aow.a::b).toList();
   }

   public List<aow.a> a() {
      return this.b;
   }

   public static record a(auh<Integer> a, String b) {
      static final Codec<aow.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(auh.a(Codec.INT).fieldOf("formats").forGetter(aow.a::a), atx.<String>a(Codec.STRING, aow::a).fieldOf("directory").forGetter(aow.a::b))
               .apply($$0, aow.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
