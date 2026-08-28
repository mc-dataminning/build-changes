import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exe extends exh {
   public static final MapCodec<exe> a = a(exe::new);
   public static final Codec<exe> b = b(exe::new);

   exe(List<exr> $$0) {
      super($$0, ae.a($$0));
   }

   public static exe a(List<exr> $$0) {
      return new exe(List.copyOf($$0));
   }

   @Override
   public exs b() {
      return ext.c;
   }

   public static exe.a a(exr.a... $$0) {
      return new exe.a($$0);
   }

   public static class a extends exh.a {
      public a(exr.a... $$0) {
         super($$0);
      }

      @Override
      public exe.a and(exr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exr a(List<exr> $$0) {
         return new exe($$0);
      }
   }
}
