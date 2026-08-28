import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eru extends esb {
   public static final MapCodec<eru> a = MapCodec.unit(() -> eru.b);
   public static final eru b = new eru();

   private eru() {
      super(esd.a.a);
   }

   @Override
   public jz a(euw $$0, dst $$1) {
      return jz.i;
   }

   @Override
   public List<euv.a> a(euw $$0, iu $$1, dst $$2, azv $$3) {
      return Collections.emptyList();
   }

   @Override
   public eql a(euw $$0, iu $$1, dst $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(euw $$0, dju $$1, djr $$2, ebx $$3, iu $$4, iu $$5, dst $$6, eql $$7, azv $$8, euf $$9, boolean $$10) {
      return true;
   }

   @Override
   public esc<?> a() {
      return esc.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
