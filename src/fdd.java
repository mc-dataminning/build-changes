import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fdd extends fdg {
   public static final MapCodec<fdd> a = a(fdd::new);
   public static final Codec<fdd> b = b(fdd::new);

   fdd(List<fdq> $$0) {
      super($$0, ag.a($$0));
   }

   public static fdd a(List<fdq> $$0) {
      return new fdd(List.copyOf($$0));
   }

   @Override
   public fdr b() {
      return fds.c;
   }

   public static fdd.a a(fdq.a... $$0) {
      return new fdd.a($$0);
   }

   public static class a extends fdg.a {
      public a(fdq.a... $$0) {
         super($$0);
      }

      @Override
      public fdd.a and(fdq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fdq a(List<fdq> $$0) {
         return new fdd($$0);
      }
   }
}
