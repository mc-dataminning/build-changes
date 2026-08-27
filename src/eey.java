import com.mojang.serialization.Codec;
import java.util.List;

public class eey extends efb {
   public static final Codec<eey> a = a(eey::new);
   public static final Codec<eey> b = b(eey::new);

   eey(List<efk> $$0) {
      super($$0, efm.a($$0));
   }

   public static eey a(List<efk> $$0) {
      return new eey(List.copyOf($$0));
   }

   @Override
   public efl b() {
      return efm.d;
   }

   public static eey.a a(efk.a... $$0) {
      return new eey.a($$0);
   }

   public static class a extends efb.a {
      public a(efk.a... $$0) {
         super($$0);
      }

      @Override
      public eey.a and(efk.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efk a(List<efk> $$0) {
         return new eey($$0);
      }
   }
}
