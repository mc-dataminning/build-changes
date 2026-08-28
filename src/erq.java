import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erq extends erf {
   public static final MapCodec<erq> a = a(erq::new);

   erq(List<erm> $$0, List<euh> $$1) {
      super($$0, $$1);
   }

   @Override
   public ern a() {
      return erk.h;
   }

   @Override
   protected ere a(List<? extends ere> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ere)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ere $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static erq.a a(erm.a<?>... $$0) {
      return new erq.a($$0);
   }

   public static class a extends erm.a<erq.a> {
      private final Builder<erm> a = ImmutableList.builder();

      public a(erm.a<?>... $$0) {
         for (erm.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erq.a a() {
         return this;
      }

      @Override
      public erq.a c(erm.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public erm b() {
         return new erq(this.a.build(), this.f());
      }
   }
}
