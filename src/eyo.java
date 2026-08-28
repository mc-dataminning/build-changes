import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eyo extends eyr {
   public static final MapCodec<eyo> a = a(eyo::new);
   public static final Codec<eyo> b = b(eyo::new);

   eyo(List<ezb> $$0) {
      super($$0, af.a($$0));
   }

   public static eyo a(List<ezb> $$0) {
      return new eyo(List.copyOf($$0));
   }

   @Override
   public ezc b() {
      return ezd.c;
   }

   public static eyo.a a(ezb.a... $$0) {
      return new eyo.a($$0);
   }

   public static class a extends eyr.a {
      public a(ezb.a... $$0) {
         super($$0);
      }

      @Override
      public eyo.a and(ezb.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezb a(List<ezb> $$0) {
         return new eyo($$0);
      }
   }
}
