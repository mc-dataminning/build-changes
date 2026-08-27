import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ecw extends ect {
   public static final Codec<ecw> a = a(ecw::new);

   ecw(List<eda> $$0, List<efg> $$1) {
      super($$0, $$1);
   }

   @Override
   public edb a() {
      return ecy.i;
   }

   @Override
   protected ecs a(List<? extends ecs> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ecs)$$0.get(0);
         case 2 -> {
            ecs $$1 = $$0.get(0);
            ecs $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ecs $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ecw.a a(eda.a<?>... $$0) {
      return new ecw.a($$0);
   }

   public static class a extends eda.a<ecw.a> {
      private final Builder<eda> a = ImmutableList.builder();

      public a(eda.a<?>... $$0) {
         for (eda.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecw.a a() {
         return this;
      }

      @Override
      public ecw.a b(eda.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eda b() {
         return new ecw(this.a.build(), this.f());
      }
   }
}
