import java.util.Map;

public record deo(int a, Map<deq, Integer> b, int c, jr<avz> d, float e, float f, axf<cwk> g, aku<der> h) {
   public cwk.a a(cwk.a $$0, deq $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(kv.D, det.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cwk.a a(cwk.a $$0, jv<bur<?>> $$1) {
      return $$0.b(deq.e.a(this.a)).a(this.a(deq.e)).a(this.g).a(kv.D, det.a(bus.g).a(this.d).a(this.h).a($$1).a());
   }

   public cwk.a a(cwk.a $$0, jr<avz> $$1, boolean $$2, jv<bur<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(deq.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(deq.e)).a(kv.D, det.a(bus.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   private czf a(deq $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      czf.a $$2 = czf.a();
      but $$3 = but.a($$0.a());
      akv $$4 = akv.b("armor." + $$0.b());
      $$2.a(bwo.a, new bwm($$4, (double)$$1, bwm.a.a), $$3);
      $$2.a(bwo.b, new bwm($$4, (double)this.e, bwm.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bwo.p, new bwm($$4, (double)this.f, bwm.a.a), $$3);
      }

      return $$2.a();
   }
}
