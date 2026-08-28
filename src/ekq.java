import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ekq extends ekx {
   public static final MapCodec<ekq> a = MapCodec.unit(() -> ekq.b);
   public static final ekq b = new ekq();

   private ekq() {
      super(ekz.a.a);
   }

   @Override
   public kh a(ens $$0, dmm $$1) {
      return kh.g;
   }

   @Override
   public List<enr.c> a(ens $$0, jd $$1, dmm $$2, ayw $$3) {
      return Collections.emptyList();
   }

   @Override
   public ejh a(ens $$0, jd $$1, dmm $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ens $$0, dds $$1, ddq $$2, duz $$3, jd $$4, jd $$5, dmm $$6, ejh $$7, ayw $$8, enb $$9, boolean $$10) {
      return true;
   }

   @Override
   public eky<?> a() {
      return eky.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
