import java.util.List;

public record af(aiy c, ae d) {
   public static final xo<vb, af> a = xo.a(aiy.b, af::a, ae.b, af::b, af::new);
   public static final xo<vb, List<af>> b = a.a(xm.a());

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

   public aiy a() {
      return this.c;
   }

   public ae b() {
      return this.d;
   }
}
