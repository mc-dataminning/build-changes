import com.mojang.serialization.Codec;
import java.util.List;

public class ejj extends ejm {
   public static final Codec<ejj> a = a(ejj::new);
   public static final Codec<ejj> b = b(ejj::new);

   ejj(List<ejv> $$0) {
      super($$0, ejx.a($$0));
   }

   public static ejj a(List<ejv> $$0) {
      return new ejj(List.copyOf($$0));
   }

   @Override
   public ejw b() {
      return ejx.d;
   }

   public static ejj.a a(ejv.a... $$0) {
      return new ejj.a($$0);
   }

   public static class a extends ejm.a {
      public a(ejv.a... $$0) {
         super($$0);
      }

      @Override
      public ejj.a and(ejv.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ejv a(List<ejv> $$0) {
         return new ejj($$0);
      }
   }
}
