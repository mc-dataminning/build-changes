import java.util.List;

public record ah(ali c, ag d) {
   public static final zg<wt, ah> a = zg.a(ali.b, ah::a, ag.b, ah::b, ah::new);
   public static final zg<wt, List<ah>> b = a.a(ze.a());

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ah $$1 && this.c.equals($$1.c)) {
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

   public ali a() {
      return this.c;
   }

   public ag b() {
      return this.d;
   }
}
