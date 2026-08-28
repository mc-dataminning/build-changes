import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbk extends fbm {
   public static final MapCodec<fbk> a = a(fbk::new);

   fbk(List<fbw> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public fbx b() {
      return fby.b;
   }

   public static fbk.a a(fbw.a... $$0) {
      return new fbk.a($$0);
   }

   public static class a extends fbm.a {
      public a(fbw.a... $$0) {
         super($$0);
      }

      @Override
      public fbk.a or(fbw.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fbw a(List<fbw> $$0) {
         return new fbk($$0);
      }
   }
}
