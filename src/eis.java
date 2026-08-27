import com.mojang.serialization.Codec;
import java.util.List;

public class eis extends eiu {
   public static final Codec<eis> a = a(eis::new);

   eis(List<ejd> $$0) {
      super($$0, ejf.b($$0));
   }

   @Override
   public eje b() {
      return ejf.c;
   }

   public static eis.a a(ejd.a... $$0) {
      return new eis.a($$0);
   }

   public static class a extends eiu.a {
      public a(ejd.a... $$0) {
         super($$0);
      }

      @Override
      public eis.a or(ejd.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ejd a(List<ejd> $$0) {
         return new eis($$0);
      }
   }
}
