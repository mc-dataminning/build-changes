import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eeb extends eeo {
   public static final Codec<eeb> a = dun.a.c.fieldOf("step").xmap(eeb::new, $$0 -> $$0.c).codec();
   private final dun.a c;

   private eeb(dun.a $$0) {
      this.c = $$0;
   }

   public static eeb a(dun.a $$0) {
      return new eeb($$0);
   }

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      cye $$3 = new cye($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eep<?> b() {
      return eep.o;
   }
}
