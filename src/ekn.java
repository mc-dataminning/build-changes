import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ekn extends ekk {
   public static final Codec<ekn> a = a(ekn::new);

   ekn(List<ekr> $$0, List<emx> $$1) {
      super($$0, $$1);
   }

   @Override
   public eks a() {
      return ekp.i;
   }

   @Override
   protected ekj a(List<? extends ekj> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ekj)$$0.get(0);
         case 2 -> {
            ekj $$1 = $$0.get(0);
            ekj $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ekj $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ekn.a a(ekr.a<?>... $$0) {
      return new ekn.a($$0);
   }

   public static class a extends ekr.a<ekn.a> {
      private final Builder<ekr> a = ImmutableList.builder();

      public a(ekr.a<?>... $$0) {
         for (ekr.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ekn.a a() {
         return this;
      }

      @Override
      public ekn.a b(ekr.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ekr b() {
         return new ekn(this.a.build(), this.f());
      }
   }
}
