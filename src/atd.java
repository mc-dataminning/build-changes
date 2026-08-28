import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atd(List<atd.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atd> d = RecordCodecBuilder.create($$0 -> $$0.group(atd.a.c.listOf().fieldOf("entries").forGetter(atd::a)).apply($$0, atd::new));
   public static final att<atd> a = att.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atd.a::b).toList();
   }

   public List<atd.a> a() {
      return this.b;
   }

   public static record a(ayv<Integer> a, String b) {
      static final Codec<atd.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayv.a(Codec.INT).fieldOf("formats").forGetter(atd.a::a), Codec.STRING.validate(atd::a).fieldOf("directory").forGetter(atd.a::b))
               .apply($$0, atd.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
