import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class euf extends etu {
   public static final MapCodec<euf> a = a(euf::new);

   euf(List<eub> $$0, List<eww> $$1) {
      super($$0, $$1);
   }

   @Override
   public euc a() {
      return etz.h;
   }

   @Override
   protected ett a(List<? extends ett> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ett)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ett $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static euf.a a(eub.a<?>... $$0) {
      return new euf.a($$0);
   }

   public static class a extends eub.a<euf.a> {
      private final Builder<eub> a = ImmutableList.builder();

      public a(eub.a<?>... $$0) {
         for (eub.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected euf.a a() {
         return this;
      }

      @Override
      public euf.a c(eub.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eub b() {
         return new euf(this.a.build(), this.f());
      }
   }
}
