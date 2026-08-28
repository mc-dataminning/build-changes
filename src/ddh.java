import com.mojang.serialization.Codec;

public record ddh(daa c) {
   public static final Codec<ddh> a = daa.b.xmap(ddh::new, ddh::a);
   public static final za<wn, ddh> b = za.a(daa.i, ddh::a, ddh::new);

   public daa a(daa $$0, int $$1, boolean $$2, ddh.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         daa $$4 = this.c.v();
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
         ddh $$1 = (ddh)$$0;
         return daa.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return daa.b(this.c);
   }

   public daa a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(daa var1);
   }
}
