import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eze extends ezh {
   public static final MapCodec<eze> a = a(eze::new);
   public static final Codec<eze> b = b(eze::new);

   eze(List<ezr> $$0) {
      super($$0, ae.a($$0));
   }

   public static eze a(List<ezr> $$0) {
      return new eze(List.copyOf($$0));
   }

   @Override
   public ezs b() {
      return ezt.c;
   }

   public static eze.a a(ezr.a... $$0) {
      return new eze.a($$0);
   }

   public static class a extends ezh.a {
      public a(ezr.a... $$0) {
         super($$0);
      }

      @Override
      public eze.a and(ezr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezr a(List<ezr> $$0) {
         return new eze($$0);
      }
   }
}
