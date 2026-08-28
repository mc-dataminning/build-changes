import com.mojang.serialization.MapCodec;
import java.util.List;

public class etc extends ete {
   public static final MapCodec<etc> a = a(etc::new);

   etc(List<etn> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eto b() {
      return etp.d;
   }

   public static etc.a a(etn.a... $$0) {
      return new etc.a($$0);
   }

   public static class a extends ete.a {
      public a(etn.a... $$0) {
         super($$0);
      }

      @Override
      public etc.a or(etn.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etn a(List<etn> $$0) {
         return new etc($$0);
      }
   }
}
