import com.mojang.serialization.Codec;
import java.util.List;

public class eir extends eiu {
   public static final Codec<eir> a = a(eir::new);
   public static final Codec<eir> b = b(eir::new);

   eir(List<ejd> $$0) {
      super($$0, ejf.a($$0));
   }

   public static eir a(List<ejd> $$0) {
      return new eir(List.copyOf($$0));
   }

   @Override
   public eje b() {
      return ejf.d;
   }

   public static eir.a a(ejd.a... $$0) {
      return new eir.a($$0);
   }

   public static class a extends eiu.a {
      public a(ejd.a... $$0) {
         super($$0);
      }

      @Override
      public eir.a and(ejd.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ejd a(List<ejd> $$0) {
         return new eir($$0);
      }
   }
}
