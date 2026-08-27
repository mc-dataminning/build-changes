import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ede extends ect {
   public static final Codec<ede> a = a(ede::new);

   ede(List<eda> $$0, List<efg> $$1) {
      super($$0, $$1);
   }

   @Override
   public edb a() {
      return ecy.h;
   }

   @Override
   protected ecs a(List<? extends ecs> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecs)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ecs $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ede.a a(eda.a<?>... $$0) {
      return new ede.a($$0);
   }

   public static class a extends eda.a<ede.a> {
      private final Builder<eda> a = ImmutableList.builder();

      public a(eda.a<?>... $$0) {
         for (eda.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ede.a a() {
         return this;
      }

      @Override
      public ede.a c(eda.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eda b() {
         return new ede(this.a.build(), this.f());
      }
   }
}
