import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class euj extends eul {
   public static final MapCodec<euj> a = a(euj::new);

   euj(List<eus> $$0, List<exn> $$1) {
      super($$0, $$1);
   }

   @Override
   public eut a() {
      return euq.g;
   }

   @Override
   protected euk a(List<? extends euk> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (euk)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (euk $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eui $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static euj.a a(eus.a<?>... $$0) {
      return new euj.a($$0);
   }

   public static <E> euj.a a(Collection<E> $$0, Function<E, eus.a<?>> $$1) {
      return new euj.a($$0.stream().map($$1::apply).toArray(eus.a[]::new));
   }

   public static class a extends eus.a<euj.a> {
      private final Builder<eus> a = ImmutableList.builder();

      public a(eus.a<?>... $$0) {
         for (eus.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected euj.a a() {
         return this;
      }

      @Override
      public euj.a a(eus.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eus b() {
         return new euj(this.a.build(), this.f());
      }
   }
}
