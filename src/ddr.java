import com.mojang.serialization.Codec;

public record ddr(dak c) {
   public static final Codec<ddr> a = dak.b.xmap(ddr::new, ddr::a);
   public static final ze<wp, ddr> b = ze.a(dak.j, ddr::a, ddr::new);

   public dak a(dak $$0, int $$1, boolean $$2, ddr.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         dak $$4 = this.c.v();
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
         ddr $$1 = (ddr)$$0;
         return dak.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return dak.b(this.c);
   }

   public dak a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(dak var1);
   }
}
