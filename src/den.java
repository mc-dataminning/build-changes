import java.util.Map;

public record den(int a, Map<dep, Integer> b, int c, jr<avy> d, float e, float f, axe<cwj> g, akt<deq> h) {
   public cwj.a a(cwj.a $$0, dep $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(kv.D, des.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cwj.a a(cwj.a $$0, jv<buq<?>> $$1) {
      return $$0.b(dep.e.a(this.a)).a(this.a(dep.e)).a(this.g).a(kv.D, des.a(bur.g).a(this.d).a(this.h).a($$1).a());
   }

   public cwj.a a(cwj.a $$0, jr<avy> $$1, boolean $$2, jv<buq<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(dep.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(dep.e)).a(kv.D, des.a(bur.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   private cze a(dep $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      cze.a $$2 = cze.a();
      bus $$3 = bus.a($$0.a());
      aku $$4 = aku.b("armor." + $$0.b());
      $$2.a(bwn.a, new bwl($$4, (double)$$1, bwl.a.a), $$3);
      $$2.a(bwn.b, new bwl($$4, (double)this.e, bwl.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bwn.p, new bwl($$4, (double)this.f, bwl.a.a), $$3);
      }

      return $$2.a();
   }
}
