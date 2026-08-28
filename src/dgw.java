import java.util.Map;

public record dgw(int a, Map<dgy, Integer> b, int c, je<awk> d, float e, float f, axp<cyo> g, ald<dgz> h) {
   public dbj a(dgy $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dbj.a $$2 = dbj.a();
      bwl $$3 = bwl.a($$0.a());
      ale $$4 = ale.b("armor." + $$0.b());
      $$2.a(byf.a, new byd($$4, (double)$$1, byd.a.a), $$3);
      $$2.a(byf.b, new byd($$4, (double)this.e, byd.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(byf.p, new byd($$4, (double)this.f, byd.a.a), $$3);
      }

      return $$2.a();
   }
}
