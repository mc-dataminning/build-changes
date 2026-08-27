import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class edh extends ede {
   public static final Codec<edh> a = a(edh::new);

   edh(List<edl> $$0, List<efr> $$1) {
      super($$0, $$1);
   }

   @Override
   public edm a() {
      return edj.i;
   }

   @Override
   protected edd a(List<? extends edd> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (edd)$$0.get(0);
         case 2 -> {
            edd $$1 = $$0.get(0);
            edd $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (edd $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static edh.a a(edl.a<?>... $$0) {
      return new edh.a($$0);
   }

   public static class a extends edl.a<edh.a> {
      private final Builder<edl> a = ImmutableList.builder();

      public a(edl.a<?>... $$0) {
         for (edl.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edh.a a() {
         return this;
      }

      @Override
      public edh.a b(edl.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edl b() {
         return new edh(this.a.build(), this.f());
      }
   }
}
