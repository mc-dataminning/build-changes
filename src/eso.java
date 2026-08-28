import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eso extends esv {
   public static final MapCodec<eso> a = MapCodec.unit(() -> eso.b);
   public static final eso b = new eso();

   private eso() {
      super(esx.a.a);
   }

   @Override
   public ka a(evq $$0, dtl $$1) {
      return ka.i;
   }

   @Override
   public List<evp.a> a(evq $$0, iv $$1, dtl $$2, azv $$3) {
      return Collections.emptyList();
   }

   @Override
   public erf a(evq $$0, iv $$1, dtl $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(evq $$0, dkl $$1, dki $$2, ecr $$3, iv $$4, iv $$5, dtl $$6, erf $$7, azv $$8, euz $$9, boolean $$10) {
      return true;
   }

   @Override
   public esw<?> a() {
      return esw.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
