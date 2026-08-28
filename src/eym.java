import com.mojang.serialization.MapCodec;
import java.util.List;

public class eym extends eyo {
   public static final MapCodec<eym> a = a(eym::new);

   eym(List<eyy> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public eyz b() {
      return eza.b;
   }

   public static eym.a a(eyy.a... $$0) {
      return new eym.a($$0);
   }

   public static class a extends eyo.a {
      public a(eyy.a... $$0) {
         super($$0);
      }

      @Override
      public eym.a or(eyy.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eyy a(List<eyy> $$0) {
         return new eym($$0);
      }
   }
}
