import java.util.List;

public record fsm(btm<gtj> a) {
   public fsm(btm<gtj> a) {
      if (a.c()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.a = a;
      }
   }

   public fsm a(gtk $$0) {
      return new fsm(this.a.a($$0));
   }

   public gta.b a() {
      List<btl<gtj>> $$0 = this.a.d();
      return (gta.b)($$0.size() == 1 ? new gth.a($$0.getFirst().a()) : new hnm.a(this.a.a(gth.a::new)));
   }

   public btm<gtj> b() {
      return this.a;
   }
}
