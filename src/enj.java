import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class enj extends enq {
   public static final MapCodec<enj> a = MapCodec.unit(() -> enj.b);
   public static final enj b = new enj();

   private enj() {
      super(ens.a.a);
   }

   @Override
   public kl a(eql $$0, dpd $$1) {
      return kl.g;
   }

   @Override
   public List<eqk.c> a(eql $$0, jh $$1, dpd $$2, azu $$3) {
      return Collections.emptyList();
   }

   @Override
   public ema a(eql $$0, jh $$1, dpd $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eql $$0, dgk $$1, dgi $$2, dxr $$3, jh $$4, jh $$5, dpd $$6, ema $$7, azu $$8, epu $$9, boolean $$10) {
      return true;
   }

   @Override
   public enr<?> a() {
      return enr.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
