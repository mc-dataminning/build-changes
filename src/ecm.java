import com.mojang.serialization.Codec;

public class ecm extends edi {
   public static final Codec<ecm> a = Codec.unit(() -> ecm.b);
   public static final ecm b = new ecm();

   private ecm() {
   }

   @Override
   public boolean a(djp $$0, auw $$1) {
      return true;
   }

   @Override
   protected edj<?> a() {
      return edj.a;
   }
}
