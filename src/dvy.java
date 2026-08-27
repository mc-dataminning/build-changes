import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class dvy extends dwf {
   public static final Codec<dvy> a = Codec.unit(() -> dvy.b);
   public static final dvy b = new dvy();

   private dvy() {
      super(dwh.a.a);
   }

   @Override
   public hz a(dys $$0, cyx $$1) {
      return hz.g;
   }

   @Override
   public List<dyr.c> a(dys $$0, gu $$1, cyx $$2, aru $$3) {
      return Collections.emptyList();
   }

   @Override
   public duq a(dys $$0, gu $$1, cyx $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(dys $$0, cqf $$1, cqd $$2, dgw $$3, gu $$4, gu $$5, cyx $$6, duq $$7, aru $$8, boolean $$9) {
      return true;
   }

   @Override
   public dwg<?> a() {
      return dwg.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
