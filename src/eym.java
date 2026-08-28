import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eym extends eyp {
   public static final MapCodec<eym> a = a(eym::new);
   public static final Codec<eym> b = b(eym::new);

   eym(List<eyz> $$0) {
      super($$0, af.a($$0));
   }

   public static eym a(List<eyz> $$0) {
      return new eym(List.copyOf($$0));
   }

   @Override
   public eza b() {
      return ezb.c;
   }

   public static eym.a a(eyz.a... $$0) {
      return new eym.a($$0);
   }

   public static class a extends eyp.a {
      public a(eyz.a... $$0) {
         super($$0);
      }

      @Override
      public eym.a and(eyz.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eyz a(List<eyz> $$0) {
         return new eym($$0);
      }
   }
}
