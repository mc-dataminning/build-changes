import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exl extends exo {
   public static final MapCodec<exl> a = a(exl::new);
   public static final Codec<exl> b = b(exl::new);

   exl(List<exy> $$0) {
      super($$0, ae.a($$0));
   }

   public static exl a(List<exy> $$0) {
      return new exl(List.copyOf($$0));
   }

   @Override
   public exz b() {
      return eya.c;
   }

   public static exl.a a(exy.a... $$0) {
      return new exl.a($$0);
   }

   public static class a extends exo.a {
      public a(exy.a... $$0) {
         super($$0);
      }

      @Override
      public exl.a and(exy.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exy a(List<exy> $$0) {
         return new exl($$0);
      }
   }
}
