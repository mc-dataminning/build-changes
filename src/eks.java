import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eks extends ekz {
   public static final MapCodec<eks> a = MapCodec.unit(() -> eks.b);
   public static final eks b = new eks();

   private eks() {
      super(elb.a.a);
   }

   @Override
   public kh a(enu $$0, dmm $$1) {
      return kh.g;
   }

   @Override
   public List<ent.c> a(enu $$0, jd $$1, dmm $$2, ayw $$3) {
      return Collections.emptyList();
   }

   @Override
   public ejj a(enu $$0, jd $$1, dmm $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(enu $$0, dds $$1, ddq $$2, duz $$3, jd $$4, jd $$5, dmm $$6, ejj $$7, ayw $$8, end $$9, boolean $$10) {
      return true;
   }

   @Override
   public ela<?> a() {
      return ela.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
