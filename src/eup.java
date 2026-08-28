import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eup extends eus {
   public static final MapCodec<eup> a = a(eup::new);
   public static final Codec<eup> b = b(eup::new);

   eup(List<evc> $$0) {
      super($$0, ad.a($$0));
   }

   public static eup a(List<evc> $$0) {
      return new eup(List.copyOf($$0));
   }

   @Override
   public evd b() {
      return eve.c;
   }

   public static eup.a a(evc.a... $$0) {
      return new eup.a($$0);
   }

   public static class a extends eus.a {
      public a(evc.a... $$0) {
         super($$0);
      }

      @Override
      public eup.a and(evc.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected evc a(List<evc> $$0) {
         return new eup($$0);
      }
   }
}
