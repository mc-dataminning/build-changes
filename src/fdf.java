import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fdf extends fdi {
   public static final MapCodec<fdf> a = a(fdf::new);
   public static final Codec<fdf> b = b(fdf::new);

   fdf(List<fds> $$0) {
      super($$0, ag.a($$0));
   }

   public static fdf a(List<fds> $$0) {
      return new fdf(List.copyOf($$0));
   }

   @Override
   public fdt b() {
      return fdu.c;
   }

   public static fdf.a a(fds.a... $$0) {
      return new fdf.a($$0);
   }

   public static class a extends fdi.a {
      public a(fds.a... $$0) {
         super($$0);
      }

      @Override
      public fdf.a and(fds.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fds a(List<fds> $$0) {
         return new fdf($$0);
      }
   }
}
