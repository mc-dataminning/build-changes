import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezh extends eyw {
   public static final MapCodec<ezh> a = a(ezh::new);

   ezh(List<ezd> $$0, List<fbw> $$1) {
      super($$0, $$1);
   }

   @Override
   public eze a() {
      return ezb.h;
   }

   @Override
   protected eyv a(List<? extends eyv> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eyv)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eyv $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ezh.a a(ezd.a<?>... $$0) {
      return new ezh.a($$0);
   }

   public static class a extends ezd.a<ezh.a> {
      private final Builder<ezd> a = ImmutableList.builder();

      public a(ezd.a<?>... $$0) {
         for (ezd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ezh.a a() {
         return this;
      }

      @Override
      public ezh.a c(ezd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezd b() {
         return new ezh(this.a.build(), this.f());
      }
   }
}
