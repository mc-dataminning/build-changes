import com.mojang.serialization.Codec;
import java.util.List;

public class ehk extends ehn {
   public static final Codec<ehk> a = a(ehk::new);
   public static final Codec<ehk> b = b(ehk::new);

   ehk(List<ehw> $$0) {
      super($$0, ehy.a($$0));
   }

   public static ehk a(List<ehw> $$0) {
      return new ehk(List.copyOf($$0));
   }

   @Override
   public ehx b() {
      return ehy.d;
   }

   public static ehk.a a(ehw.a... $$0) {
      return new ehk.a($$0);
   }

   public static class a extends ehn.a {
      public a(ehw.a... $$0) {
         super($$0);
      }

      @Override
      public ehk.a and(ehw.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ehw a(List<ehw> $$0) {
         return new ehk($$0);
      }
   }
}
