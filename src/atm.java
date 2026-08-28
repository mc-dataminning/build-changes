import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record atm(List<atm.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<atm> d = RecordCodecBuilder.create($$0 -> $$0.group(atm.a.c.listOf().fieldOf("entries").forGetter(atm::a)).apply($$0, atm::new));
   public static final auc<atm> a = auc.a("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(atm.a::b).toList();
   }

   public List<atm.a> a() {
      return this.b;
   }

   public static record a(aze<Integer> a, String b) {
      static final Codec<atm.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(aze.a(Codec.INT).fieldOf("formats").forGetter(atm.a::a), Codec.STRING.validate(atm::a).fieldOf("directory").forGetter(atm.a::b))
               .apply($$0, atm.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
