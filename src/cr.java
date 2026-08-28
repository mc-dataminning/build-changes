import com.mojang.serialization.Codec;
import java.util.Optional;

public record cr(jr<cxl> c) implements dw<cxn> {
   public static final Codec<cr> a = kc.a(lv.ad).xmap(cr::new, cr::b);

   @Override
   public kq<cxn> a() {
      return kr.I;
   }

   public boolean a(cvl $$0, cxn $$1) {
      Optional<jn<cxl>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ct a(jr<cxl> $$0) {
      return new cr($$0);
   }

   public jr<cxl> b() {
      return this.c;
   }
}
