import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ehg extends ehi {
   public static final Codec<ehg> a = a(ehg::new);

   ehg(List<ehp> $$0, List<ejv> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehq a() {
      return ehn.g;
   }

   @Override
   protected ehh a(List<? extends ehh> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ehh)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ehh $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ehf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ehg.a a(ehp.a<?>... $$0) {
      return new ehg.a($$0);
   }

   public static <E> ehg.a a(Collection<E> $$0, Function<E, ehp.a<?>> $$1) {
      return new ehg.a($$0.stream().map($$1::apply).toArray(ehp.a[]::new));
   }

   public static class a extends ehp.a<ehg.a> {
      private final Builder<ehp> a = ImmutableList.builder();

      public a(ehp.a<?>... $$0) {
         for (ehp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehg.a a() {
         return this;
      }

      @Override
      public ehg.a a(ehp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehp b() {
         return new ehg(this.a.build(), this.f());
      }
   }
}
