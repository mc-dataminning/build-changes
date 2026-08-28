import com.mojang.serialization.Codec;

public record czt(cwn c) {
   public static final Codec<czt> a = cwn.a.xmap(czt::new, czt::a);
   public static final ym<vz, czt> b = ym.a(cwn.h, czt::a, czt::new);

   public cwn a(cwn $$0, int $$1, boolean $$2, czt.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cwn $$4 = this.c.v();
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
         czt $$1 = (czt)$$0;
         return cwn.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwn.a(this.c);
   }

   public cwn a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cwn var1);
   }
}
