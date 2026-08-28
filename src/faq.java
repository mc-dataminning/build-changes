import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class faq extends fas {
   public static final MapCodec<faq> a = a(faq::new);

   faq(List<faz> $$0, List<fds> $$1) {
      super($$0, $$1);
   }

   @Override
   public fba a() {
      return fax.g;
   }

   @Override
   protected far a(List<? extends far> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (far)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (far $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(fap $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static faq.a a(faz.a<?>... $$0) {
      return new faq.a($$0);
   }

   public static <E> faq.a a(Collection<E> $$0, Function<E, faz.a<?>> $$1) {
      return new faq.a($$0.stream().map($$1::apply).toArray(faz.a[]::new));
   }

   public static class a extends faz.a<faq.a> {
      private final Builder<faz> a = ImmutableList.builder();

      public a(faz.a<?>... $$0) {
         for (faz.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected faq.a a() {
         return this;
      }

      @Override
      public faq.a a(faz.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public faz b() {
         return new faq(this.a.build(), this.f());
      }
   }
}
