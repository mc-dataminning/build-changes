import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atf(List<atf.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atf> d = RecordCodecBuilder.create($$0 -> $$0.group(atf.a.c.listOf().fieldOf("entries").forGetter(atf::a)).apply($$0, atf::new));
   public static final atv<atf> a = atv.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atf.a::b).toList();
   }

   public List<atf.a> a() {
      return this.b;
   }

   public static record a(ayx<Integer> a, String b) {
      static final Codec<atf.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayx.a(Codec.INT).fieldOf("formats").forGetter(atf.a::a), Codec.STRING.validate(atf::a).fieldOf("directory").forGetter(atf.a::b))
               .apply($$0, atf.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
