import java.util.List;

public record af(akf c, ae d) {
   public static final yq<wd, af> a = yq.a(akf.b, af::a, ae.b, af::b, af::new);
   public static final yq<wd, List<af>> b = a.a(yo.a());

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

   public akf a() {
      return this.c;
   }

   public ae b() {
      return this.d;
   }
}
