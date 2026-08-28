import com.mojang.serialization.Codec;
import java.util.Optional;

public record cr(jq<cws> c) implements dw<cwu> {
   public static final Codec<cr> a = kb.a(lu.ad).xmap(cr::new, cr::b);

   @Override
   public kp<cwu> a() {
      return kq.G;
   }

   public boolean a(cuq $$0, cwu $$1) {
      Optional<jm<cws>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ct a(jq<cws> $$0) {
      return new cr($$0);
   }

   public jq<cws> b() {
      return this.c;
   }
}
