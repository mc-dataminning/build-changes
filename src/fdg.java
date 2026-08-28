import com.mojang.serialization.MapCodec;
import java.util.List;

public class fdg extends fdi {
   public static final MapCodec<fdg> a = a(fdg::new);

   fdg(List<fds> $$0) {
      super($$0, ag.b($$0));
   }

   @Override
   public fdt b() {
      return fdu.b;
   }

   public static fdg.a a(fds.a... $$0) {
      return new fdg.a($$0);
   }

   public static class a extends fdi.a {
      public a(fds.a... $$0) {
         super($$0);
      }

      @Override
      public fdg.a or(fds.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fds a(List<fds> $$0) {
         return new fdg($$0);
      }
   }
}
