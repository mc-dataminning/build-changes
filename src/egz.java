import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class egz extends ehb {
   public static final Codec<egz> a = a(egz::new);

   egz(List<ehi> $$0, List<ejo> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehj a() {
      return ehg.g;
   }

   @Override
   protected eha a(List<? extends eha> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (eha)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eha $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(egy $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static egz.a a(ehi.a<?>... $$0) {
      return new egz.a($$0);
   }

   public static <E> egz.a a(Collection<E> $$0, Function<E, ehi.a<?>> $$1) {
      return new egz.a($$0.stream().map($$1::apply).toArray(ehi.a[]::new));
   }

   public static class a extends ehi.a<egz.a> {
      private final Builder<ehi> a = ImmutableList.builder();

      public a(ehi.a<?>... $$0) {
         for (ehi.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected egz.a a() {
         return this;
      }

      @Override
      public egz.a a(ehi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehi b() {
         return new egz(this.a.build(), this.f());
      }
   }
}
