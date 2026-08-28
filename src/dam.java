import com.mojang.serialization.Codec;

public record dam(cxg c) {
   public static final Codec<dam> a = cxg.a.xmap(dam::new, dam::a);
   public static final zi<wv, dam> b = zi.a(cxg.h, dam::a, dam::new);

   public cxg a(cxg $$0, int $$1, boolean $$2, dam.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cxg $$4 = this.c.v();
         if ($$0.f()) {
            return $$4;
         } else {
            $$3.apply($$4);
            return $$0;
         }
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         dam $$1 = (dam)$$0;
         return cxg.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxg.a(this.c);
   }

   public cxg a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cxg var1);
   }
}
