import com.mojang.serialization.Codec;
import java.util.List;

public class eet extends eew {
   public static final Codec<eet> a = a(eet::new);
   public static final Codec<eet> b = b(eet::new);

   eet(List<eff> $$0) {
      super($$0, efh.a($$0));
   }

   public static eet a(List<eff> $$0) {
      return new eet(List.copyOf($$0));
   }

   @Override
   public efg b() {
      return efh.d;
   }

   public static eet.a a(eff.a... $$0) {
      return new eet.a($$0);
   }

   public static class a extends eew.a {
      public a(eff.a... $$0) {
         super($$0);
      }

      @Override
      public eet.a and(eff.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eff a(List<eff> $$0) {
         return new eet($$0);
      }
   }
}
