import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eox extends eou {
   public static final Codec<eox> a = a(eox::new);

   eox(List<epb> $$0, List<erq> $$1) {
      super($$0, $$1);
   }

   @Override
   public epc a() {
      return eoz.i;
   }

   @Override
   protected eot a(List<? extends eot> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eot)$$0.get(0);
         case 2 -> {
            eot $$1 = $$0.get(0);
            eot $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eot $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static eox.a a(epb.a<?>... $$0) {
      return new eox.a($$0);
   }

   public static class a extends epb.a<eox.a> {
      private final Builder<epb> a = ImmutableList.builder();

      public a(epb.a<?>... $$0) {
         for (epb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eox.a a() {
         return this;
      }

      @Override
      public eox.a b(epb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epb b() {
         return new eox(this.a.build(), this.f());
      }
   }
}
