import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dwc extends dwj {
   public static final Codec<dwc> a = Codec.unit(() -> dwc.b);
   public static final dwc b = new dwc();

   private dwc() {
      super(dwl.a.a);
   }

   @Override
   public hy a(dyw $$0, czn $$1) {
      return hy.g;
   }

   @Override
   public List<dyv.c> a(dyw $$0, gw $$1, czn $$2, ash $$3) {
      return Collections.emptyList();
   }

   @Override
   public duu a(dyw $$0, gw $$1, czn $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dyw $$0, cqv $$1, cqt $$2, dha $$3, gw $$4, gw $$5, czn $$6, duu $$7, ash $$8, boolean $$9) {
      return true;
   }

   @Override
   public dwk<?> a() {
      return dwk.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
