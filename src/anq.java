import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record anq(List<anq.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<anq> d = RecordCodecBuilder.create($$0 -> $$0.group(anq.a.c.listOf().fieldOf("entries").forGetter(anq::a)).apply($$0, anq::new));
   public static final aoe<anq> a = aoe.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(anq.a::b).toList();
   }

   public List<anq.a> a() {
      return this.b;
   }

   public static record a(ata<Integer> a, String b) {
      static final Codec<anq.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ata.a(Codec.INT).fieldOf("formats").forGetter(anq.a::a), asq.<String>a(Codec.STRING, anq::a).fieldOf("directory").forGetter(anq.a::b))
               .apply($$0, anq.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
