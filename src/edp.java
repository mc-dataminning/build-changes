import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edp extends ede {
   public static final Codec<edp> a = a(edp::new);

   edp(List<edl> $$0, List<efr> $$1) {
      super($$0, $$1);
   }

   @Override
   public edm a() {
      return edj.h;
   }

   @Override
   protected edd a(List<? extends edd> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (edd)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (edd $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static edp.a a(edl.a<?>... $$0) {
      return new edp.a($$0);
   }

   public static class a extends edl.a<edp.a> {
      private final Builder<edl> a = ImmutableList.builder();

      public a(edl.a<?>... $$0) {
         for (edl.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edp.a a() {
         return this;
      }

      @Override
      public edp.a c(edl.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edl b() {
         return new edp(this.a.build(), this.f());
      }
   }
}
