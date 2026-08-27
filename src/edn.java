import com.mojang.serialization.Codec;

public class edn extends ebk {
   public static final Codec<edn> d = a(edn::new);

   public edn(ebl.c $$0) {
      super(edm::new, 12, 15, $$0);
   }

   @Override
   public ebu<?> e() {
      return ebu.g;
   }
}
