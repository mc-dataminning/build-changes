import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ekn extends eku {
   public static final MapCodec<ekn> a = MapCodec.unit(() -> ekn.b);
   public static final ekn b = new ekn();

   private ekn() {
      super(ekw.a.a);
   }

   @Override
   public kh a(eno $$0, dmk $$1) {
      return kh.g;
   }

   @Override
   public List<enn.c> a(eno $$0, jd $$1, dmk $$2, ayv $$3) {
      return Collections.emptyList();
   }

   @Override
   public eje a(eno $$0, jd $$1, dmk $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eno $$0, ddq $$1, ddo $$2, dux $$3, jd $$4, jd $$5, dmk $$6, eje $$7, ayv $$8, boolean $$9) {
      return true;
   }

   @Override
   public ekv<?> a() {
      return ekv.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
