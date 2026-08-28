import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezl extends ezo {
   public static final MapCodec<ezl> a = a(ezl::new);
   public static final Codec<ezl> b = b(ezl::new);

   ezl(List<ezy> $$0) {
      super($$0, ae.a($$0));
   }

   public static ezl a(List<ezy> $$0) {
      return new ezl(List.copyOf($$0));
   }

   @Override
   public ezz b() {
      return faa.c;
   }

   public static ezl.a a(ezy.a... $$0) {
      return new ezl.a($$0);
   }

   public static class a extends ezo.a {
      public a(ezy.a... $$0) {
         super($$0);
      }

      @Override
      public ezl.a and(ezy.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezy a(List<ezy> $$0) {
         return new ezl($$0);
      }
   }
}
