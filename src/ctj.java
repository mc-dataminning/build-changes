import com.mojang.serialization.Codec;
import java.util.List;

public record ctj(List<ctf.a<cti, ctg>> c) {
   public static final ctj a = new ctj(List.of());
   public static final Codec<ctj> b = ctf.a.a(ctg.b).listOf().xmap(ctj::new, ctj::a);

   public static ctj a(ctg $$0, int $$1) {
      return new ctj(ctf.a($$0, $$1));
   }

   public static ctj a(int $$0) {
      return new ctj(ctf.a($$0));
   }

   public List<ctf.a<cti, ctg>> a() {
      return this.c;
   }
}
