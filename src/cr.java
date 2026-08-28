import com.mojang.serialization.Codec;
import java.util.Optional;

public record cr(js<cxp> c) implements dx<cxr> {
   public static final Codec<cr> a = kd.a(lw.ad).xmap(cr::new, cr::b);

   @Override
   public kr<cxr> a() {
      return ks.L;
   }

   public boolean a(cvs $$0, cxr $$1) {
      Optional<jo<cxp>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static ct a(js<cxp> $$0) {
      return new cr($$0);
   }

   public js<cxp> b() {
      return this.c;
   }
}
