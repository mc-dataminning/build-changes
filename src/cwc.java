import java.util.List;

public class cwc extends cvg {
   private static final int d = 32;
   public static final int a = 120000;
   public static final int b = 0;
   public static final int c = 4;

   public cwc(cvg.a $$0) {
      super($$0);
   }

   @Override
   public cvl a(cvl $$0, dds $$1, buf $$2) {
      if ($$2 instanceof arh $$3) {
         an.A.a($$3, $$0);
         $$3.b(awn.c.b(this));
      }

      if (!$$1.B) {
         $$1.a(null, $$2.ds(), awd.ss, $$2.di(), 1.0F, 1.0F);
         Integer $$4 = $$0.a(kr.S, Integer.valueOf(0));
         $$2.b(new bsq(bss.E, 120000, $$4, false, false, true));
      }

      $$0.a(1, $$2);
      return $$0;
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 32;
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.c;
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      return cvn.a($$0, $$1, $$2);
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      Integer $$4 = $$0.a(kr.S, Integer.valueOf(0));
      List<bsq> $$5 = List.of(new bsq(bss.E, 120000, $$4, false, false, true));
      cxn.a($$5, $$2::add, 1.0F, $$1.b());
   }
}
