import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class epf extends eou {
   public static final Codec<epf> a = a(epf::new);

   epf(List<epb> $$0, List<erq> $$1) {
      super($$0, $$1);
   }

   @Override
   public epc a() {
      return eoz.h;
   }

   @Override
   protected eot a(List<? extends eot> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eot)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (eot $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static epf.a a(epb.a<?>... $$0) {
      return new epf.a($$0);
   }

   public static class a extends epb.a<epf.a> {
      private final Builder<epb> a = ImmutableList.builder();

      public a(epb.a<?>... $$0) {
         for (epb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected epf.a a() {
         return this;
      }

      @Override
      public epf.a c(epb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public epb b() {
         return new epf(this.a.build(), this.f());
      }
   }
}
