import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record any(List<any.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<any> d = RecordCodecBuilder.create($$0 -> $$0.group(any.a.c.listOf().fieldOf("entries").forGetter(any::a)).apply($$0, any::new));
   public static final aom<any> a = aom.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(any.a::b).toList();
   }

   public List<any.a> a() {
      return this.b;
   }

   public static record a(ati<Integer> a, String b) {
      static final Codec<any.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ati.a(Codec.INT).fieldOf("formats").forGetter(any.a::a), asy.<String>a(Codec.STRING, any::a).fieldOf("directory").forGetter(any.a::b))
               .apply($$0, any.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
