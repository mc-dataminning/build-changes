import com.mojang.serialization.Codec;

public record dbb(cxy c) {
   public static final Codec<dbb> a = cxy.b.xmap(dbb::new, dbb::a);
   public static final yt<wg, dbb> b = yt.a(cxy.i, dbb::a, dbb::new);

   public cxy a(cxy $$0, int $$1, boolean $$2, dbb.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cxy $$4 = this.c.v();
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
         dbb $$1 = (dbb)$$0;
         return cxy.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxy.b(this.c);
   }

   public cxy a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cxy var1);
   }
}
