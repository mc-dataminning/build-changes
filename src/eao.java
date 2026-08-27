import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class eao extends eav {
   public static final Codec<eao> a = Codec.unit(() -> eao.b);
   public static final eao b = new eao();

   private eao() {
      super(eax.a.a);
   }

   @Override
   public jb a(edp $$0, ddk $$1) {
      return jb.g;
   }

   @Override
   public List<edo.c> a(edp $$0, hx $$1, ddk $$2, auw $$3) {
      return Collections.emptyList();
   }

   @Override
   public dzg a(edp $$0, hx $$1, ddk $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(edp $$0, cus $$1, cuq $$2, dlm $$3, hx $$4, hx $$5, ddk $$6, dzg $$7, auw $$8, boolean $$9) {
      return true;
   }

   @Override
   public eaw<?> a() {
      return eaw.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
