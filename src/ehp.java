import com.mojang.serialization.Codec;
import java.util.List;

public class ehp extends ehs {
   public static final Codec<ehp> a = a(ehp::new);
   public static final Codec<ehp> b = b(ehp::new);

   ehp(List<eib> $$0) {
      super($$0, eid.a($$0));
   }

   public static ehp a(List<eib> $$0) {
      return new ehp(List.copyOf($$0));
   }

   @Override
   public eic b() {
      return eid.d;
   }

   public static ehp.a a(eib.a... $$0) {
      return new ehp.a($$0);
   }

   public static class a extends ehs.a {
      public a(eib.a... $$0) {
         super($$0);
      }

      @Override
      public ehp.a and(eib.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eib a(List<eib> $$0) {
         return new ehp($$0);
      }
   }
}
