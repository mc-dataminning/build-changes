import com.mojang.serialization.Codec;

public record ddf(czy c) {
   public static final Codec<ddf> a = czy.b.xmap(ddf::new, ddf::a);
   public static final yy<wl, ddf> b = yy.a(czy.i, ddf::a, ddf::new);

   public czy a(czy $$0, int $$1, boolean $$2, ddf.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         czy $$4 = this.c.v();
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
         ddf $$1 = (ddf)$$0;
         return czy.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return czy.b(this.c);
   }

   public czy a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(czy var1);
   }
}
