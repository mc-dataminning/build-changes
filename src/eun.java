import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eun extends eup {
   public static final MapCodec<eun> a = a(eun::new);

   eun(List<euw> $$0, List<exr> $$1) {
      super($$0, $$1);
   }

   @Override
   public eux a() {
      return euu.g;
   }

   @Override
   protected euo a(List<? extends euo> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (euo)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (euo $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eum $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eun.a a(euw.a<?>... $$0) {
      return new eun.a($$0);
   }

   public static <E> eun.a a(Collection<E> $$0, Function<E, euw.a<?>> $$1) {
      return new eun.a($$0.stream().map($$1::apply).toArray(euw.a[]::new));
   }

   public static class a extends euw.a<eun.a> {
      private final Builder<euw> a = ImmutableList.builder();

      public a(euw.a<?>... $$0) {
         for (euw.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eun.a a() {
         return this;
      }

      @Override
      public eun.a a(euw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public euw b() {
         return new eun(this.a.build(), this.f());
      }
   }
}
