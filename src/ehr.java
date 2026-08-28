import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehr extends eie {
   public static final MapCodec<ehr> a = dyc.a.c.fieldOf("step").xmap(ehr::new, $$0 -> $$0.c);
   private final dyc.a c;

   private ehr(dyc.a $$0) {
      this.c = $$0;
   }

   public static ehr a(dyc.a $$0) {
      return new ehr($$0);
   }

   @Override
   public Stream<ja> a_(eic $$0, ayo $$1, ja $$2) {
      dbn $$3 = new dbn($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eif<?> b() {
      return eif.o;
   }
}
