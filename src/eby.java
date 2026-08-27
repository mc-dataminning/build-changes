import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eby extends ecl {
   public static final Codec<eby> a = dsk.a.c.fieldOf("step").xmap(eby::new, $$0 -> $$0.c).codec();
   private final dsk.a c;

   private eby(dsk.a $$0) {
      this.c = $$0;
   }

   public static eby a(dsk.a $$0) {
      return new eby($$0);
   }

   @Override
   public Stream<ib> a_(ecj $$0, axd $$1, ib $$2) {
      cwi $$3 = new cwi($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ecm<?> b() {
      return ecm.o;
   }
}
