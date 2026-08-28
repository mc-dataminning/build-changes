import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atu(List<atu.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atu> d = RecordCodecBuilder.create($$0 -> $$0.group(atu.a.c.listOf().fieldOf("entries").forGetter(atu::a)).apply($$0, atu::new));
   public static final auk<atu> a = auk.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atu.a::b).toList();
   }

   public List<atu.a> a() {
      return this.b;
   }

   public static record a(azm<Integer> a, String b) {
      static final Codec<atu.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azm.a(Codec.INT).fieldOf("formats").forGetter(atu.a::a), Codec.STRING.validate(atu::a).fieldOf("directory").forGetter(atu.a::b))
               .apply($$0, atu.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
