import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dyh extends dyo {
   public static final Codec<dyh> a = Codec.unit(() -> dyh.b);
   public static final dyh b = new dyh();

   private dyh() {
      super(dyq.a.a);
   }

   @Override
   public iw a(ebi $$0, dbm $$1) {
      return iw.g;
   }

   @Override
   public List<ebh.c> a(ebi $$0, ht $$1, dbm $$2, ats $$3) {
      return Collections.emptyList();
   }

   @Override
   public dwz a(ebi $$0, ht $$1, dbm $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ebi $$0, csu $$1, css $$2, djf $$3, ht $$4, ht $$5, dbm $$6, dwz $$7, ats $$8, boolean $$9) {
      return true;
   }

   @Override
   public dyp<?> a() {
      return dyp.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
