import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atp(List<atp.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atp> d = RecordCodecBuilder.create($$0 -> $$0.group(atp.a.c.listOf().fieldOf("entries").forGetter(atp::a)).apply($$0, atp::new));
   public static final aue<atp> a = new aue<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atp.a::b).toList();
   }

   public List<atp.a> a() {
      return this.b;
   }

   public static record a(azg<Integer> a, String b) {
      static final Codec<atp.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azg.a(Codec.INT).fieldOf("formats").forGetter(atp.a::a), Codec.STRING.validate(atp::a).fieldOf("directory").forGetter(atp.a::b))
               .apply($$0, atp.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
