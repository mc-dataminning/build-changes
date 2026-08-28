import java.util.List;

public record ah(all c, ag d) {
   public static final zj<ww, ah> a = zj.a(all.b, ah::a, ag.b, ah::b, ah::new);
   public static final zj<ww, List<ah>> b = a.a(zh.a());

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

   public all a() {
      return this.c;
   }

   public ag b() {
      return this.d;
   }
}
