import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class enl extends enn {
   public static final Codec<enl> a = a(enl::new);

   enl(List<enu> $$0, List<eqc> $$1) {
      super($$0, $$1);
   }

   @Override
   public env a() {
      return ens.g;
   }

   @Override
   protected enm a(List<? extends enm> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (enm)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (enm $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(enk $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static enl.a a(enu.a<?>... $$0) {
      return new enl.a($$0);
   }

   public static <E> enl.a a(Collection<E> $$0, Function<E, enu.a<?>> $$1) {
      return new enl.a($$0.stream().map($$1::apply).toArray(enu.a[]::new));
   }

   public static class a extends enu.a<enl.a> {
      private final Builder<enu> a = ImmutableList.builder();

      public a(enu.a<?>... $$0) {
         for (enu.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected enl.a a() {
         return this;
      }

      @Override
      public enl.a a(enu.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public enu b() {
         return new enl(this.a.build(), this.f());
      }
   }
}
