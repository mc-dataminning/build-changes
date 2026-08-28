import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewu extends ewx {
   public static final MapCodec<ewu> a = a(ewu::new);
   public static final Codec<ewu> b = b(ewu::new);

   ewu(List<exh> $$0) {
      super($$0, ad.a($$0));
   }

   public static ewu a(List<exh> $$0) {
      return new ewu(List.copyOf($$0));
   }

   @Override
   public exi b() {
      return exj.c;
   }

   public static ewu.a a(exh.a... $$0) {
      return new ewu.a($$0);
   }

   public static class a extends ewx.a {
      public a(exh.a... $$0) {
         super($$0);
      }

      @Override
      public ewu.a and(exh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exh a(List<exh> $$0) {
         return new ewu($$0);
      }
   }
}
