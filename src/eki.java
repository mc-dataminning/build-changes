import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class eki extends ekk {
   public static final Codec<eki> a = a(eki::new);

   eki(List<ekr> $$0, List<emx> $$1) {
      super($$0, $$1);
   }

   @Override
   public eks a() {
      return ekp.g;
   }

   @Override
   protected ekj a(List<? extends ekj> $$0) {
      return switch ($$0.size()) {
         case 0 -> b;
         case 1 -> (ekj)$$0.get(0);
         case 2 -> $$0.get(0).or($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ekj $$3 : $$0) {
            if ($$3.expand($$1, $$2)) {
               return true;
            }
         }

         return false;
      };
      };
   }

   @Override
   public void a(ekh $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.d.size() - 1; $$1++) {
         if (this.d.get($$1).e.isEmpty()) {
            $$0.b("Unreachable entry!");
         }
      }
   }

   public static eki.a a(ekr.a<?>... $$0) {
      return new eki.a($$0);
   }

   public static <E> eki.a a(Collection<E> $$0, Function<E, ekr.a<?>> $$1) {
      return new eki.a($$0.stream().map($$1::apply).toArray(ekr.a[]::new));
   }

   public static class a extends ekr.a<eki.a> {
      private final Builder<ekr> a = ImmutableList.builder();

      public a(ekr.a<?>... $$0) {
         for (ekr.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eki.a a() {
         return this;
      }

      @Override
      public eki.a a(ekr.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ekr b() {
         return new eki(this.a.build(), this.f());
      }
   }
}
