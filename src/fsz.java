import java.util.List;

public record fsz(btb<gtw> a) {
   public fsz(btb<gtw> a) {
      if (a.c()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   public fsz a(gtx $$0) {
      return new fsz(this.a.a($$0));
   }

   public gtn.b a() {
      List<bta<gtw>> $$0 = this.a.d();
      return (gtn.b)($$0.size() == 1 ? new gtu.a($$0.getFirst().a()) : new hnw.a(this.a.a(gtu.a::new)));
   }

   public btb<gtw> b() {
      return this.a;
   }
}
