import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dym extends dyt {
   public static final Codec<dym> a = Codec.unit(() -> dym.b);
   public static final dym b = new dym();

   private dym() {
      super(dyv.a.a);
   }

   @Override
   public ja a(ebn $$0, dbr $$1) {
      return ja.g;
   }

   @Override
   public List<ebm.c> a(ebn $$0, hx $$1, dbr $$2, atw $$3) {
      return Collections.emptyList();
   }

   @Override
   public dxe a(ebn $$0, hx $$1, dbr $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ebn $$0, csz $$1, csx $$2, djk $$3, hx $$4, hx $$5, dbr $$6, dxe $$7, atw $$8, boolean $$9) {
      return true;
   }

   @Override
   public dyu<?> a() {
      return dyu.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
