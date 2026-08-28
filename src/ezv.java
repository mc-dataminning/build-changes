import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ezv extends ezx {
   public static final MapCodec<ezv> a = a(ezv::new);

   ezv(List<fae> $$0, List<fcx> $$1) {
      super($$0, $$1);
   }

   @Override
   public faf a() {
      return fac.g;
   }

   @Override
   protected ezw a(List<? extends ezw> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ezw)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ezw $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ezu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ezv.a a(fae.a<?>... $$0) {
      return new ezv.a($$0);
   }

   public static <E> ezv.a a(Collection<E> $$0, Function<E, fae.a<?>> $$1) {
      return new ezv.a($$0.stream().map($$1::apply).toArray(fae.a[]::new));
   }

   public static class a extends fae.a<ezv.a> {
      private final Builder<fae> a = ImmutableList.builder();

      public a(fae.a<?>... $$0) {
         for (fae.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ezv.a a() {
         return this;
      }

      @Override
      public ezv.a a(fae.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fae b() {
         return new ezv(this.a.build(), this.f());
      }
   }
}
