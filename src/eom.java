import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eom extends eot {
   public static final MapCodec<eom> a = MapCodec.unit(() -> eom.b);
   public static final eom b = new eom();

   private eom() {
      super(eov.a.a);
   }

   @Override
   public km a(ero $$0, dqd $$1) {
      return km.h;
   }

   @Override
   public List<ern.a> a(ero $$0, ji $$1, dqd $$2, azh $$3) {
      return Collections.emptyList();
   }

   @Override
   public end a(ero $$0, ji $$1, dqd $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(ero $$0, dhf $$1, dhd $$2, dys $$3, ji $$4, ji $$5, dqd $$6, end $$7, azh $$8, eqx $$9, boolean $$10) {
      return true;
   }

   @Override
   public eou<?> a() {
      return eou.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
