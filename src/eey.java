import com.mojang.serialization.Codec;
import java.util.List;

public class eey extends efa {
   public static final Codec<eey> a = a(eey::new);

   eey(List<efj> $$0) {
      super($$0, efl.b($$0));
   }

   @Override
   public efk b() {
      return efl.c;
   }

   public static eey.a a(efj.a... $$0) {
      return new eey.a($$0);
   }

   public static class a extends efa.a {
      public a(efj.a... $$0) {
         super($$0);
      }

      @Override
      public eey.a or(efj.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efj a(List<efj> $$0) {
         return new eey($$0);
      }
   }
}
