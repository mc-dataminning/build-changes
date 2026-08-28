import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eig extends eit {
   public static final MapCodec<eig> a = dyr.a.c.fieldOf("step").xmap(eig::new, $$0 -> $$0.c);
   private final dyr.a c;

   private eig(dyr.a $$0) {
      this.c = $$0;
   }

   public static eig a(dyr.a $$0) {
      return new eig($$0);
   }

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      dcb $$3 = new dcb($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eiu<?> b() {
      return eiu.o;
   }
}
