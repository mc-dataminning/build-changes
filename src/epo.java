import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class epo extends epq {
   public static final MapCodec<epo> a = a(epo::new);

   epo(List<epx> $$0, List<esn> $$1) {
      super($$0, $$1);
   }

   @Override
   public epy a() {
      return epv.g;
   }

   @Override
   protected epp a(List<? extends epp> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (epp)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (epp $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(epn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static epo.a a(epx.a<?>... $$0) {
      return new epo.a($$0);
   }

   public static <E> epo.a a(Collection<E> $$0, Function<E, epx.a<?>> $$1) {
      return new epo.a($$0.stream().map($$1::apply).toArray(epx.a[]::new));
   }

   public static class a extends epx.a<epo.a> {
      private final Builder<epx> a = ImmutableList.builder();

      public a(epx.a<?>... $$0) {
         for (epx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected epo.a a() {
         return this;
      }

      @Override
      public epo.a a(epx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epx b() {
         return new epo(this.a.build(), this.f());
      }
   }
}
