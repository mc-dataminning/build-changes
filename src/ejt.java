import com.mojang.serialization.Codec;
import java.util.List;

public class ejt extends ejv {
   public static final Codec<ejt> a = a(ejt::new);

   ejt(List<eke> $$0) {
      super($$0, ekg.b($$0));
   }

   @Override
   public ekf b() {
      return ekg.c;
   }

   public static ejt.a a(eke.a... $$0) {
      return new ejt.a($$0);
   }

   public static class a extends ejv.a {
      public a(eke.a... $$0) {
         super($$0);
      }

      @Override
      public ejt.a or(eke.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eke a(List<eke> $$0) {
         return new ejt($$0);
      }
   }
}
