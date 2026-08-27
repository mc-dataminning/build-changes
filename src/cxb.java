import java.util.function.ToIntFunction;

public class cxb extends csq implements czr {
   public static final int a = 15;
   public static final dge b = dfu.aP;
   public static final dfv c = dfu.C;
   public static final ToIntFunction<dfe> d = $$0 -> $$0.c(b);

   public cxb(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(15)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, c);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if (!$$1.B && $$3.gn()) {
         $$1.a($$2, $$0.a(b), 2);
         return bgt.a;
      } else {
         return bgt.b;
      }
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return $$3.a(cjd.hg) ? ehy.b() : ehy.a();
   }

   @Override
   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return true;
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.a;
   }

   @Override
   public float b(dfe $$0, cow $$1, gw $$2) {
      return 1.0F;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(c) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(b));
   }

   public static cja a(cja $$0, int $$1) {
      if ($$1 != 15) {
         qu $$2 = new qu();
         $$2.a(b.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
