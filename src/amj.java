import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record amj(List<amj.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<amj> d = RecordCodecBuilder.create($$0 -> $$0.group(amj.a.c.listOf().fieldOf("entries").forGetter(amj::a)).apply($$0, amj::new));
   public static final amx<amj> a = amx.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(amj.a::b).toList();
   }

   public List<amj.a> a() {
      return this.b;
   }

   public static record a(art<Integer> a, String b) {
      static final Codec<amj.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(art.a(Codec.INT).fieldOf("formats").forGetter(amj.a::a), arj.<String>a(Codec.STRING, amj::a).fieldOf("directory").forGetter(amj.a::b))
               .apply($$0, amj.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
