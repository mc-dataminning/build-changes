import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ehf extends ehh {
   public static final Codec<ehf> a = a(ehf::new);

   ehf(List<eho> $$0, List<eju> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehp a() {
      return ehm.g;
   }

   @Override
   protected ehg a(List<? extends ehg> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ehg)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ehg $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ehe $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ehf.a a(eho.a<?>... $$0) {
      return new ehf.a($$0);
   }

   public static <E> ehf.a a(Collection<E> $$0, Function<E, eho.a<?>> $$1) {
      return new ehf.a($$0.stream().map($$1::apply).toArray(eho.a[]::new));
   }

   public static class a extends eho.a<ehf.a> {
      private final Builder<eho> a = ImmutableList.builder();

      public a(eho.a<?>... $$0) {
         for (eho.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehf.a a() {
         return this;
      }

      @Override
      public ehf.a a(eho.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eho b() {
         return new ehf(this.a.build(), this.f());
      }
   }
}
