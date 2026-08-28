import com.mojang.serialization.Codec;

public record dcu(czn c) {
   public static final Codec<dcu> a = czn.b.xmap(dcu::new, dcu::a);
   public static final yw<wj, dcu> b = yw.a(czn.i, dcu::a, dcu::new);

   public czn a(czn $$0, int $$1, boolean $$2, dcu.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         czn $$4 = this.c.v();
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
         dcu $$1 = (dcu)$$0;
         return czn.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return czn.b(this.c);
   }

   public czn a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(czn var1);
   }
}
