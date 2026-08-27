import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record asg(List<asg.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<asg> d = RecordCodecBuilder.create($$0 -> $$0.group(asg.a.c.listOf().fieldOf("entries").forGetter(asg::a)).apply($$0, asg::new));
   public static final asw<asg> a = asw.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(asg.a::b).toList();
   }

   public List<asg.a> a() {
      return this.b;
   }

   public static record a(axw<Integer> a, String b) {
      static final Codec<asg.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(axw.a(Codec.INT).fieldOf("formats").forGetter(asg.a::a), Codec.STRING.validate(asg::a).fieldOf("directory").forGetter(asg.a::b))
               .apply($$0, asg.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
