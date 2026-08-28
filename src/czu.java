import com.mojang.serialization.Codec;

public record czu(cwo c) {
   public static final Codec<czu> a = cwo.a.xmap(czu::new, czu::a);
   public static final yn<wa, czu> b = yn.a(cwo.h, czu::a, czu::new);

   public cwo a(cwo $$0, int $$1, boolean $$2, czu.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cwo $$4 = this.c.v();
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
         czu $$1 = (czu)$$0;
         return cwo.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwo.a(this.c);
   }

   public cwo a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cwo var1);
   }
}
