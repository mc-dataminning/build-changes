import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eil extends eis {
   public static final MapCodec<eil> a = MapCodec.unit(() -> eil.b);
   public static final eil b = new eil();

   private eil() {
      super(eiu.a.a);
   }

   @Override
   public js a(elm $$0, dkn $$1) {
      return js.g;
   }

   @Override
   public List<ell.c> a(elm $$0, io $$1, dkn $$2, aym $$3) {
      return Collections.emptyList();
   }

   @Override
   public ehd a(elm $$0, io $$1, dkn $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(elm $$0, dbu $$1, dbs $$2, dta $$3, io $$4, io $$5, dkn $$6, ehd $$7, aym $$8, boolean $$9) {
      return true;
   }

   @Override
   public eit<?> a() {
      return eit.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
