import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class due extends dur {
   public static final Codec<due> a = dkq.a.c.fieldOf("step").xmap(due::new, $$0 -> $$0.c).codec();
   private final dkq.a c;

   private due(dkq.a $$0) {
      this.c = $$0;
   }

   public static due a(dkq.a $$0) {
      return new due($$0);
   }

   @Override
   public Stream<gw> a_(dup $$0, ase $$1, gw $$2) {
      cpe $$3 = new cpe($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dus<?> b() {
      return dus.o;
   }
}
