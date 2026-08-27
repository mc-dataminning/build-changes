import com.mojang.serialization.Codec;
import java.util.List;

public class eni extends enk {
   public static final Codec<eni> a = a(eni::new);

   eni(List<ent> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public enu b() {
      return env.c;
   }

   public static eni.a a(ent.a... $$0) {
      return new eni.a($$0);
   }

   public static class a extends enk.a {
      public a(ent.a... $$0) {
         super($$0);
      }

      @Override
      public eni.a or(ent.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ent a(List<ent> $$0) {
         return new eni($$0);
      }
   }
}
