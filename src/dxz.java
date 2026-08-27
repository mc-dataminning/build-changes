import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dxz extends dym {
   public static final Codec<dxz> a = dol.a.c.fieldOf("step").xmap(dxz::new, $$0 -> $$0.c).codec();
   private final dol.a c;

   private dxz(dol.a $$0) {
      this.c = $$0;
   }

   public static dxz a(dol.a $$0) {
      return new dxz($$0);
   }

   @Override
   public Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      csv $$3 = new csv($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dyn<?> b() {
      return dyn.o;
   }
}
