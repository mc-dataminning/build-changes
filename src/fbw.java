import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbw extends fby {
   public static final MapCodec<fbw> a = a(fbw::new);

   fbw(List<fci> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public fcj b() {
      return fck.b;
   }

   public static fbw.a a(fci.a... $$0) {
      return new fbw.a($$0);
   }

   public static class a extends fby.a {
      public a(fci.a... $$0) {
         super($$0);
      }

      @Override
      public fbw.a or(fci.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fci a(List<fci> $$0) {
         return new fbw($$0);
      }
   }
}
