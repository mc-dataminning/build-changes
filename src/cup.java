import com.mojang.serialization.Codec;
import java.util.List;

public record cup(List<cul.a<cuo, cum>> c) {
   public static final cup a = new cup(List.of());
   public static final Codec<cup> b = cul.a.a(cum.b).listOf().xmap(cup::new, cup::a);

   public static cup a(cum $$0, int $$1) {
      return new cup(cul.a($$0, $$1));
   }

   public static cup a(int $$0) {
      return new cup(cul.a($$0));
   }

   public List<cul.a<cuo, cum>> a() {
      return this.c;
   }
}
