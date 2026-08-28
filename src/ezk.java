import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezk extends ezn {
   public static final MapCodec<ezk> a = a(ezk::new);
   public static final Codec<ezk> b = b(ezk::new);

   ezk(List<ezx> $$0) {
      super($$0, ae.a($$0));
   }

   public static ezk a(List<ezx> $$0) {
      return new ezk(List.copyOf($$0));
   }

   @Override
   public ezy b() {
      return ezz.c;
   }

   public static ezk.a a(ezx.a... $$0) {
      return new ezk.a($$0);
   }

   public static class a extends ezn.a {
      public a(ezx.a... $$0) {
         super($$0);
      }

      @Override
      public ezk.a and(ezx.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezx a(List<ezx> $$0) {
         return new ezk($$0);
      }
   }
}
