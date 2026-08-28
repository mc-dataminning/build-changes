import com.mojang.serialization.Codec;

public record daq(cxk c) {
   public static final Codec<daq> a = cxk.b.xmap(daq::new, daq::a);
   public static final zt<xg, daq> b = zt.a(cxk.i, daq::a, daq::new);

   public cxk a(cxk $$0, int $$1, boolean $$2, daq.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.L() >= $$1) {
         return $$0;
      } else {
         cxk $$4 = this.c.v();
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
         daq $$1 = (daq)$$0;
         return cxk.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxk.a(this.c);
   }

   public cxk a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cxk var1);
   }
}
