import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fah extends fak {
   public static final MapCodec<fah> a = a(fah::new);
   public static final Codec<fah> b = b(fah::new);

   fah(List<fau> $$0) {
      super($$0, af.a($$0));
   }

   public static fah a(List<fau> $$0) {
      return new fah(List.copyOf($$0));
   }

   @Override
   public fav b() {
      return faw.c;
   }

   public static fah.a a(fau.a... $$0) {
      return new fah.a($$0);
   }

   public static class a extends fak.a {
      public a(fau.a... $$0) {
         super($$0);
      }

      @Override
      public fah.a and(fau.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fau a(List<fau> $$0) {
         return new fah($$0);
      }
   }
}
