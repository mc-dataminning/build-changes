import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exa extends exd {
   public static final MapCodec<exa> a = a(exa::new);
   public static final Codec<exa> b = b(exa::new);

   exa(List<exn> $$0) {
      super($$0, ae.a($$0));
   }

   public static exa a(List<exn> $$0) {
      return new exa(List.copyOf($$0));
   }

   @Override
   public exo b() {
      return exp.c;
   }

   public static exa.a a(exn.a... $$0) {
      return new exa.a($$0);
   }

   public static class a extends exd.a {
      public a(exn.a... $$0) {
         super($$0);
      }

      @Override
      public exa.a and(exn.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exn a(List<exn> $$0) {
         return new exa($$0);
      }
   }
}
