import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class euo extends eul {
   public static final MapCodec<euo> a = a(euo::new);

   euo(List<eus> $$0, List<exn> $$1) {
      super($$0, $$1);
   }

   @Override
   public eut a() {
      return euq.i;
   }

   @Override
   protected euk a(List<? extends euk> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (euk)$$0.get(0);
         case 2 -> {
            euk $$1 = $$0.get(0);
            euk $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (euk $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static euo.a a(eus.a<?>... $$0) {
      return new euo.a($$0);
   }

   public static class a extends eus.a<euo.a> {
      private final Builder<eus> a = ImmutableList.builder();

      public a(eus.a<?>... $$0) {
         for (eus.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected euo.a a() {
         return this;
      }

      @Override
      public euo.a b(eus.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eus b() {
         return new euo(this.a.build(), this.f());
      }
   }
}
