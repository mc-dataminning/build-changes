import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class enc extends enj {
   public static final MapCodec<enc> a = MapCodec.unit(() -> enc.b);
   public static final enc b = new enc();

   private enc() {
      super(enl.a.a);
   }

   @Override
   public kl a(eqe $$0, dow $$1) {
      return kl.g;
   }

   @Override
   public List<eqd.c> a(eqe $$0, jh $$1, dow $$2, azv $$3) {
      return Collections.emptyList();
   }

   @Override
   public elt a(eqe $$0, jh $$1, dow $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eqe $$0, dgd $$1, dgb $$2, dxk $$3, jh $$4, jh $$5, dow $$6, elt $$7, azv $$8, epn $$9, boolean $$10) {
      return true;
   }

   @Override
   public enk<?> a() {
      return enk.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
