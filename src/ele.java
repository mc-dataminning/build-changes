import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ele extends elg {
   public static final Codec<ele> a = a(ele::new);

   ele(List<eln> $$0, List<ent> $$1) {
      super($$0, $$1);
   }

   @Override
   public elo a() {
      return ell.g;
   }

   @Override
   protected elf a(List<? extends elf> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (elf)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (elf $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(eld $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ele.a a(eln.a<?>... $$0) {
      return new ele.a($$0);
   }

   public static <E> ele.a a(Collection<E> $$0, Function<E, eln.a<?>> $$1) {
      return new ele.a($$0.stream().map($$1::apply).toArray(eln.a[]::new));
   }

   public static class a extends eln.a<ele.a> {
      private final Builder<eln> a = ImmutableList.builder();

      public a(eln.a<?>... $$0) {
         for (eln.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ele.a a() {
         return this;
      }

      @Override
      public ele.a a(eln.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eln b() {
         return new ele(this.a.build(), this.f());
      }
   }
}
