import java.util.List;

public record af(ajc c, ae d) {
   public static final xq<vd, af> a = xq.a(ajc.b, af::a, ae.b, af::b, af::new);
   public static final xq<vd, List<af>> b = a.a(xo.a());

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof af $$1 && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public String toString() {
      return this.c.toString();
   }

   public ajc a() {
      return this.c;
   }

   public ae b() {
      return this.d;
   }
}
