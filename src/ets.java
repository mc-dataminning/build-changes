import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ets extends etv {
   public static final MapCodec<ets> a = a(ets::new);
   public static final Codec<ets> b = b(ets::new);

   ets(List<euf> $$0) {
      super($$0, ac.a($$0));
   }

   public static ets a(List<euf> $$0) {
      return new ets(List.copyOf($$0));
   }

   @Override
   public eug b() {
      return euh.c;
   }

   public static ets.a a(euf.a... $$0) {
      return new ets.a($$0);
   }

   public static class a extends etv.a {
      public a(euf.a... $$0) {
         super($$0);
      }

      @Override
      public ets.a and(euf.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euf a(List<euf> $$0) {
         return new ets($$0);
      }
   }
}
