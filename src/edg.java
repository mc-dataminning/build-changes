import com.google.common.collect.Lists;
import java.util.List;

public class edg extends ecv {
   edg(edc[] $$0, efh[] $$1) {
      super($$0, $$1);
   }

   @Override
   public edd a() {
      return eda.g;
   }

   @Override
   protected ecu a(ecu[] $$0) {
      switch ($$0.length) {
         case 0:
            return b;
         case 1:
            return $$0[0];
         case 2:
            return $$0[0].and($$0[1]);
         default:
            return ($$1, $$2) -> {
               for (ecu $$3 : $$0) {
                  if (!$$3.expand($$1, $$2)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }

   public static edg.a a(edc.a<?>... $$0) {
      return new edg.a($$0);
   }

   public static class a extends edc.a<edg.a> {
      private final List<edc> a = Lists.newArrayList();

      public a(edc.a<?>... $$0) {
         for (edc.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected edg.a a() {
         return this;
      }

      @Override
      public edg.a c(edc.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public edc b() {
         return new edg(this.a.toArray(new edc[0]), this.f());
      }
   }
}
