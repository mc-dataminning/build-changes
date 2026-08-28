import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eww extends ewy {
   public static final MapCodec<eww> a = a(eww::new);

   eww(List<exf> $$0, List<ezy> $$1) {
      super($$0, $$1);
   }

   @Override
   public exg a() {
      return exd.g;
   }

   @Override
   protected ewx a(List<? extends ewx> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ewx)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ewx $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eww.a a(exf.a<?>... $$0) {
      return new eww.a($$0);
   }

   public static <E> eww.a a(Collection<E> $$0, Function<E, exf.a<?>> $$1) {
      return new eww.a($$0.stream().map($$1::apply).toArray(exf.a[]::new));
   }

   public static class a extends exf.a<eww.a> {
      private final Builder<exf> a = ImmutableList.builder();

      public a(exf.a<?>... $$0) {
         for (exf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eww.a a() {
         return this;
      }

      @Override
      public eww.a a(exf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public exf b() {
         return new eww(this.a.build(), this.f());
      }
   }
}
