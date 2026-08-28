import com.mojang.serialization.Codec;
import java.util.Optional;

public record cr(jr<cxm> c) implements dw<cxo> {
   public static final Codec<cr> a = kc.a(lv.ad).xmap(cr::new, cr::b);

   @Override
   public kq<cxo> a() {
      return kr.L;
   }

   public boolean a(cvp $$0, cxo $$1) {
      Optional<jn<cxm>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ct a(jr<cxm> $$0) {
      return new cr($$0);
   }

   public jr<cxm> b() {
      return this.c;
   }
}
