import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbj extends fbm {
   public static final MapCodec<fbj> a = a(fbj::new);
   public static final Codec<fbj> b = b(fbj::new);

   fbj(List<fbw> $$0) {
      super($$0, af.a($$0));
   }

   public static fbj a(List<fbw> $$0) {
      return new fbj(List.copyOf($$0));
   }

   @Override
   public fbx b() {
      return fby.c;
   }

   public static fbj.a a(fbw.a... $$0) {
      return new fbj.a($$0);
   }

   public static class a extends fbm.a {
      public a(fbw.a... $$0) {
         super($$0);
      }

      @Override
      public fbj.a and(fbw.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fbw a(List<fbw> $$0) {
         return new fbj($$0);
      }
   }
}
