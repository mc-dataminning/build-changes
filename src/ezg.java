import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ezg extends ezi {
   public static final MapCodec<ezg> a = a(ezg::new);

   ezg(List<ezp> $$0, List<fci> $$1) {
      super($$0, $$1);
   }

   @Override
   public ezq a() {
      return ezn.g;
   }

   @Override
   protected ezh a(List<? extends ezh> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ezh)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ezh $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ezf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ezg.a a(ezp.a<?>... $$0) {
      return new ezg.a($$0);
   }

   public static <E> ezg.a a(Collection<E> $$0, Function<E, ezp.a<?>> $$1) {
      return new ezg.a($$0.stream().map($$1::apply).toArray(ezp.a[]::new));
   }

   public static class a extends ezp.a<ezg.a> {
      private final Builder<ezp> a = ImmutableList.builder();

      public a(ezp.a<?>... $$0) {
         for (ezp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ezg.a a() {
         return this;
      }

      @Override
      public ezg.a a(ezp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezp b() {
         return new ezg(this.a.build(), this.f());
      }
   }
}
