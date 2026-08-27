import com.mojang.serialization.Codec;
import java.util.List;

public class eev extends eex {
   public static final Codec<eev> a = a(eev::new);

   eev(List<efg> $$0) {
      super($$0, efi.b($$0));
   }

   @Override
   public efh b() {
      return efi.c;
   }

   public static eev.a a(efg.a... $$0) {
      return new eev.a($$0);
   }

   public static class a extends eex.a {
      public a(efg.a... $$0) {
         super($$0);
      }

      @Override
      public eev.a or(efg.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efg a(List<efg> $$0) {
         return new eev($$0);
      }
   }
}
