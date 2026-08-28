import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewf extends ewi {
   public static final MapCodec<ewf> a = a(ewf::new);
   public static final Codec<ewf> b = b(ewf::new);

   ewf(List<ews> $$0) {
      super($$0, ad.a($$0));
   }

   public static ewf a(List<ews> $$0) {
      return new ewf(List.copyOf($$0));
   }

   @Override
   public ewt b() {
      return ewu.c;
   }

   public static ewf.a a(ews.a... $$0) {
      return new ewf.a($$0);
   }

   public static class a extends ewi.a {
      public a(ews.a... $$0) {
         super($$0);
      }

      @Override
      public ewf.a and(ews.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ews a(List<ews> $$0) {
         return new ewf($$0);
      }
   }
}
