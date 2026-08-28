import com.mojang.serialization.MapCodec;
import java.util.List;

public class euq extends eus {
   public static final MapCodec<euq> a = a(euq::new);

   euq(List<evc> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public evd b() {
      return eve.b;
   }

   public static euq.a a(evc.a... $$0) {
      return new euq.a($$0);
   }

   public static class a extends eus.a {
      public a(evc.a... $$0) {
         super($$0);
      }

      @Override
      public euq.a or(evc.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected evc a(List<evc> $$0) {
         return new euq($$0);
      }
   }
}
