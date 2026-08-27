import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ejk extends ejh {
   public static final Codec<ejk> a = a(ejk::new);

   ejk(List<ejo> $$0, List<elu> $$1) {
      super($$0, $$1);
   }

   @Override
   public ejp a() {
      return ejm.i;
   }

   @Override
   protected ejg a(List<? extends ejg> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ejg)$$0.get(0);
         case 2 -> {
            ejg $$1 = $$0.get(0);
            ejg $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ejg $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ejk.a a(ejo.a<?>... $$0) {
      return new ejk.a($$0);
   }

   public static class a extends ejo.a<ejk.a> {
      private final Builder<ejo> a = ImmutableList.builder();

      public a(ejo.a<?>... $$0) {
         for (ejo.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ejk.a a() {
         return this;
      }

      @Override
      public ejk.a b(ejo.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ejo b() {
         return new ejk(this.a.build(), this.f());
      }
   }
}
