import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eim extends eja {
   public static final Codec<eim> a = dyq.a.c.fieldOf("step").xmap(eim::new, $$0 -> $$0.c).codec();
   private final dyq.a c;

   private eim(dyq.a $$0) {
      this.c = $$0;
   }

   public static eim a(dyq.a $$0) {
      return new eim($$0);
   }

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      dbh $$3 = new dbh($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public ejb<?> b() {
      return ejb.p;
   }
}
