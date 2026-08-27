import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cv(ua e) {
   public static final Codec<cv> a = uy.i.xmap(cv::new, cv::a);
   public static final Codec<cv> b = ua.a.xmap(cv::new, cv::a);
   public static final Codec<cv> c = axh.e(a, b);
   public static final ys<ByteBuf, cv> d = yq.n.a(cv::new, cv::a);

   public boolean a(csz $$0) {
      cvm $$1 = $$0.a(ka.a, cvm.a);
      return $$1.b(this.e);
   }

   public boolean a(brh $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable ux $$0) {
      return $$0 != null && up.a(this.e, $$0, true);
   }

   public static ua b(brh $$0) {
      ua $$1 = $$0.f(new ua());
      if ($$0 instanceof clh) {
         csz $$2 = ((clh)$$0).ga().f();
         if (!$$2.d()) {
            $$1.a("SelectedItem", $$2.a($$0.dP()));
         }
      }

      return $$1;
   }

   public ua a() {
      return this.e;
   }
}
