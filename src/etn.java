import com.mojang.serialization.MapCodec;
import java.util.List;

public class etn extends etp {
   public static final MapCodec<etn> a = a(etn::new);

   etn(List<etz> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eua b() {
      return eub.b;
   }

   public static etn.a a(etz.a... $$0) {
      return new etn.a($$0);
   }

   public static class a extends etp.a {
      public a(etz.a... $$0) {
         super($$0);
      }

      @Override
      public etn.a or(etz.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etz a(List<etz> $$0) {
         return new etn($$0);
      }
   }
}
