import com.mojang.serialization.Codec;
import java.util.List;

public class epr extends ept {
   public static final Codec<epr> a = a(epr::new);

   epr(List<eqc> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eqd b() {
      return eqe.c;
   }

   public static epr.a a(eqc.a... $$0) {
      return new epr.a($$0);
   }

   public static class a extends ept.a {
      public a(eqc.a... $$0) {
         super($$0);
      }

      @Override
      public epr.a or(eqc.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eqc a(List<eqc> $$0) {
         return new epr($$0);
      }
   }
}
