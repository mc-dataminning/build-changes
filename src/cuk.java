import java.util.List;

public class cuk extends cun {
   public cuk(cum $$0, csu.a $$1) {
      super($$0, $$1.a(ka.v, i()));
   }

   private static cwc i() {
      return new cwc(List.of(cwc.a.a(List.of(ddg.bs), 15.0F), cwc.a.b(avr.bE, 1.5F)), 1.0F, 2);
   }

   public static cvs a(cum $$0, int $$1, float $$2) {
      return cvs.a()
         .a(bth.c, new btf(e, "Weapon modifier", (double)((float)$$1 + $$0.c()), btf.a.a), brp.b)
         .a(bth.e, new btf(f, "Weapon modifier", (double)$$2, btf.a.a), brp.b)
         .a();
   }

   @Override
   public boolean a(dqh $$0, dad $$1, in $$2, clh $$3) {
      return !$$3.f();
   }

   @Override
   public boolean a(csz $$0, bsa $$1, bsa $$2) {
      $$0.a(1, $$2, bro.a);
      return true;
   }
}
