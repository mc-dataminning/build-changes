import com.mojang.serialization.MapCodec;
import java.util.List;

public class exb extends exd {
   public static final MapCodec<exb> a = a(exb::new);

   exb(List<exn> $$0) {
      super($$0, ae.b($$0));
   }

   @Override
   public exo b() {
      return exp.b;
   }

   public static exb.a a(exn.a... $$0) {
      return new exb.a($$0);
   }

   public static class a extends exd.a {
      public a(exn.a... $$0) {
         super($$0);
      }

      @Override
      public exb.a or(exn.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exn a(List<exn> $$0) {
         return new exb($$0);
      }
   }
}
