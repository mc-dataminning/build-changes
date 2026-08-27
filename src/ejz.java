import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ejz extends ejo {
   public static final Codec<ejz> a = a(ejz::new);

   ejz(List<ejv> $$0, List<emb> $$1) {
      super($$0, $$1);
   }

   @Override
   public ejw a() {
      return ejt.h;
   }

   @Override
   protected ejn a(List<? extends ejn> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ejn)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ejn $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ejz.a a(ejv.a<?>... $$0) {
      return new ejz.a($$0);
   }

   public static class a extends ejv.a<ejz.a> {
      private final Builder<ejv> a = ImmutableList.builder();

      public a(ejv.a<?>... $$0) {
         for (ejv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ejz.a a() {
         return this;
      }

      @Override
      public ejz.a c(ejv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ejv b() {
         return new ejz(this.a.build(), this.f());
      }
   }
}
