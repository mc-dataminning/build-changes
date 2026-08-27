import com.mojang.serialization.Codec;
import java.util.List;

public class ehq extends ehs {
   public static final Codec<ehq> a = a(ehq::new);

   ehq(List<eib> $$0) {
      super($$0, eid.b($$0));
   }

   @Override
   public eic b() {
      return eid.c;
   }

   public static ehq.a a(eib.a... $$0) {
      return new ehq.a($$0);
   }

   public static class a extends ehs.a {
      public a(eib.a... $$0) {
         super($$0);
      }

      @Override
      public ehq.a or(eib.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eib a(List<eib> $$0) {
         return new ehq($$0);
      }
   }
}
