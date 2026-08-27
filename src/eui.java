import com.mojang.serialization.Codec;
import java.util.List;

public class eui extends eul {
   public static final Codec<eui> a = a(eui::new);
   public static final Codec<eui> b = b(eui::new);

   eui(List<euu> $$0) {
      super($$0, ad.a($$0));
   }

   public static eui a(List<euu> $$0) {
      return new eui(List.copyOf($$0));
   }

   @Override
   public euv b() {
      return euw.e;
   }

   public static eui.a a(euu.a... $$0) {
      return new eui.a($$0);
   }

   public static class a extends eul.a {
      public a(euu.a... $$0) {
         super($$0);
      }

      @Override
      public eui.a and(euu.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euu a(List<euu> $$0) {
         return new eui($$0);
      }
   }
}
