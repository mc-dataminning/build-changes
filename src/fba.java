import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class fba extends fbc {
   public static final MapCodec<fba> a = a(fba::new);

   fba(List<fbj> $$0, List<fec> $$1) {
      super($$0, $$1);
   }

   @Override
   public fbk a() {
      return fbh.g;
   }

   @Override
   protected fbb a(List<? extends fbb> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (fbb)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (fbb $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(faz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static fba.a a(fbj.a<?>... $$0) {
      return new fba.a($$0);
   }

   public static <E> fba.a a(Collection<E> $$0, Function<E, fbj.a<?>> $$1) {
      return new fba.a($$0.stream().map($$1::apply).toArray(fbj.a[]::new));
   }

   public static class a extends fbj.a<fba.a> {
      private final Builder<fbj> a = ImmutableList.builder();

      public a(fbj.a<?>... $$0) {
         for (fbj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fba.a a() {
         return this;
      }

      @Override
      public fba.a a(fbj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fbj b() {
         return new fba(this.a.build(), this.f());
      }
   }
}
