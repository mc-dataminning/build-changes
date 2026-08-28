import com.mojang.serialization.Codec;

public record dcf(cyy c) {
   public static final Codec<dcf> a = cyy.b.xmap(dcf::new, dcf::a);
   public static final yw<wj, dcf> b = yw.a(cyy.i, dcf::a, dcf::new);

   public cyy a(cyy $$0, int $$1, boolean $$2, dcf.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cyy $$4 = this.c.v();
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
         dcf $$1 = (dcf)$$0;
         return cyy.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cyy.b(this.c);
   }

   public cyy a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cyy var1);
   }
}
