import java.util.Map;

public record dep(int a, Map<der, Integer> b, int c, jr<avz> d, float e, float f, axf<cwl> g, akt<des> h) {
   public cwl.a a(cwl.a $$0, der $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(kv.D, deu.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cwl.a a(cwl.a $$0, jv<bur<?>> $$1) {
      return $$0.b(der.e.a(this.a)).a(this.a(der.e)).a(this.g).a(kv.D, deu.a(bus.g).a(this.d).a(this.h).a($$1).a());
   }

   public cwl.a a(cwl.a $$0, jr<avz> $$1, boolean $$2, jv<bur<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(der.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(der.e)).a(kv.D, deu.a(bus.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   private czg a(der $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      czg.a $$2 = czg.a();
      but $$3 = but.a($$0.a());
      aku $$4 = aku.b("armor." + $$0.b());
      $$2.a(bwo.a, new bwm($$4, (double)$$1, bwm.a.a), $$3);
      $$2.a(bwo.b, new bwm($$4, (double)this.e, bwm.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bwo.p, new bwm($$4, (double)this.f, bwm.a.a), $$3);
      }

      return $$2.a();
   }
}
