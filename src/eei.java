import com.mojang.serialization.Codec;

public class eei extends ecf {
   public static final Codec<eei> d = a(eei::new);

   public eei(ecg.c $$0) {
      super(eeh::new, 12, 15, $$0);
   }

   @Override
   public ecp<?> e() {
      return ecp.g;
   }
}
