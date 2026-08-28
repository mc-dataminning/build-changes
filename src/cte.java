import com.mojang.serialization.Codec;
import java.util.List;

public record cte(List<cta.a<ctd, ctb>> c) {
   public static final cte a = new cte(List.of());
   public static final Codec<cte> b = cta.a.a(ctb.b).listOf().xmap(cte::new, cte::a);

   public static cte a(ctb $$0, int $$1) {
      return new cte(cta.a($$0, $$1));
   }

   public static cte a(int $$0) {
      return new cte(cta.a($$0));
   }

   public List<cta.a<ctd, ctb>> a() {
      return this.c;
   }
}
