import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class enq extends enn {
   public static final Codec<enq> a = a(enq::new);

   enq(List<enu> $$0, List<eqc> $$1) {
      super($$0, $$1);
   }

   @Override
   public env a() {
      return ens.i;
   }

   @Override
   protected enm a(List<? extends enm> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (enm)$$0.get(0);
         case 2 -> {
            enm $$1 = $$0.get(0);
            enm $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (enm $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static enq.a a(enu.a<?>... $$0) {
      return new enq.a($$0);
   }

   public static class a extends enu.a<enq.a> {
      private final Builder<enu> a = ImmutableList.builder();

      public a(enu.a<?>... $$0) {
         for (enu.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected enq.a a() {
         return this;
      }

      @Override
      public enq.a b(enu.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public enu b() {
         return new enq(this.a.build(), this.f());
      }
   }
}
