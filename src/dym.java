import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dym extends dyu<eau> {
   private static final ImmutableList<dcv> a = ImmutableList.of(dcx.F, dcx.fn, dcx.fo, dcx.fp, dcx.fq, dcx.cv, dcx.ct);
   private static final ir[] b = ir.values();
   private static final double c = 0.9;

   public dym(Codec<eau> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<eau> $$0) {
      boolean $$1 = false;
      ayd $$2 = $$0.d();
      dap $$3 = $$0.b();
      eau $$4 = $$0.f();
      im $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (im $$13 : im.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            im $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(czv $$0, im $$1, eau $$2) {
      dpy $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ir $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ir.b || !$$5 && $$4 == ir.b) {
               return false;
            }
         }

         return true;
      }
   }
}
