import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class eij extends eiw {
   public static final MapCodec<eij> a = dyu.a.c.fieldOf("step").xmap(eij::new, $$0 -> $$0.c);
   private final dyu.a c;

   private eij(dyu.a $$0) {
      this.c = $$0;
   }

   public static eij a(dyu.a $$0) {
      return new eij($$0);
   }

   @Override
   public Stream<jd> a_(eiu $$0, ayw $$1, jd $$2) {
      dcd $$3 = new dcd($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eix<?> b() {
      return eix.o;
   }
}
