import com.mojang.serialization.Codec;
import java.util.List;

public record csy(List<csu.a<csx, csv>> c) {
   public static final csy a = new csy(List.of());
   public static final Codec<csy> b = csu.a.a(csv.b).listOf().xmap(csy::new, csy::a);

   public static csy a(csv $$0, int $$1) {
      return new csy(csu.a($$0, $$1));
   }

   public static csy a(int $$0) {
      return new csy(csu.a($$0));
   }

   public List<csu.a<csx, csv>> a() {
      return this.c;
   }
}
