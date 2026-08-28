import com.mojang.serialization.MapCodec;
import java.util.List;

public class eyp extends eyr {
   public static final MapCodec<eyp> a = a(eyp::new);

   eyp(List<ezb> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public ezc b() {
      return ezd.b;
   }

   public static eyp.a a(ezb.a... $$0) {
      return new eyp.a($$0);
   }

   public static class a extends eyr.a {
      public a(ezb.a... $$0) {
         super($$0);
      }

      @Override
      public eyp.a or(ezb.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezb a(List<ezb> $$0) {
         return new eyp($$0);
      }
   }
}
