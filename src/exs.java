import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class exs extends exu {
   public static final MapCodec<exs> a = a(exs::new);

   exs(List<eyb> $$0, List<fau> $$1) {
      super($$0, $$1);
   }

   @Override
   public eyc a() {
      return exz.g;
   }

   @Override
   protected ext a(List<? extends ext> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ext)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ext $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(exr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static exs.a a(eyb.a<?>... $$0) {
      return new exs.a($$0);
   }

   public static <E> exs.a a(Collection<E> $$0, Function<E, eyb.a<?>> $$1) {
      return new exs.a($$0.stream().map($$1::apply).toArray(eyb.a[]::new));
   }

   public static class a extends eyb.a<exs.a> {
      private final Builder<eyb> a = ImmutableList.builder();

      public a(eyb.a<?>... $$0) {
         for (eyb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exs.a a() {
         return this;
      }

      @Override
      public exs.a a(eyb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eyb b() {
         return new exs(this.a.build(), this.f());
      }
   }
}
