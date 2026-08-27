import com.mojang.serialization.Codec;
import java.util.List;

public class eff extends efi {
   public static final Codec<eff> a = a(eff::new);
   public static final Codec<eff> b = b(eff::new);

   eff(List<efr> $$0) {
      super($$0, eft.a($$0));
   }

   public static eff a(List<efr> $$0) {
      return new eff(List.copyOf($$0));
   }

   @Override
   public efs b() {
      return eft.d;
   }

   public static eff.a a(efr.a... $$0) {
      return new eff.a($$0);
   }

   public static class a extends efi.a {
      public a(efr.a... $$0) {
         super($$0);
      }

      @Override
      public eff.a and(efr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efr a(List<efr> $$0) {
         return new eff($$0);
      }
   }
}
