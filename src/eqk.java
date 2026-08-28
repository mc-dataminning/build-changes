import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eqk extends eqm {
   public static final MapCodec<eqk> a = a(eqk::new);

   eqk(List<eqt> $$0, List<etn> $$1) {
      super($$0, $$1);
   }

   @Override
   public equ a() {
      return eqr.g;
   }

   @Override
   protected eql a(List<? extends eql> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eql)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eql $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eqj $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eqk.a a(eqt.a<?>... $$0) {
      return new eqk.a($$0);
   }

   public static <E> eqk.a a(Collection<E> $$0, Function<E, eqt.a<?>> $$1) {
      return new eqk.a($$0.stream().map($$1::apply).toArray(eqt.a[]::new));
   }

   public static class a extends eqt.a<eqk.a> {
      private final Builder<eqt> a = ImmutableList.builder();

      public a(eqt.a<?>... $$0) {
         for (eqt.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eqk.a a() {
         return this;
      }

      @Override
      public eqk.a a(eqt.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eqt b() {
         return new eqk(this.a.build(), this.f());
      }
   }
}
