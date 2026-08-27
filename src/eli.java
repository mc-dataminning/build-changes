import com.mojang.serialization.Codec;
import java.util.List;

public class eli extends ell {
   public static final Codec<eli> a = a(eli::new);
   public static final Codec<eli> b = b(eli::new);

   eli(List<elu> $$0) {
      super($$0, elw.a($$0));
   }

   public static eli a(List<elu> $$0) {
      return new eli(List.copyOf($$0));
   }

   @Override
   public elv b() {
      return elw.d;
   }

   public static eli.a a(elu.a... $$0) {
      return new eli.a($$0);
   }

   public static class a extends ell.a {
      public a(elu.a... $$0) {
         super($$0);
      }

      @Override
      public eli.a and(elu.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected elu a(List<elu> $$0) {
         return new eli($$0);
      }
   }
}
