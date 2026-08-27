import com.mojang.serialization.Codec;
import java.util.List;

public class egy extends ehb {
   public static final Codec<egy> a = a(egy::new);
   public static final Codec<egy> b = b(egy::new);

   egy(List<ehk> $$0) {
      super($$0, ehm.a($$0));
   }

   public static egy a(List<ehk> $$0) {
      return new egy(List.copyOf($$0));
   }

   @Override
   public ehl b() {
      return ehm.d;
   }

   public static egy.a a(ehk.a... $$0) {
      return new egy.a($$0);
   }

   public static class a extends ehb.a {
      public a(ehk.a... $$0) {
         super($$0);
      }

      @Override
      public egy.a and(ehk.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ehk a(List<ehk> $$0) {
         return new egy($$0);
      }
   }
}
