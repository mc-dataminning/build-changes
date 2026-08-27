import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class egq extends egx {
   public static final Codec<egq> a = Codec.unit(() -> egq.b);
   public static final egq b = new egq();

   private egq() {
      super(egz.a.a);
   }

   @Override
   public ji a(ejr $$0, dit $$1) {
      return ji.g;
   }

   @Override
   public List<ejq.c> a(ejr $$0, id $$1, dit $$2, axt $$3) {
      return Collections.emptyList();
   }

   @Override
   public efi a(ejr $$0, id $$1, dit $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ejr $$0, dab $$1, czz $$2, drf $$3, id $$4, id $$5, dit $$6, efi $$7, axt $$8, boolean $$9) {
      return true;
   }

   @Override
   public egy<?> a() {
      return egy.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
