import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atn(List<atn.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atn> d = RecordCodecBuilder.create($$0 -> $$0.group(atn.a.c.listOf().fieldOf("entries").forGetter(atn::a)).apply($$0, atn::new));
   public static final auc<atn> a = new auc<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atn.a::b).toList();
   }

   public List<atn.a> a() {
      return this.b;
   }

   public static record a(aze<Integer> a, String b) {
      static final Codec<atn.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aze.a(Codec.INT).fieldOf("formats").forGetter(atn.a::a), Codec.STRING.validate(atn::a).fieldOf("directory").forGetter(atn.a::b))
               .apply($$0, atn.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
