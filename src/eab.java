import com.google.common.collect.Lists;
import java.util.List;

public class eab extends dzy {
   eab(eaf[] $$0, eck[] $$1) {
      super($$0, $$1);
   }

   @Override
   public eag a() {
      return ead.h;
   }

   @Override
   protected dzx a(dzx[] $$0) {
      switch ($$0.length) {
         case 0:
            return b;
         case 1:
            return $$0[0];
         case 2:
            dzx $$1 = $$0[0];
            dzx $$2 = $$0[1];
            return ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         default:
            return ($$1x, $$2x) -> {
               for (dzx $$3 : $$0) {
                  $$3.expand($$1x, $$2x);
               }

               return true;
            };
      }
   }

   public static eab.a a(eaf.a<?>... $$0) {
      return new eab.a($$0);
   }

   public static class a extends eaf.a<eab.a> {
      private final List<eaf> a = Lists.newArrayList();

      public a(eaf.a<?>... $$0) {
         for (eaf.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eab.a a() {
         return this;
      }

      @Override
      public eab.a b(eaf.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eaf b() {
         return new eab(this.a.toArray(new eaf[0]), this.f());
      }
   }
}
