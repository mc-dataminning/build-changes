import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class ehq extends eid {
   public static final MapCodec<ehq> a = dyb.a.c.fieldOf("step").xmap(ehq::new, $$0 -> $$0.c);
   private final dyb.a c;

   private ehq(dyb.a $$0) {
      this.c = $$0;
   }

   public static ehq a(dyb.a $$0) {
      return new ehq($$0);
   }

   @Override
   public Stream<ja> a_(eib $$0, ayo $$1, ja $$2) {
      dbm $$3 = new dbm($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eie<?> b() {
      return eie.o;
   }
}
