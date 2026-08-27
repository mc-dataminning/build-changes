import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ejs extends ejh {
   public static final Codec<ejs> a = a(ejs::new);

   ejs(List<ejo> $$0, List<elu> $$1) {
      super($$0, $$1);
   }

   @Override
   public ejp a() {
      return ejm.h;
   }

   @Override
   protected ejg a(List<? extends ejg> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ejg)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (ejg $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ejs.a a(ejo.a<?>... $$0) {
      return new ejs.a($$0);
   }

   public static class a extends ejo.a<ejs.a> {
      private final Builder<ejo> a = ImmutableList.builder();

      public a(ejo.a<?>... $$0) {
         for (ejo.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ejs.a a() {
         return this;
      }

      @Override
      public ejs.a c(ejo.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ejo b() {
         return new ejs(this.a.build(), this.f());
      }
   }
}
