import com.mojang.serialization.Codec;
import java.util.Optional;

public record cr(jq<cwq> c) implements dw<cws> {
   public static final Codec<cr> a = kb.a(lu.ad).xmap(cr::new, cr::b);

   @Override
   public kp<cws> a() {
      return kq.G;
   }

   public boolean a(cuo $$0, cws $$1) {
      Optional<jm<cwq>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ct a(jq<cwq> $$0) {
      return new cr($$0);
   }

   public jq<cwq> b() {
      return this.c;
   }
}
