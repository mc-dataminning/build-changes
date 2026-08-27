import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class enu extends enw {
   public static final Codec<enu> a = a(enu::new);

   enu(List<eod> $$0, List<eql> $$1) {
      super($$0, $$1);
   }

   @Override
   public eoe a() {
      return eob.g;
   }

   @Override
   protected env a(List<? extends env> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (env)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (env $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ent $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static enu.a a(eod.a<?>... $$0) {
      return new enu.a($$0);
   }

   public static <E> enu.a a(Collection<E> $$0, Function<E, eod.a<?>> $$1) {
      return new enu.a($$0.stream().map($$1::apply).toArray(eod.a[]::new));
   }

   public static class a extends eod.a<enu.a> {
      private final Builder<eod> a = ImmutableList.builder();

      public a(eod.a<?>... $$0) {
         for (eod.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected enu.a a() {
         return this;
      }

      @Override
      public enu.a a(eod.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eod b() {
         return new enu(this.a.build(), this.f());
      }
   }
}
