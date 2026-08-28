import com.mojang.serialization.Codec;
import java.util.List;

public record ctq(List<ctm.a<ctp, ctn>> c) {
   public static final ctq a = new ctq(List.of());
   public static final Codec<ctq> b = ctm.a.a(ctn.b).listOf().xmap(ctq::new, ctq::a);

   public static ctq a(ctn $$0, int $$1) {
      return new ctq(ctm.a($$0, $$1));
   }

   public static ctq a(int $$0) {
      return new ctq(ctm.a($$0));
   }

   public List<ctm.a<ctp, ctn>> a() {
      return this.c;
   }
}
