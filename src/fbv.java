import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbv extends fby {
   public static final MapCodec<fbv> a = a(fbv::new);
   public static final Codec<fbv> b = b(fbv::new);

   fbv(List<fci> $$0) {
      super($$0, af.a($$0));
   }

   public static fbv a(List<fci> $$0) {
      return new fbv(List.copyOf($$0));
   }

   @Override
   public fcj b() {
      return fck.c;
   }

   public static fbv.a a(fci.a... $$0) {
      return new fbv.a($$0);
   }

   public static class a extends fby.a {
      public a(fci.a... $$0) {
         super($$0);
      }

      @Override
      public fbv.a and(fci.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fci a(List<fci> $$0) {
         return new fbv($$0);
      }
   }
}
