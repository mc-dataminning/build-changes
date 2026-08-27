import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dvx extends dwe {
   public static final Codec<dvx> a = Codec.unit(() -> dvx.b);
   public static final dvx b = new dvx();

   private dvx() {
      super(dwg.a.a);
   }

   @Override
   public ia a(dyr $$0, cyw $$1) {
      return ia.g;
   }

   @Override
   public List<dyq.c> a(dyr $$0, gv $$1, cyw $$2, art $$3) {
      return Collections.emptyList();
   }

   @Override
   public dup a(dyr $$0, gv $$1, cyw $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dyr $$0, cqe $$1, cqc $$2, dgv $$3, gv $$4, gv $$5, cyw $$6, dup $$7, art $$8, boolean $$9) {
      return true;
   }

   @Override
   public dwf<?> a() {
      return dwf.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
