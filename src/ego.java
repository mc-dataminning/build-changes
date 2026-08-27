import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class ego extends egq {
   public static final Codec<ego> a = a(ego::new);

   ego(List<egx> $$0, List<ejd> $$1) {
      super($$0, $$1);
   }

   @Override
   public egy a() {
      return egv.g;
   }

   @Override
   protected egp a(List<? extends egp> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (egp)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (egp $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(egn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static ego.a a(egx.a<?>... $$0) {
      return new ego.a($$0);
   }

   public static <E> ego.a a(Collection<E> $$0, Function<E, egx.a<?>> $$1) {
      return new ego.a($$0.stream().map($$1::apply).toArray(egx.a[]::new));
   }

   public static class a extends egx.a<ego.a> {
      private final Builder<egx> a = ImmutableList.builder();

      public a(egx.a<?>... $$0) {
         for (egx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ego.a a() {
         return this;
      }

      @Override
      public ego.a a(egx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public egx b() {
         return new ego(this.a.build(), this.f());
      }
   }
}
