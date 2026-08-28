import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class fao extends faq {
   public static final MapCodec<fao> a = a(fao::new);

   fao(List<fax> $$0, List<fdq> $$1) {
      super($$0, $$1);
   }

   @Override
   public fay a() {
      return fav.g;
   }

   @Override
   protected fap a(List<? extends fap> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (fap)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (fap $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(fan $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static fao.a a(fax.a<?>... $$0) {
      return new fao.a($$0);
   }

   public static <E> fao.a a(Collection<E> $$0, Function<E, fax.a<?>> $$1) {
      return new fao.a($$0.stream().map($$1::apply).toArray(fax.a[]::new));
   }

   public static class a extends fax.a<fao.a> {
      private final Builder<fax> a = ImmutableList.builder();

      public a(fax.a<?>... $$0) {
         for (fax.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fao.a a() {
         return this;
      }

      @Override
      public fao.a a(fax.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fax b() {
         return new fao(this.a.build(), this.f());
      }
   }
}
