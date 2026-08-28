import com.mojang.serialization.MapCodec;
import java.util.List;

public class fai extends fak {
   public static final MapCodec<fai> a = a(fai::new);

   fai(List<fau> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public fav b() {
      return faw.b;
   }

   public static fai.a a(fau.a... $$0) {
      return new fai.a($$0);
   }

   public static class a extends fak.a {
      public a(fau.a... $$0) {
         super($$0);
      }

      @Override
      public fai.a or(fau.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fau a(List<fau> $$0) {
         return new fai($$0);
      }
   }
}
