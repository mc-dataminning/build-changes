import com.mojang.serialization.Codec;
import java.util.List;

public class efe extends efg {
   public static final Codec<efe> a = a(efe::new);

   efe(List<efp> $$0) {
      super($$0, efr.b($$0));
   }

   @Override
   public efq b() {
      return efr.c;
   }

   public static efe.a a(efp.a... $$0) {
      return new efe.a($$0);
   }

   public static class a extends efg.a {
      public a(efp.a... $$0) {
         super($$0);
      }

      @Override
      public efe.a or(efp.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efp a(List<efp> $$0) {
         return new efe($$0);
      }
   }
}
