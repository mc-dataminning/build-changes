import com.mojang.serialization.Codec;
import java.util.List;

public class efw extends efy {
   public static final Codec<efw> a = a(efw::new);

   efw(List<egh> $$0) {
      super($$0, egj.b($$0));
   }

   @Override
   public egi b() {
      return egj.c;
   }

   public static efw.a a(egh.a... $$0) {
      return new efw.a($$0);
   }

   public static class a extends efy.a {
      public a(egh.a... $$0) {
         super($$0);
      }

      @Override
      public efw.a or(egh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected egh a(List<egh> $$0) {
         return new efw($$0);
      }
   }
}
