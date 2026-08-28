import com.mojang.serialization.MapCodec;
import java.util.List;

public class fdq extends fds {
   public static final MapCodec<fdq> a = a(fdq::new);

   fdq(List<fec> $$0) {
      super($$0, ag.b($$0));
   }

   @Override
   public fed b() {
      return fee.b;
   }

   public static fdq.a a(fec.a... $$0) {
      return new fdq.a($$0);
   }

   public static class a extends fds.a {
      public a(fec.a... $$0) {
         super($$0);
      }

      @Override
      public fdq.a or(fec.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fec a(List<fec> $$0) {
         return new fdq($$0);
      }
   }
}
