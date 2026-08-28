import java.util.List;

public record ah(alp c, ag d) {
   public static final zi<wv, ah> a = zi.a(alp.b, ah::a, ag.b, ah::b, ah::new);
   public static final zi<wv, List<ah>> b = a.a(zg.a());

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

   public alp a() {
      return this.c;
   }

   public ag b() {
      return this.d;
   }
}
