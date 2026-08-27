import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eek extends eex {
   public static final Codec<eek> a = duw.a.c.fieldOf("step").xmap(eek::new, $$0 -> $$0.c).codec();
   private final duw.a c;

   private eek(duw.a $$0) {
      this.c = $$0;
   }

   public static eek a(duw.a $$0) {
      return new eek($$0);
   }

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      cyn $$3 = new cyn($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eey<?> b() {
      return eey.o;
   }
}
