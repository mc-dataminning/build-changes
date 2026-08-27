import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class eee extends eel {
   public static final Codec<eee> a = Codec.unit(() -> eee.b);
   public static final eee b = new eee();

   private eee() {
      super(een.a.a);
   }

   @Override
   public jg a(ehf $$0, dgo $$1) {
      return jg.g;
   }

   @Override
   public List<ehe.c> a(ehf $$0, ib $$1, dgo $$2, axd $$3) {
      return Collections.emptyList();
   }

   @Override
   public ecw a(ehf $$0, ib $$1, dgo $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ehf $$0, cxw $$1, cxu $$2, doy $$3, ib $$4, ib $$5, dgo $$6, ecw $$7, axd $$8, boolean $$9) {
      return true;
   }

   @Override
   public eem<?> a() {
      return eem.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
