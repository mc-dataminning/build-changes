import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etb extends ete {
   public static final MapCodec<etb> a = a(etb::new);
   public static final Codec<etb> b = b(etb::new);

   etb(List<etn> $$0) {
      super($$0, ac.a($$0));
   }

   public static etb a(List<etn> $$0) {
      return new etb(List.copyOf($$0));
   }

   @Override
   public eto b() {
      return etp.e;
   }

   public static etb.a a(etn.a... $$0) {
      return new etb.a($$0);
   }

   public static class a extends ete.a {
      public a(etn.a... $$0) {
         super($$0);
      }

      @Override
      public etb.a and(etn.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etn a(List<etn> $$0) {
         return new etb($$0);
      }
   }
}
