import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ejf extends ejh {
   public static final Codec<ejf> a = a(ejf::new);

   ejf(List<ejo> $$0, List<elu> $$1) {
      super($$0, $$1);
   }

   @Override
   public ejp a() {
      return ejm.g;
   }

   @Override
   protected ejg a(List<? extends ejg> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ejg)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ejg $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eje $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ejf.a a(ejo.a<?>... $$0) {
      return new ejf.a($$0);
   }

   public static <E> ejf.a a(Collection<E> $$0, Function<E, ejo.a<?>> $$1) {
      return new ejf.a($$0.stream().map($$1::apply).toArray(ejo.a[]::new));
   }

   public static class a extends ejo.a<ejf.a> {
      private final Builder<ejo> a = ImmutableList.builder();

      public a(ejo.a<?>... $$0) {
         for (ejo.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ejf.a a() {
         return this;
      }

      @Override
      public ejf.a a(ejo.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ejo b() {
         return new ejf(this.a.build(), this.f());
      }
   }
}
