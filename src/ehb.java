import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehb extends egq {
   public static final Codec<ehb> a = a(ehb::new);

   ehb(List<egx> $$0, List<ejd> $$1) {
      super($$0, $$1);
   }

   @Override
   public egy a() {
      return egv.h;
   }

   @Override
   protected egp a(List<? extends egp> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (egp)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (egp $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ehb.a a(egx.a<?>... $$0) {
      return new ehb.a($$0);
   }

   public static class a extends egx.a<ehb.a> {
      private final Builder<egx> a = ImmutableList.builder();

      public a(egx.a<?>... $$0) {
         for (egx.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehb.a a() {
         return this;
      }

      @Override
      public ehb.a c(egx.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public egx b() {
         return new ehb(this.a.build(), this.f());
      }
   }
}
