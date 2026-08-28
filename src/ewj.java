import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewj extends evy {
   public static final MapCodec<ewj> a = a(ewj::new);

   ewj(List<ewf> $$0, List<eyy> $$1) {
      super($$0, $$1);
   }

   @Override
   public ewg a() {
      return ewd.h;
   }

   @Override
   protected evx a(List<? extends evx> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (evx)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (evx $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static ewj.a a(ewf.a<?>... $$0) {
      return new ewj.a($$0);
   }

   public static class a extends ewf.a<ewj.a> {
      private final Builder<ewf> a = ImmutableList.builder();

      public a(ewf.a<?>... $$0) {
         for (ewf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ewj.a a() {
         return this;
      }

      @Override
      public ewj.a c(ewf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ewf b() {
         return new ewj(this.a.build(), this.f());
      }
   }
}
