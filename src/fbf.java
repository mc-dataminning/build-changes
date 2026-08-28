import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbf extends fbc {
   public static final MapCodec<fbf> a = a(fbf::new);

   fbf(List<fbj> $$0, List<fec> $$1) {
      super($$0, $$1);
   }

   @Override
   public fbk a() {
      return fbh.i;
   }

   @Override
   protected fbb a(List<? extends fbb> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (fbb)$$0.get(0);
         case 2 -> {
            fbb $$1 = $$0.get(0);
            fbb $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (fbb $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static fbf.a a(fbj.a<?>... $$0) {
      return new fbf.a($$0);
   }

   public static class a extends fbj.a<fbf.a> {
      private final Builder<fbj> a = ImmutableList.builder();

      public a(fbj.a<?>... $$0) {
         for (fbj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fbf.a a() {
         return this;
      }

      @Override
      public fbf.a b(fbj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fbj b() {
         return new fbf(this.a.build(), this.f());
      }
   }
}
