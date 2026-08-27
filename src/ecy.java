import com.google.common.collect.Lists;
import java.util.List;

public class ecy extends ecv {
   ecy(edc[] $$0, efh[] $$1) {
      super($$0, $$1);
   }

   @Override
   public edd a() {
      return eda.h;
   }

   @Override
   protected ecu a(ecu[] $$0) {
      switch ($$0.length) {
         case 0:
            return b;
         case 1:
            return $$0[0];
         case 2:
            ecu $$1 = $$0[0];
            ecu $$2 = $$0[1];
            return ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         default:
            return ($$1x, $$2x) -> {
               for (ecu $$3 : $$0) {
                  $$3.expand($$1x, $$2x);
               }

               return true;
            };
      }
   }

   public static ecy.a a(edc.a<?>... $$0) {
      return new ecy.a($$0);
   }

   public static class a extends edc.a<ecy.a> {
      private final List<edc> a = Lists.newArrayList();

      public a(edc.a<?>... $$0) {
         for (edc.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ecy.a a() {
         return this;
      }

      @Override
      public ecy.a b(edc.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edc b() {
         return new ecy(this.a.toArray(new edc[0]), this.f());
      }
   }
}
