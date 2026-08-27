import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dtr extends due {
   public static final Codec<dtr> a = dkd.a.c.fieldOf("step").xmap(dtr::new, $$0 -> $$0.c).codec();
   private final dkd.a c;

   private dtr(dkd.a $$0) {
      this.c = $$0;
   }

   public static dtr a(dkd.a $$0) {
      return new dtr($$0);
   }

   @Override
   public Stream<gv> a_(duc $$0, art $$1, gv $$2) {
      cor $$3 = new cor($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public duf<?> b() {
      return duf.o;
   }
}
