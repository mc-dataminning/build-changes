import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eoo extends eov {
   public static final MapCodec<eoo> a = MapCodec.unit(() -> eoo.b);
   public static final eoo b = new eoo();

   private eoo() {
      super(eox.a.a);
   }

   @Override
   public km a(erq $$0, dqf $$1) {
      return km.h;
   }

   @Override
   public List<erp.a> a(erq $$0, ji $$1, dqf $$2, azh $$3) {
      return Collections.emptyList();
   }

   @Override
   public enf a(erq $$0, ji $$1, dqf $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(erq $$0, dhh $$1, dhf $$2, dyu $$3, ji $$4, ji $$5, dqf $$6, enf $$7, azh $$8, eqz $$9, boolean $$10) {
      return true;
   }

   @Override
   public eow<?> a() {
      return eow.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
