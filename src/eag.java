import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;

public class eag extends ean {
   public static final Codec<eag> a = Codec.unit(() -> eag.b);
   public static final eag b = new eag();

   private eag() {
      super(eap.a.a);
   }

   @Override
   public jb a(edh $$0, ddc $$1) {
      return jb.g;
   }

   @Override
   public List<edg.c> a(edh $$0, hx $$1, ddc $$2, auv $$3) {
      return Collections.emptyList();
   }

   @Override
   public dyy a(edh $$0, hx $$1, ddc $$2) {
      throw new IllegalStateException("Invalid call to EmtyPoolElement.getBoundingBox, filter me!");
   }

   @Override
   public boolean a(edh $$0, cuk $$1, cui $$2, dle $$3, hx $$4, hx $$5, ddc $$6, dyy $$7, auv $$8, boolean $$9) {
      return true;
   }

   @Override
   public eao<?> a() {
      return eao.d;
   }

   @Override
   public String toString() {
      return "Empty";
   }
}
