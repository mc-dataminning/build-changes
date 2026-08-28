import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eyz extends eyw {
   public static final MapCodec<eyz> a = a(eyz::new);

   eyz(List<ezd> $$0, List<fbw> $$1) {
      super($$0, $$1);
   }

   @Override
   public eze a() {
      return ezb.i;
   }

   @Override
   protected eyv a(List<? extends eyv> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eyv)$$0.get(0);
         case 2 -> {
            eyv $$1 = $$0.get(0);
            eyv $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eyv $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eyz.a a(ezd.a<?>... $$0) {
      return new eyz.a($$0);
   }

   public static class a extends ezd.a<eyz.a> {
      private final Builder<ezd> a = ImmutableList.builder();

      public a(ezd.a<?>... $$0) {
         for (ezd.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eyz.a a() {
         return this;
      }

      @Override
      public eyz.a b(ezd.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ezd b() {
         return new eyz(this.a.build(), this.f());
      }
   }
}
