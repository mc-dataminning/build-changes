import com.mojang.serialization.Codec;

public record czs(cwm c) {
   public static final Codec<czs> a = cwm.b.xmap(czs::new, czs::a);
   public static final zh<wu, czs> b = zh.a(cwm.i, czs::a, czs::new);

   public cwm a(cwm $$0, int $$1, boolean $$2, czs.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.L() >= $$1) {
         return $$0;
      } else {
         cwm $$4 = this.c.v();
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
         czs $$1 = (czs)$$0;
         return cwm.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cwm.a(this.c);
   }

   public cwm a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cwm var1);
   }
}
