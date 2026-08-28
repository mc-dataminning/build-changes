import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record asz(List<asz.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<asz> d = RecordCodecBuilder.create($$0 -> $$0.group(asz.a.c.listOf().fieldOf("entries").forGetter(asz::a)).apply($$0, asz::new));
   public static final atp<asz> a = atp.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(asz.a::b).toList();
   }

   public List<asz.a> a() {
      return this.b;
   }

   public static record a(ayr<Integer> a, String b) {
      static final Codec<asz.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayr.a(Codec.INT).fieldOf("formats").forGetter(asz.a::a), Codec.STRING.validate(asz::a).fieldOf("directory").forGetter(asz.a::b))
               .apply($$0, asz.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
