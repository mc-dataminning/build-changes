import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dxa extends dxh {
   public static final Codec<dxa> a = Codec.unit(() -> dxa.b);
   public static final dxa b = new dxa();

   private dxa() {
      super(dxj.a.a);
   }

   @Override
   public iw a(dzu $$0, dal $$1) {
      return iw.g;
   }

   @Override
   public List<dzt.c> a(dzu $$0, ht $$1, dal $$2, ate $$3) {
      return Collections.emptyList();
   }

   @Override
   public dvs a(dzu $$0, ht $$1, dal $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dzu $$0, crt $$1, crr $$2, dhy $$3, ht $$4, ht $$5, dal $$6, dvs $$7, ate $$8, boolean $$9) {
      return true;
   }

   @Override
   public dxi<?> a() {
      return dxi.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
