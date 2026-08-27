import javax.annotation.Nullable;

public class cva extends cwd {
   public static final dfw<dfj> I = dfo.U;

   protected cva(dex.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cpn $$0, gv $$1, hb $$2) {
      gv $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      for (hb $$1 : $$0.f()) {
         dey $$2;
         if ($$1.o() == hb.a.b) {
            $$2 = this.n().a(I, $$1 == hb.b ? dfj.c : dfj.a).a(aC, $$0.g());
         } else {
            $$2 = this.n().a(I, dfj.b).a(aC, $$1.g());
         }

         if ($$2.a((cpn)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static hb h(dey $$0) {
      switch ((dfj)$$0.c(I)) {
         case c:
            return hb.a;
         case a:
            return hb.b;
         default:
            return $$0.c(aC);
      }
   }
}
