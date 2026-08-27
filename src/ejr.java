import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ejr extends ejo {
   public static final Codec<ejr> a = a(ejr::new);

   ejr(List<ejv> $$0, List<emb> $$1) {
      super($$0, $$1);
   }

   @Override
   public ejw a() {
      return ejt.i;
   }

   @Override
   protected ejn a(List<? extends ejn> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ejn)$$0.get(0);
         case 2 -> {
            ejn $$1 = $$0.get(0);
            ejn $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ejn $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ejr.a a(ejv.a<?>... $$0) {
      return new ejr.a($$0);
   }

   public static class a extends ejv.a<ejr.a> {
      private final Builder<ejv> a = ImmutableList.builder();

      public a(ejv.a<?>... $$0) {
         for (ejv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ejr.a a() {
         return this;
      }

      @Override
      public ejr.a b(ejv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ejv b() {
         return new ejr(this.a.build(), this.f());
      }
   }
}
