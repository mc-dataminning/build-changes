import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eik extends eiy {
   public static final MapCodec<eik> a = dyu.a.c.fieldOf("step").xmap(eik::new, $$0 -> $$0.c);
   private final dyu.a c;

   private eik(dyu.a $$0) {
      this.c = $$0;
   }

   public static eik a(dyu.a $$0) {
      return new eik($$0);
   }

   @Override
   public Stream<jd> a_(eiw $$0, ayw $$1, jd $$2) {
      dcd $$3 = new dcd($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eiz<?> b() {
      return eiz.o;
   }
}
