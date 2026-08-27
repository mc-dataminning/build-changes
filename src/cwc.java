import java.util.List;

public class cwc extends cwf {
   public cwc(cwe $$0, cuc.a $$1) {
      super($$0, $$1.a(ke.v, h()));
   }

   private static cxw h() {
      return new cxw(List.of(cxw.a.a(List.of(dfe.cc), 15.0F), cxw.a.b(awe.bH, 1.5F)), 1.0F, 2);
   }

   public static cxl a(cwe $$0, int $$1, float $$2) {
      return cxl.a()
         .a(btv.c, new btt(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), btt.a.a), bsd.b)
         .a(btv.e, new btt(f, "Weapon modifier", (double)$$2, btt.a.a), bsd.b)
         .a();
   }

   @Override
   public boolean a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(cuh $$0, bso $$1, bso $$2) {
      $$0.a(1, $$2, bsc.a);
      return true;
   }
}
