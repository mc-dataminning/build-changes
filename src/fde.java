import com.mojang.serialization.MapCodec;
import java.util.List;

public class fde extends fdg {
   public static final MapCodec<fde> a = a(fde::new);

   fde(List<fdq> $$0) {
      super($$0, ag.b($$0));
   }

   @Override
   public fdr b() {
      return fds.b;
   }

   public static fde.a a(fdq.a... $$0) {
      return new fde.a($$0);
   }

   public static class a extends fdg.a {
      public a(fdq.a... $$0) {
         super($$0);
      }

      @Override
      public fde.a or(fdq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fdq a(List<fdq> $$0) {
         return new fde($$0);
      }
   }
}
