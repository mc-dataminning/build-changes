import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aou(List<aou.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aou> d = RecordCodecBuilder.create($$0 -> $$0.group(aou.a.c.listOf().fieldOf("entries").forGetter(aou::a)).apply($$0, aou::new));
   public static final api<aou> a = api.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aou.a::b).toList();
   }

   public List<aou.a> a() {
      return this.b;
   }

   public static record a(auf<Integer> a, String b) {
      static final Codec<aou.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(auf.a(Codec.INT).fieldOf("formats").forGetter(aou.a::a), atv.<String>a(Codec.STRING, aou::a).fieldOf("directory").forGetter(aou.a::b))
               .apply($$0, aou.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
