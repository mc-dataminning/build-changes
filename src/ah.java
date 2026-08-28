import java.util.List;

public record ah(alj c, ag d) {
   public static final zh<wu, ah> a = zh.a(alj.b, ah::a, ag.b, ah::b, ah::new);
   public static final zh<wu, List<ah>> b = a.a(zf.a());

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

   public alj a() {
      return this.c;
   }

   public ag b() {
      return this.d;
   }
}
