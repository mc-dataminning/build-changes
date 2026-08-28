import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fbn extends fbc {
   public static final MapCodec<fbn> a = a(fbn::new);

   fbn(List<fbj> $$0, List<fec> $$1) {
      super($$0, $$1);
   }

   @Override
   public fbk a() {
      return fbh.h;
   }

   @Override
   protected fbb a(List<? extends fbb> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (fbb)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (fbb $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static fbn.a a(fbj.a<?>... $$0) {
      return new fbn.a($$0);
   }

   public static class a extends fbj.a<fbn.a> {
      private final Builder<fbj> a = ImmutableList.builder();

      public a(fbj.a<?>... $$0) {
         for (fbj.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected fbn.a a() {
         return this;
      }

      @Override
      public fbn.a c(fbj.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public fbj b() {
         return new fbn(this.a.build(), this.f());
      }
   }
}
