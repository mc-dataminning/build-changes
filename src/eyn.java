import com.mojang.serialization.MapCodec;
import java.util.List;

public class eyn extends eyp {
   public static final MapCodec<eyn> a = a(eyn::new);

   eyn(List<eyz> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public eza b() {
      return ezb.b;
   }

   public static eyn.a a(eyz.a... $$0) {
      return new eyn.a($$0);
   }

   public static class a extends eyp.a {
      public a(eyz.a... $$0) {
         super($$0);
      }

      @Override
      public eyn.a or(eyz.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eyz a(List<eyz> $$0) {
         return new eyn($$0);
      }
   }
}
