import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class duc extends dup {
   public static final Codec<duc> a = dko.a.c.fieldOf("step").xmap(duc::new, $$0 -> $$0.c).codec();
   private final dko.a c;

   private duc(dko.a $$0) {
      this.c = $$0;
   }

   public static duc a(dko.a $$0) {
      return new duc($$0);
   }

   @Override
   public Stream<gw> a_(dun $$0, asc $$1, gw $$2) {
      cpc $$3 = new cpc($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public duq<?> b() {
      return duq.o;
   }
}
