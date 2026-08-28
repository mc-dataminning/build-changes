import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atc(List<atc.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atc> d = RecordCodecBuilder.create($$0 -> $$0.group(atc.a.c.listOf().fieldOf("entries").forGetter(atc::a)).apply($$0, atc::new));
   public static final ats<atc> a = ats.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atc.a::b).toList();
   }

   public List<atc.a> a() {
      return this.b;
   }

   public static record a(ayu<Integer> a, String b) {
      static final Codec<atc.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.a(Codec.INT).fieldOf("formats").forGetter(atc.a::a), Codec.STRING.validate(atc::a).fieldOf("directory").forGetter(atc.a::b))
               .apply($$0, atc.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
