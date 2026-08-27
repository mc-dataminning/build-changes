import com.mojang.serialization.Codec;
import java.util.List;

public class eeu extends eex {
   public static final Codec<eeu> a = a(eeu::new);
   public static final Codec<eeu> b = b(eeu::new);

   eeu(List<efg> $$0) {
      super($$0, efi.a($$0));
   }

   public static eeu a(List<efg> $$0) {
      return new eeu(List.copyOf($$0));
   }

   @Override
   public efh b() {
      return efi.d;
   }

   public static eeu.a a(efg.a... $$0) {
      return new eeu.a($$0);
   }

   public static class a extends eex.a {
      public a(efg.a... $$0) {
         super($$0);
      }

      @Override
      public eeu.a and(efg.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efg a(List<efg> $$0) {
         return new eeu($$0);
      }
   }
}
