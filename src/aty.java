import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record aty(List<aty.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<aty> d = RecordCodecBuilder.create($$0 -> $$0.group(aty.a.c.listOf().fieldOf("entries").forGetter(aty::a)).apply($$0, aty::new));
   public static final aun<aty> a = new aun<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(aty.a::b).toList();
   }

   public List<aty.a> a() {
      return this.b;
   }

   public static record a(azr<Integer> a, String b) {
      static final Codec<aty.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(azr.a(Codec.INT).fieldOf("formats").forGetter(aty.a::a), Codec.STRING.validate(aty::a).fieldOf("directory").forGetter(aty.a::b))
               .apply($$0, aty.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
