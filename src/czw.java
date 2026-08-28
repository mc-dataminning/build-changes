import com.mojang.serialization.Codec;

public record czw(cwq c) {
   public static final Codec<czw> a = cwq.a.xmap(czw::new, czw::a);
   public static final yn<wa, czw> b = yn.a(cwq.h, czw::a, czw::new);

   public cwq a(cwq $$0, int $$1, boolean $$2, czw.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cwq $$4 = this.c.v();
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
         czw $$1 = (czw)$$0;
         return cwq.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwq.a(this.c);
   }

   public cwq a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cwq var1);
   }
}
