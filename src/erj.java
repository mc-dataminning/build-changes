import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class erj extends erq {
   public static final MapCodec<erj> a = MapCodec.unit(() -> erj.b);
   public static final erj b = new erj();

   private erj() {
      super(ers.a.a);
   }

   @Override
   public jz a(eul $$0, dsm $$1) {
      return jz.i;
   }

   @Override
   public List<euk.a> a(eul $$0, iu $$1, dsm $$2, azt $$3) {
      return Collections.emptyList();
   }

   @Override
   public eqa a(eul $$0, iu $$1, dsm $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eul $$0, djo $$1, djl $$2, ebm $$3, iu $$4, iu $$5, dsm $$6, eqa $$7, azt $$8, etu $$9, boolean $$10) {
      return true;
   }

   @Override
   public err<?> a() {
      return err.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
