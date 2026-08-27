import com.mojang.serialization.Codec;
import java.util.List;

public class eez extends efb {
   public static final Codec<eez> a = a(eez::new);

   eez(List<efk> $$0) {
      super($$0, efm.b($$0));
   }

   @Override
   public efl b() {
      return efm.c;
   }

   public static eez.a a(efk.a... $$0) {
      return new eez.a($$0);
   }

   public static class a extends efb.a {
      public a(efk.a... $$0) {
         super($$0);
      }

      @Override
      public eez.a or(efk.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efk a(List<efk> $$0) {
         return new eez($$0);
      }
   }
}
