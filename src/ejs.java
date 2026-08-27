import com.mojang.serialization.Codec;
import java.util.List;

public class ejs extends ejv {
   public static final Codec<ejs> a = a(ejs::new);
   public static final Codec<ejs> b = b(ejs::new);

   ejs(List<eke> $$0) {
      super($$0, ekg.a($$0));
   }

   public static ejs a(List<eke> $$0) {
      return new ejs(List.copyOf($$0));
   }

   @Override
   public ekf b() {
      return ekg.d;
   }

   public static ejs.a a(eke.a... $$0) {
      return new ejs.a($$0);
   }

   public static class a extends ejv.a {
      public a(eke.a... $$0) {
         super($$0);
      }

      @Override
      public ejs.a and(eke.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eke a(List<eke> $$0) {
         return new ejs($$0);
      }
   }
}
