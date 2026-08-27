import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eef extends edu {
   public static final Codec<eef> a = a(eef::new);

   eef(List<eeb> $$0, List<egh> $$1) {
      super($$0, $$1);
   }

   @Override
   public eec a() {
      return edz.h;
   }

   @Override
   protected edt a(List<? extends edt> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (edt)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (edt $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eef.a a(eeb.a<?>... $$0) {
      return new eef.a($$0);
   }

   public static class a extends eeb.a<eef.a> {
      private final Builder<eeb> a = ImmutableList.builder();

      public a(eeb.a<?>... $$0) {
         for (eeb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eef.a a() {
         return this;
      }

      @Override
      public eef.a c(eeb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eeb b() {
         return new eef(this.a.build(), this.f());
      }
   }
}
