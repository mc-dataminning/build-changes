import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class euw extends eul {
   public static final MapCodec<euw> a = a(euw::new);

   euw(List<eus> $$0, List<exn> $$1) {
      super($$0, $$1);
   }

   @Override
   public eut a() {
      return euq.h;
   }

   @Override
   protected euk a(List<? extends euk> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (euk)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (euk $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static euw.a a(eus.a<?>... $$0) {
      return new euw.a($$0);
   }

   public static class a extends eus.a<euw.a> {
      private final Builder<eus> a = ImmutableList.builder();

      public a(eus.a<?>... $$0) {
         for (eus.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected euw.a a() {
         return this;
      }

      @Override
      public euw.a c(eus.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eus b() {
         return new euw(this.a.build(), this.f());
      }
   }
}
