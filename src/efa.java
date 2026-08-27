import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efa extends efn {
   public static final Codec<efa> a = dvm.a.c.fieldOf("step").xmap(efa::new, $$0 -> $$0.c).codec();
   private final dvm.a c;

   private efa(dvm.a $$0) {
      this.c = $$0;
   }

   public static efa a(dvm.a $$0) {
      return new efa($$0);
   }

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      czb $$3 = new czb($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public efo<?> b() {
      return efo.o;
   }
}
