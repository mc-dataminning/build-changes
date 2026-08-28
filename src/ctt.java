import com.mojang.serialization.Codec;
import java.util.List;

public record ctt(List<ctp.a<cts, ctq>> c) {
   public static final ctt a = new ctt(List.of());
   public static final Codec<ctt> b = ctp.a.a(ctq.b).listOf().xmap(ctt::new, ctt::a);

   public static ctt a(ctq $$0, int $$1) {
      return new ctt(ctp.a($$0, $$1));
   }

   public static ctt a(int $$0) {
      return new ctt(ctp.a($$0));
   }

   public List<ctp.a<cts, ctq>> a() {
      return this.c;
   }
}
