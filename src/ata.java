import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record ata(List<ata.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<ata> d = RecordCodecBuilder.create($$0 -> $$0.group(ata.a.c.listOf().fieldOf("entries").forGetter(ata::a)).apply($$0, ata::new));
   public static final atp<ata> a = new atp<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(ata.a::b).toList();
   }

   public List<ata.a> a() {
      return this.b;
   }

   public static record a(ayr<Integer> a, String b) {
      static final Codec<ata.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayr.a(Codec.INT).fieldOf("formats").forGetter(ata.a::a), Codec.STRING.validate(ata::a).fieldOf("directory").forGetter(ata.a::b))
               .apply($$0, ata.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
