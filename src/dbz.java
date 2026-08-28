import com.mojang.serialization.Codec;

public record dbz(cys c) {
   public static final Codec<dbz> a = cys.b.xmap(dbz::new, dbz::a);
   public static final yu<wh, dbz> b = yu.a(cys.i, dbz::a, dbz::new);

   public cys a(cys $$0, int $$1, boolean $$2, dbz.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cys $$4 = this.c.v();
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
         dbz $$1 = (dbz)$$0;
         return cys.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cys.b(this.c);
   }

   public cys a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cys var1);
   }
}
