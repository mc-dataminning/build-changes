import com.mojang.serialization.Codec;
import java.util.List;

public class efg extends efi {
   public static final Codec<efg> a = a(efg::new);

   efg(List<efr> $$0) {
      super($$0, eft.b($$0));
   }

   @Override
   public efs b() {
      return eft.c;
   }

   public static efg.a a(efr.a... $$0) {
      return new efg.a($$0);
   }

   public static class a extends efi.a {
      public a(efr.a... $$0) {
         super($$0);
      }

      @Override
      public efg.a or(efr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efr a(List<efr> $$0) {
         return new efg($$0);
      }
   }
}
