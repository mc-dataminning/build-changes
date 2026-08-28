import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fdp extends fds {
   public static final MapCodec<fdp> a = a(fdp::new);
   public static final Codec<fdp> b = b(fdp::new);

   fdp(List<fec> $$0) {
      super($$0, ag.a($$0));
   }

   public static fdp a(List<fec> $$0) {
      return new fdp(List.copyOf($$0));
   }

   @Override
   public fed b() {
      return fee.c;
   }

   public static fdp.a a(fec.a... $$0) {
      return new fdp.a($$0);
   }

   public static class a extends fds.a {
      public a(fec.a... $$0) {
         super($$0);
      }

      @Override
      public fdp.a and(fec.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fec a(List<fec> $$0) {
         return new fdp($$0);
      }
   }
}
