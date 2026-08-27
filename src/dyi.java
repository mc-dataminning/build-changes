import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dyi extends dyv {
   public static final Codec<dyi> a = dou.a.c.fieldOf("step").xmap(dyi::new, $$0 -> $$0.c).codec();
   private final dou.a c;

   private dyi(dou.a $$0) {
      this.c = $$0;
   }

   public static dyi a(dou.a $$0) {
      return new dyi($$0);
   }

   @Override
   public Stream<hx> a_(dyt $$0, auw $$1, hx $$2) {
      cte $$3 = new cte($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dyw<?> b() {
      return dyw.o;
   }
}
