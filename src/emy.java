import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class emy extends enf {
   public static final MapCodec<emy> a = MapCodec.unit(() -> emy.b);
   public static final emy b = new emy();

   private emy() {
      super(enh.a.a);
   }

   @Override
   public kl a(eqa $$0, dor $$1) {
      return kl.g;
   }

   @Override
   public List<epz.c> a(eqa $$0, jh $$1, dor $$2, azs $$3) {
      return Collections.emptyList();
   }

   @Override
   public elp a(eqa $$0, jh $$1, dor $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eqa $$0, dfy $$1, dfw $$2, dxg $$3, jh $$4, jh $$5, dor $$6, elp $$7, azs $$8, epj $$9, boolean $$10) {
      return true;
   }

   @Override
   public eng<?> a() {
      return eng.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
