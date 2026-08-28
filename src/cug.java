import com.mojang.serialization.Codec;
import java.util.List;

public record cug(List<cuc.a<cuf, cud>> c) {
   public static final cug a = new cug(List.of());
   public static final Codec<cug> b = cuc.a.a(cud.b).listOf().xmap(cug::new, cug::a);

   public static cug a(cud $$0, int $$1) {
      return new cug(cuc.a($$0, $$1));
   }

   public static cug a(int $$0) {
      return new cug(cuc.a($$0));
   }

   public List<cuc.a<cuf, cud>> a() {
      return this.c;
   }
}
