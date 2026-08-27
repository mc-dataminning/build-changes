import com.mojang.serialization.Codec;
import java.util.List;

public class enk extends enm {
   public static final Codec<enk> a = a(enk::new);

   enk(List<env> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public enw b() {
      return enx.c;
   }

   public static enk.a a(env.a... $$0) {
      return new enk.a($$0);
   }

   public static class a extends enm.a {
      public a(env.a... $$0) {
         super($$0);
      }

      @Override
      public enk.a or(env.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected env a(List<env> $$0) {
         return new enk($$0);
      }
   }
}
