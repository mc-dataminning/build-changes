import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class edg extends edn {
   public static final Codec<edg> a = Codec.unit(() -> edg.b);
   public static final edg b = new edg();

   private edg() {
      super(edp.a.a);
   }

   @Override
   public jf a(egh $$0, dfr $$1) {
      return jf.g;
   }

   @Override
   public List<egg.c> a(egh $$0, ib $$1, dfr $$2, awt $$3) {
      return Collections.emptyList();
   }

   @Override
   public eby a(egh $$0, ib $$1, dfr $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(egh $$0, cwz $$1, cwx $$2, dob $$3, ib $$4, ib $$5, dfr $$6, eby $$7, awt $$8, boolean $$9) {
      return true;
   }

   @Override
   public edo<?> a() {
      return edo.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
