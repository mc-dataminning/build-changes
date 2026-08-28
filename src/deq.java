import java.util.Map;

public record deq(int a, Map<des, Integer> b, int c, jr<avz> d, float e, float f, axf<cwm> g, aku<det> h) {
   public cwm.a a(cwm.a $$0, des $$1) {
      return $$0.b($$1.a(this.a)).a(this.a($$1)).c(this.c).a(kv.D, dev.a($$1.a()).a(this.d).a(this.h).a()).a(this.g);
   }

   public cwm.a a(cwm.a $$0, jv<but<?>> $$1) {
      return $$0.b(des.e.a(this.a)).a(this.a(des.e)).a(this.g).a(kv.D, dev.a(buu.g).a(this.d).a(this.h).a($$1).a());
   }

   public cwm.a a(cwm.a $$0, jr<avz> $$1, boolean $$2, jv<but<?>> $$3) {
      if ($$2) {
         $$0 = $$0.b(des.e.a(this.a)).a(this.g);
      }

      return $$0.a(this.a(des.e)).a(kv.D, dev.a(buu.g).a($$1).a(this.h).a($$3).c($$2).a());
   }

   private czh a(des $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      czh.a $$2 = czh.a();
      buv $$3 = buv.a($$0.a());
      akv $$4 = akv.b("armor." + $$0.b());
      $$2.a(bwq.a, new bwo($$4, (double)$$1, bwo.a.a), $$3);
      $$2.a(bwq.b, new bwo($$4, (double)this.e, bwo.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bwq.p, new bwo($$4, (double)this.f, bwo.a.a), $$3);
      }

      return $$2.a();
   }
}
