import com.mojang.serialization.Codec;
import java.util.List;

public class ejk extends ejm {
   public static final Codec<ejk> a = a(ejk::new);

   ejk(List<ejv> $$0) {
      super($$0, ejx.b($$0));
   }

   @Override
   public ejw b() {
      return ejx.c;
   }

   public static ejk.a a(ejv.a... $$0) {
      return new ejk.a($$0);
   }

   public static class a extends ejm.a {
      public a(ejv.a... $$0) {
         super($$0);
      }

      @Override
      public ejk.a or(ejv.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ejv a(List<ejv> $$0) {
         return new ejk($$0);
      }
   }
}
