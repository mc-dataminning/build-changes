import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewj extends ewm {
   public static final MapCodec<ewj> a = a(ewj::new);
   public static final Codec<ewj> b = b(ewj::new);

   ewj(List<eww> $$0) {
      super($$0, ad.a($$0));
   }

   public static ewj a(List<eww> $$0) {
      return new ewj(List.copyOf($$0));
   }

   @Override
   public ewx b() {
      return ewy.c;
   }

   public static ewj.a a(eww.a... $$0) {
      return new ewj.a($$0);
   }

   public static class a extends ewm.a {
      public a(eww.a... $$0) {
         super($$0);
      }

      @Override
      public ewj.a and(eww.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eww a(List<eww> $$0) {
         return new ewj($$0);
      }
   }
}
