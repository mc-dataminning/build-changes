import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ejm extends ejo {
   public static final Codec<ejm> a = a(ejm::new);

   ejm(List<ejv> $$0, List<emb> $$1) {
      super($$0, $$1);
   }

   @Override
   public ejw a() {
      return ejt.g;
   }

   @Override
   protected ejn a(List<? extends ejn> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ejn)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ejn $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ejl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ejm.a a(ejv.a<?>... $$0) {
      return new ejm.a($$0);
   }

   public static <E> ejm.a a(Collection<E> $$0, Function<E, ejv.a<?>> $$1) {
      return new ejm.a($$0.stream().map($$1::apply).toArray(ejv.a[]::new));
   }

   public static class a extends ejv.a<ejm.a> {
      private final Builder<ejv> a = ImmutableList.builder();

      public a(ejv.a<?>... $$0) {
         for (ejv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ejm.a a() {
         return this;
      }

      @Override
      public ejm.a a(ejv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ejv b() {
         return new ejm(this.a.build(), this.f());
      }
   }
}
