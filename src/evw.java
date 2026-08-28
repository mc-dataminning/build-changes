import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class evw extends evy {
   public static final MapCodec<evw> a = a(evw::new);

   evw(List<ewf> $$0, List<eyy> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewg a() {
      return ewd.g;
   }

   @Override
   protected evx a(List<? extends evx> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (evx)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (evx $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(evv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static evw.a a(ewf.a<?>... $$0) {
      return new evw.a($$0);
   }

   public static <E> evw.a a(Collection<E> $$0, Function<E, ewf.a<?>> $$1) {
      return new evw.a($$0.stream().map($$1::apply).toArray(ewf.a[]::new));
   }

   public static class a extends ewf.a<evw.a> {
      private final Builder<ewf> a = ImmutableList.builder();

      public a(ewf.a<?>... $$0) {
         for (ewf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected evw.a a() {
         return this;
      }

      @Override
      public evw.a a(ewf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewf b() {
         return new evw(this.a.build(), this.f());
      }
   }
}
