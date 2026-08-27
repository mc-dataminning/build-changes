import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record ash(List<ash.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<ash> d = RecordCodecBuilder.create($$0 -> $$0.group(ash.a.c.listOf().fieldOf("entries").forGetter(ash::a)).apply($$0, ash::new));
   public static final asx<ash> a = asx.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(ash.a::b).toList();
   }

   public List<ash.a> a() {
      return this.b;
   }

   public static record a(axx<Integer> a, String b) {
      static final Codec<ash.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axx.a(Codec.INT).fieldOf("formats").forGetter(ash.a::a), Codec.STRING.validate(ash::a).fieldOf("directory").forGetter(ash.a::b))
               .apply($$0, ash.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
