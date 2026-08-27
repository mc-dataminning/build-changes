import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eaf extends eas {
   public static final Codec<eaf> a = dqr.a.c.fieldOf("step").xmap(eaf::new, $$0 -> $$0.c).codec();
   private final dqr.a c;

   private eaf(dqr.a $$0) {
      this.c = $$0;
   }

   public static eaf a(dqr.a $$0) {
      return new eaf($$0);
   }

   @Override
   public Stream<hz> a_(eaq $$0, awp $$1, hz $$2) {
      cuy $$3 = new cuy($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eat<?> b() {
      return eat.o;
   }
}
