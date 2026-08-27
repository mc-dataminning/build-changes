import com.mojang.serialization.Codec;
import java.util.List;

public class eqa extends eqc {
   public static final Codec<eqa> a = a(eqa::new);

   eqa(List<eql> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eqm b() {
      return eqn.c;
   }

   public static eqa.a a(eql.a... $$0) {
      return new eqa.a($$0);
   }

   public static class a extends eqc.a {
      public a(eql.a... $$0) {
         super($$0);
      }

      @Override
      public eqa.a or(eql.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eql a(List<eql> $$0) {
         return new eqa($$0);
      }
   }
}
