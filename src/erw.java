import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class erw extends ery {
   public static final MapCodec<erw> a = a(erw::new);

   erw(List<esf> $$0, List<eva> $$1) {
      super($$0, $$1);
   }

   @Override
   public esg a() {
      return esd.g;
   }

   @Override
   protected erx a(List<? extends erx> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (erx)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (erx $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static erw.a a(esf.a<?>... $$0) {
      return new erw.a($$0);
   }

   public static <E> erw.a a(Collection<E> $$0, Function<E, esf.a<?>> $$1) {
      return new erw.a($$0.stream().map($$1::apply).toArray(esf.a[]::new));
   }

   public static class a extends esf.a<erw.a> {
      private final Builder<esf> a = ImmutableList.builder();

      public a(esf.a<?>... $$0) {
         for (esf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected erw.a a() {
         return this;
      }

      @Override
      public erw.a a(esf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public esf b() {
         return new erw(this.a.build(), this.f());
      }
   }
}
