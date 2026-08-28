import java.util.List;

public record ftb(btd<gty> a) {
   public ftb(btd<gty> a) {
      if (a.c()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   public ftb a(gtz $$0) {
      return new ftb(this.a.a($$0));
   }

   public gtp.b a() {
      List<btc<gty>> $$0 = this.a.d();
      return (gtp.b)($$0.size() == 1 ? new gtw.a($$0.getFirst().a()) : new hny.a(this.a.a(gtw.a::new)));
   }

   public btd<gty> b() {
      return this.a;
   }
}
