import com.mojang.serialization.Codec;
import java.util.List;

public class ehl extends ehn {
   public static final Codec<ehl> a = a(ehl::new);

   ehl(List<ehw> $$0) {
      super($$0, ehy.b($$0));
   }

   @Override
   public ehx b() {
      return ehy.c;
   }

   public static ehl.a a(ehw.a... $$0) {
      return new ehl.a($$0);
   }

   public static class a extends ehn.a {
      public a(ehw.a... $$0) {
         super($$0);
      }

      @Override
      public ehl.a or(ehw.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ehw a(List<ehw> $$0) {
         return new ehl($$0);
      }
   }
}
