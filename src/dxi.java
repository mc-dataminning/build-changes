import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dxi extends dxv {
   public static final Codec<dxi> a = dnu.a.c.fieldOf("step").xmap(dxi::new, $$0 -> $$0.c).codec();
   private final dnu.a c;

   private dxi(dnu.a $$0) {
      this.c = $$0;
   }

   public static dxi a(dnu.a $$0) {
      return new dxi($$0);
   }

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      csf $$3 = new csf($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dxw<?> b() {
      return dxw.o;
   }
}
