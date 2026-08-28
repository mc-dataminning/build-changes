import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etm extends etp {
   public static final MapCodec<etm> a = a(etm::new);
   public static final Codec<etm> b = b(etm::new);

   etm(List<etz> $$0) {
      super($$0, ac.a($$0));
   }

   public static etm a(List<etz> $$0) {
      return new etm(List.copyOf($$0));
   }

   @Override
   public eua b() {
      return eub.c;
   }

   public static etm.a a(etz.a... $$0) {
      return new etm.a($$0);
   }

   public static class a extends etp.a {
      public a(etz.a... $$0) {
         super($$0);
      }

      @Override
      public etm.a and(etz.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etz a(List<etz> $$0) {
         return new etm($$0);
      }
   }
}
