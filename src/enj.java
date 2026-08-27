import com.mojang.serialization.Codec;
import java.util.List;

public class enj extends enm {
   public static final Codec<enj> a = a(enj::new);
   public static final Codec<enj> b = b(enj::new);

   enj(List<env> $$0) {
      super($$0, ac.a($$0));
   }

   public static enj a(List<env> $$0) {
      return new enj(List.copyOf($$0));
   }

   @Override
   public enw b() {
      return enx.d;
   }

   public static enj.a a(env.a... $$0) {
      return new enj.a($$0);
   }

   public static class a extends enm.a {
      public a(env.a... $$0) {
         super($$0);
      }

      @Override
      public enj.a and(env.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected env a(List<env> $$0) {
         return new enj($$0);
      }
   }
}
