import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ewp extends ewr {
   public static final MapCodec<ewp> a = a(ewp::new);

   ewp(List<ewy> $$0, List<ezr> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewz a() {
      return eww.g;
   }

   @Override
   protected ewq a(List<? extends ewq> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ewq)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ewq $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ewp.a a(ewy.a<?>... $$0) {
      return new ewp.a($$0);
   }

   public static <E> ewp.a a(Collection<E> $$0, Function<E, ewy.a<?>> $$1) {
      return new ewp.a($$0.stream().map($$1::apply).toArray(ewy.a[]::new));
   }

   public static class a extends ewy.a<ewp.a> {
      private final Builder<ewy> a = ImmutableList.builder();

      public a(ewy.a<?>... $$0) {
         for (ewy.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewp.a a() {
         return this;
      }

      @Override
      public ewp.a a(ewy.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewy b() {
         return new ewp(this.a.build(), this.f());
      }
   }
}
