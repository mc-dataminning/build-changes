import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class esc extends esj {
   public static final MapCodec<esc> a = MapCodec.unit(() -> esc.b);
   public static final esc b = new esc();

   private esc() {
      super(esl.a.a);
   }

   @Override
   public jz a(eve $$0, dsz $$1) {
      return jz.i;
   }

   @Override
   public List<evd.a> a(eve $$0, iu $$1, dsz $$2, azv $$3) {
      return Collections.emptyList();
   }

   @Override
   public eqt a(eve $$0, iu $$1, dsz $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(eve $$0, djz $$1, djw $$2, ecf $$3, iu $$4, iu $$5, dsz $$6, eqt $$7, azv $$8, eun $$9, boolean $$10) {
      return true;
   }

   @Override
   public esk<?> a() {
      return esk.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
