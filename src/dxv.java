import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dxv extends dyc {
   public static final Codec<dxv> a = Codec.unit(() -> dxv.b);
   public static final dxv b = new dxv();

   private dxv() {
      super(dye.a.a);
   }

   @Override
   public iw a(eaw $$0, dbf $$1) {
      return iw.g;
   }

   @Override
   public List<eav.c> a(eaw $$0, ht $$1, dbf $$2, ato $$3) {
      return Collections.emptyList();
   }

   @Override
   public dwn a(eaw $$0, ht $$1, dbf $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eaw $$0, csm $$1, csk $$2, dit $$3, ht $$4, ht $$5, dbf $$6, dwn $$7, ato $$8, boolean $$9) {
      return true;
   }

   @Override
   public dyd<?> a() {
      return dyd.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
