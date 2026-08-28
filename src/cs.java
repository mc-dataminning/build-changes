import com.mojang.serialization.Codec;
import java.util.Optional;

public record cs(jt<cxu> c) implements dy<cxw> {
   public static final Codec<cs> a = ke.a(ly.ad).xmap(cs::new, cs::b);

   @Override
   public ks<cxw> a() {
      return kt.P;
   }

   public boolean a(cvx $$0, cxw $$1) {
      Optional<jp<cxu>> $$2 = $$1.e();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cu a(jt<cxu> $$0) {
      return new cs($$0);
   }

   public jt<cxu> b() {
      return this.c;
   }
}
