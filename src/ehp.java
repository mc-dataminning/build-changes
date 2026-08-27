import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class ehp extends ehw {
   public static final Codec<ehp> a = Codec.unit(() -> ehp.b);
   public static final ehp b = new ehp();

   private ehp() {
      super(ehy.a.a);
   }

   @Override
   public jr a(ekq $$0, djr $$1) {
      return jr.g;
   }

   @Override
   public List<ekp.c> a(ekq $$0, in $$1, djr $$2, ayg $$3) {
      return Collections.emptyList();
   }

   @Override
   public egh a(ekq $$0, in $$1, djr $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ekq $$0, day $$1, daw $$2, dse $$3, in $$4, in $$5, djr $$6, egh $$7, ayg $$8, boolean $$9) {
      return true;
   }

   @Override
   public ehx<?> a() {
      return ehx.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
