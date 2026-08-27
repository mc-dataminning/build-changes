import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class elg extends eli {
   public static final Codec<elg> a = a(elg::new);

   elg(List<elp> $$0, List<env> $$1) {
      super($$0, $$1);
   }

   @Override
   public elq a() {
      return eln.g;
   }

   @Override
   protected elh a(List<? extends elh> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (elh)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (elh $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(elf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static elg.a a(elp.a<?>... $$0) {
      return new elg.a($$0);
   }

   public static <E> elg.a a(Collection<E> $$0, Function<E, elp.a<?>> $$1) {
      return new elg.a($$0.stream().map($$1::apply).toArray(elp.a[]::new));
   }

   public static class a extends elp.a<elg.a> {
      private final Builder<elp> a = ImmutableList.builder();

      public a(elp.a<?>... $$0) {
         for (elp.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected elg.a a() {
         return this;
      }

      @Override
      public elg.a a(elp.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public elp b() {
         return new elg(this.a.build(), this.f());
      }
   }
}
