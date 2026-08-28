import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eva extends eup {
   public static final MapCodec<eva> a = a(eva::new);

   eva(List<euw> $$0, List<exr> $$1) {
      super($$0, $$1);
   }

   @Override
   public eux a() {
      return euu.h;
   }

   @Override
   protected euo a(List<? extends euo> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (euo)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (euo $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eva.a a(euw.a<?>... $$0) {
      return new eva.a($$0);
   }

   public static class a extends euw.a<eva.a> {
      private final Builder<euw> a = ImmutableList.builder();

      public a(euw.a<?>... $$0) {
         for (euw.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eva.a a() {
         return this;
      }

      @Override
      public eva.a c(euw.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public euw b() {
         return new eva(this.a.build(), this.f());
      }
   }
}
