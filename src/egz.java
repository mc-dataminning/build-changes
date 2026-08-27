import com.mojang.serialization.Codec;
import java.util.List;

public class egz extends ehb {
   public static final Codec<egz> a = a(egz::new);

   egz(List<ehk> $$0) {
      super($$0, ehm.b($$0));
   }

   @Override
   public ehl b() {
      return ehm.c;
   }

   public static egz.a a(ehk.a... $$0) {
      return new egz.a($$0);
   }

   public static class a extends ehb.a {
      public a(ehk.a... $$0) {
         super($$0);
      }

      @Override
      public egz.a or(ehk.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ehk a(List<ehk> $$0) {
         return new egz($$0);
      }
   }
}
