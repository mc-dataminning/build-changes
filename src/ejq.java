import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejq extends ejx {
   public static final MapCodec<ejq> a = MapCodec.unit(() -> ejq.b);
   public static final ejq b = new ejq();

   private ejq() {
      super(ejz.a.a);
   }

   @Override
   public ke a(emr $$0, dls $$1) {
      return ke.g;
   }

   @Override
   public List<emq.c> a(emr $$0, ja $$1, dls $$2, aym $$3) {
      return Collections.emptyList();
   }

   @Override
   public eii a(emr $$0, ja $$1, dls $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emr $$0, dcz $$1, dcx $$2, due $$3, ja $$4, ja $$5, dls $$6, eii $$7, aym $$8, boolean $$9) {
      return true;
   }

   @Override
   public ejy<?> a() {
      return ejy.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
