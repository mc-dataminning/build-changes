import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ekv extends ekk {
   public static final Codec<ekv> a = a(ekv::new);

   ekv(List<ekr> $$0, List<emx> $$1) {
      super($$0, $$1);
   }

   @Override
   public eks a() {
      return ekp.h;
   }

   @Override
   protected ekj a(List<? extends ekj> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ekj)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ekj $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ekv.a a(ekr.a<?>... $$0) {
      return new ekv.a($$0);
   }

   public static class a extends ekr.a<ekv.a> {
      private final Builder<ekr> a = ImmutableList.builder();

      public a(ekr.a<?>... $$0) {
         for (ekr.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ekv.a a() {
         return this;
      }

      @Override
      public ekv.a c(ekr.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ekr b() {
         return new ekv(this.a.build(), this.f());
      }
   }
}
