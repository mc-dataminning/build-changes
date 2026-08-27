import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;

public class eij extends eiq {
   public static final MapCodec<eij> a = MapCodec.unit(() -> eij.b);
   public static final eij b = new eij();

   private eij() {
      super(eis.a.a);
   }

   @Override
   public js a(elk $$0, dkl $$1) {
      return js.g;
   }

   @Override
   public List<elj.c> a(elk $$0, io $$1, dkl $$2, ayk $$3) {
      return Collections.emptyList();
   }

   @Override
   public ehb a(elk $$0, io $$1, dkl $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(elk $$0, dbs $$1, dbq $$2, dsy $$3, io $$4, io $$5, dkl $$6, ehb $$7, ayk $$8, boolean $$9) {
      return true;
   }

   @Override
   public eir<?> a() {
      return eir.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
