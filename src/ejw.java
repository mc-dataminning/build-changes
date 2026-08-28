import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class ejw extends ekd {
   public static final MapCodec<ejw> a = MapCodec.unit(() -> ejw.b);
   public static final ejw b = new ejw();

   private ejw() {
      super(ekf.a.a);
   }

   @Override
   public ke a(emx $$0, dlu $$1) {
      return ke.g;
   }

   @Override
   public List<emw.c> a(emx $$0, ja $$1, dlu $$2, ayo $$3) {
      return Collections.emptyList();
   }

   @Override
   public eio a(emx $$0, ja $$1, dlu $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(emx $$0, ddb $$1, dcz $$2, duh $$3, ja $$4, ja $$5, dlu $$6, eio $$7, ayo $$8, boolean $$9) {
      return true;
   }

   @Override
   public eke<?> a() {
      return eke.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
