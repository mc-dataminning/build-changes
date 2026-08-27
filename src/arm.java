import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record arm(List<arm.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<arm> d = RecordCodecBuilder.create($$0 -> $$0.group(arm.a.c.listOf().fieldOf("entries").forGetter(arm::a)).apply($$0, arm::new));
   public static final asc<arm> a = asc.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(arm.a::b).toList();
   }

   public List<arm.a> a() {
      return this.b;
   }

   public static record a(axc<Integer> a, String b) {
      static final Codec<arm.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axc.a(Codec.INT).fieldOf("formats").forGetter(arm.a::a), aws.<String>b(Codec.STRING, arm::a).fieldOf("directory").forGetter(arm.a::b))
               .apply($$0, arm.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
