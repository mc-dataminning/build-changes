import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dzy extends eal {
   public static final Codec<dzy> a = dqk.a.c.fieldOf("step").xmap(dzy::new, $$0 -> $$0.c).codec();
   private final dqk.a c;

   private dzy(dqk.a $$0) {
      this.c = $$0;
   }

   public static dzy a(dqk.a $$0) {
      return new dzy($$0);
   }

   @Override
   public Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      cuu $$3 = new cuu($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public eam<?> b() {
      return eam.o;
   }
}
