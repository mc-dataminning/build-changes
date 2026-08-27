import com.mojang.serialization.Codec;
import java.util.List;

public class eex extends efa {
   public static final Codec<eex> a = a(eex::new);
   public static final Codec<eex> b = b(eex::new);

   eex(List<efj> $$0) {
      super($$0, efl.a($$0));
   }

   public static eex a(List<efj> $$0) {
      return new eex(List.copyOf($$0));
   }

   @Override
   public efk b() {
      return efl.d;
   }

   public static eex.a a(efj.a... $$0) {
      return new eex.a($$0);
   }

   public static class a extends efa.a {
      public a(efj.a... $$0) {
         super($$0);
      }

      @Override
      public eex.a and(efj.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efj a(List<efj> $$0) {
         return new eex($$0);
      }
   }
}
